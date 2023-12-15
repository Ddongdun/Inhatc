package LostArk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class LostArkDao {
	private Connection conn = null;
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String jdbcURL = "jdbc:mysql://localhost:3306/jspdb";
		String user = "root";
		String password = "rootpw";
		Class.forName(jdbcDriver);
		conn = DriverManager.getConnection(jdbcURL, user, password);
		return conn;
		
	}
	public ArrayList<LostArk> queryBoss() throws ClassNotFoundException, SQLException {
		System.out.println("[LoaDao] queryBoss()");
		ArrayList<LostArk> list = new ArrayList<>();
		String sql = "Select * from emp";
		conn = getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			LostArk loa = new LostArk();
			loa.setName(rs.getString("name"));
			loa.setPhase(rs.getInt("phase"));
			loa.setDifficult(rs.getString("phase"));
			loa.setLevel(rs.getString("level"));
			loa.setPerson(rs.getString("person"));
			list.add(loa);
		}
		
		return list;
	}
	public LostArk selectBoss(String name) throws ClassNotFoundException, SQLException {
		System.out.println("[LoaDao] selectBoss");
		String sql = "select * from lostark where name = " + "'" + name + "'";
		conn = getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery(sql);
		LostArk loa = new LostArk();
		while(rs.next()) {
			loa.setName(rs.getString("name"));
			loa.setPhase(rs.getInt("phase"));
			loa.setDifficult(rs.getString("difficult"));
			loa.setLevel(rs.getString("level"));
			loa.setPerson(rs.getString("person"));
		}
		System.out.println(loa.getName());
		System.out.println(loa.getPhase());
		System.out.println(loa.getDifficult());
		System.out.println(loa.getLevel());
		System.out.println(loa.getPerson());
		return loa;
	}
	
}
