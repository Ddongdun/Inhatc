package week12;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class InputEmpConfirmService implements CommandHandler{

	//회원등록을 위한 데이터를 DB 연동해서 처리
	
	private EmpDao empDao;
	
	public InputEmpConfirmService() {
		empDao = new EmpDao();
	}
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, IOException {
		
		System.out.println("[InputEmpConfirmService] process()");
		
//		String empno = request.getParameter("empno");
//		String empname = request.getParameter("empname");
//		String empdept = request.getParameter("empdept");
//		String empjob = request.getParameter("empjob");
//		int empsal = Integer.parseInt(request.getParameter("empsal"));
		
		//MultipartRequest 객체로 요청 파라미터를 처리
		String folder = "/images";
		String realPath = request.getRealPath(folder);
		int max = 10*1024*1024;
		MultipartRequest mr = new MultipartRequest(request, realPath, max, "utf-8", new DefaultFileRenamePolicy());
		
		String empno = mr.getParameter("empno");
		String empname = mr.getParameter("empname");
		String empdept = mr.getParameter("empdept");
		String empjob = mr.getParameter("empjob");
		int empsal = Integer.parseInt(mr.getParameter("empsal"));
		String empimage = mr.getFilesystemName("empimage");
		
		//사원번호가 이미 등록되어 있는지 체크
		
		Emp emp = empDao.selectEmp(empno);
		
		String nextPage = null;
		
		if(emp.getEmpno() != null) {
			nextPage = "inputEmp_exist";
		}
		else {
			emp.setEmpno(empno);
			emp.setEmpname(empname);
			emp.setEmpdept(empdept);
			emp.setEmpjob(empjob);
			emp.setEmpsal(empsal);
			emp.setEmpimage(empimage);
			
			int result = empDao.insertEmp(emp);
			
			if(result > 0) {
				nextPage = "inputEmp_ok";
			}
			else {
				nextPage = "inputEmp_err";
			}
		}
		return nextPage;
		
	}

}
