package week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao {
	//emp table과 관련된 모든 처리를 담당
	private Connection conn = null;
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://54.180.156.172:3306/jspDB";
		String user = "root";
		String password = "andel6520";
		
		Class.forName(jdbcDriver);
		conn = DriverManager.getConnection(jdbcURL, user, password);
		
		return conn;
		
	}
	public ArrayList<Emp> queryEmp() throws ClassNotFoundException, SQLException {
		System.out.println("[EmpDao] queryEmp()");
		ArrayList<Emp> list = new ArrayList<>();
		String sql = "Select * from emp";
		
		conn = getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			Emp emp = new Emp();
			emp.setEmpno(rs.getString("empno"));
			emp.setEmpname(rs.getString("empname"));
			emp.setEmpdept(rs.getString("empdept"));
			emp.setEmpjob(rs.getString("empjob"));
			emp.setEmpsal(rs.getInt("empsal"));
			emp.setEmpimage("empimage");
			list.add(emp);
		}
		
		return list;
	}
	public Emp selectEmp(String empno) throws ClassNotFoundException, SQLException {
		System.out.println("[EmpDao] selectEmp()");
		String sql = "select * from emp where empno = " + empno;
		conn = getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		Emp emp = new Emp();
		while(rs.next()) {
			emp.setEmpno(rs.getString("empno"));
			emp.setEmpname(rs.getString("empname"));
			emp.setEmpdept(rs.getString("empdept"));
			emp.setEmpjob(rs.getString("empjob"));
			emp.setEmpsal(rs.getInt("empsal"));
			emp.setEmpimage("empimage");
		}
		return emp;
	}
	public int insertEmp(Emp emp) throws SQLException, ClassNotFoundException {
		System.out.println("[EmpDao] insertEmp()");
		String sql = "insert into emp values (?, ?, ?, ?, ?, ?)";
		
		conn = getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, emp.getEmpno());
		pstat.setString(2, emp.getEmpname());
		pstat.setString(3, emp.getEmpdept());
		pstat.setString(4, emp.getEmpjob());
		pstat.setInt(5, emp.getEmpsal());
		pstat.setString(6, emp.getEmpimage());
		
		int result = 0;
		result = pstat.executeUpdate();
		
		return result;
	}
}
