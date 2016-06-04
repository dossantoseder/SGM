package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeMedico;

public class ListarMedicoCommand implements Command{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
				String url = null;
				FacadeMedico fp = new FacadeMedico();
				url = "view/listaMedico.jsp";
		    	return url;
	}

}
