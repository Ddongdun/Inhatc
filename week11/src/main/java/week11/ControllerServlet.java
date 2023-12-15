package week11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet(urlPatterns = "*.do", initParams = {@WebInitParam(name = "config", value = "/WEB-INF/commandHandler.properties")})
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//<커맨드, 핸들러클래스> 형식으로 매핑 정보 저장
	private Map<String,CommandHandler> commandHandlerMap = new HashMap<>();
	
	//서블릿을 생성하고 초기화할 때 제일 먼저 호출되는 init 메소드를 이용
	public void init(ServletConfig config)throws ServletException {
		String configFile = config.getInitParameter("config");
		Properties prop = new Properties();
		String configFilePath = config.getServletContext().getRealPath(configFile);
		
		try(FileInputStream fis = new FileInputStream(configFilePath)){
			prop.load(fis);
		} catch(Exception e) {
			throw new ServletException(e);
		}
		
		//속성 파일을 하나씩 읽어서 키(호출패턴)와 실행명령 핸들러 클래스명을 맵에 저장
		Iterator<Object> keyIter = prop.keySet().iterator();
		while(keyIter.hasNext()) {
			String command = (String) keyIter.next();
			String handlerClassName = prop.getProperty(command);
			
			//핸들러 문자열을 실제 클래스 객체로 변환
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				CommandHandler handlerInstance = (CommandHandler) handlerClass.newInstance();
				
				commandHandlerMap.put(command, handlerInstance);
			} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String command = request.getParameter("command");
		
		//getRequestURI() => /week11/hello.do
		String command = request.getRequestURI();
		
		//ContextPath() => /week11
		command = command.substring(request.getContextPath().length() + 1);
		//위 명령을 실행하면 command = hello.do 저장
		CommandHandler handler = commandHandlerMap.get(command);
		
		String viewPage = handler.process(request, response);
		//서블릿에서 데이터 전달 방법
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		rd.forward(request, response);
		
	}

}
