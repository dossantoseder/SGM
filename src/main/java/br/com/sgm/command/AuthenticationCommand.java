package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.facade.FacadeUsuario;
import br.com.sgm.model.Usuario;

public class AuthenticationCommand implements Command {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String url = null;
		String login = req.getParameter("txtlogin");
		String senha = req.getParameter("txtsenha");
		
		Usuario u = new Usuario(login, senha);
		FacadeUsuario facadeUsuario = new FacadeUsuario();

		if (!facadeUsuario.autenticar(u)) {
			System.out.println("false");
			url = "view/home.jsp";
		} else {
			System.out.println("Ok");
			url = "view/Sucesso.jsp";
		}
		return url;
	}

}
