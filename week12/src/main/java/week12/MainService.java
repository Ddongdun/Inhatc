package week12;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainService implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		return "menu";
	}

}
