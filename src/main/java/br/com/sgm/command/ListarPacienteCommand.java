package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadePaciente;

public class ListarPacienteCommand implements Command{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String url = null;
		FacadePaciente fp = new FacadePaciente();
		url = "view/listapaciente.html";
    	return url;
	}

}
