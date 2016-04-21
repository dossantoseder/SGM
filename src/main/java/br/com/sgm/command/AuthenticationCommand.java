package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationCommand implements Command {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		return "view/home.html";
	}

}
