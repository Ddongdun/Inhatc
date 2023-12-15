package week12;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryEmpService implements CommandHandler{
	private EmpDao empDao;
	
	public QueryEmpService() {
		empDao = new EmpDao();
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		System.out.println("[QueryEmpService] process()");
		
		//사원 목록 가져오기 => DB 연동
		//서비스 클래스에서는 비즈니스 로직 처리 x
		//비즈니스 로직 처리 =>Dao 클래스
		
		ArrayList<Emp> list= empDao.queryEmp();
		
		request.setAttribute("list", list);
		return "queryEmp_list";
	}

}
