package LostArk;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValtanConfirmService implements CommandHandler {
	private LostArkDao loadao;

	public ValtanConfirmService() {
		loadao = new LostArkDao();
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException {
		String name = request.getParameter("name");

		LostArk loa = null;
		loa = loadao.selectBoss(name);
		String nextPage = "";
		if (loa != null) {
			nextPage = "Valtan";
		} else {
			nextPage = null;
		}
		request.setAttribute("Boss", loa);
		return nextPage;
	}

}
