package week12;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IndexService implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, IOException {
		// 로그인이 되었는지 확인해서 페이지를 연결
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		String nextPage = null;
		if (id == null) {
			nextPage = "welcome";
		} else {
			nextPage = "menu";
		}
		return nextPage;
	}

}
