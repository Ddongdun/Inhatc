package week12;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginConfirmService implements CommandHandler{
	private EmpDao empDao;
	public LoginConfirmService() {
		empDao = new EmpDao();
	}
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, IOException {
		String empno = request.getParameter("empno");
		Emp emp = empDao.selectEmp(empno);
		HttpSession session = request.getSession();
		if(emp != null) {
			session.setAttribute("id", empno);
		}
		return "menu";
	}

}
