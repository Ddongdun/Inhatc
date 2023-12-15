package week12;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InquiryEmpConfirmService implements CommandHandler{
	
	private EmpDao empDao;
	
	public InquiryEmpConfirmService() {
		empDao = new EmpDao();
	}
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, IOException {

		String empno = request.getParameter("empno");
		
		Emp emp = null;
		emp = empDao.selectEmp(empno);
		String nextPage = "inquiryEmp_ok";
		if(emp == null) {
			nextPage = "inquiryEmp_err";
		}
		request.setAttribute("emp", emp);
		return nextPage;
	}

}
