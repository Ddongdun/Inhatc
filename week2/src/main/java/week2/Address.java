package week2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Address
 */
@WebServlet("/Address")
public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Address() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//인코딩
		String name = request.getParameter("name");
		//객체를 통해 이름을 전달받음
		String addr = request.getParameter("addr");
		//객체를 통해 주소를 전달받음
		
		PrintWriter out = response.getWriter();
		//응답 전송 객체 선언
		out.println("<html><body>");
		//태그 선언
		out.println(name + "님은" + addr + "에 사는군요");
		//받아온 값 출력
		out.println("</body></html>");
		//태그 닫기
		out.close();
		//객체 종료
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		//post 방식의 인코딩
		doGet(request, response);
		//get에 적어놓은 메소드들을 불러온다
	}

}
