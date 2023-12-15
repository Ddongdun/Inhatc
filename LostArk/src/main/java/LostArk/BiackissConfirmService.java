package LostArk;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BiackissConfirmService implements CommandHandler{
	private LostArkDao loadao;

	public BiackissConfirmService() {
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
			nextPage = "Biackiss";
		} else {
			nextPage = null;
		}
		request.setAttribute("Boss", loa);
		return nextPage;
	}
}
