package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeAgendamento;
import br.com.sgm.facade.FacadePaciente;

public class ListarAgendamentoCommand implements Command {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String url = null;
		FacadeAgendamento fa = new FacadeAgendamento();
		req.setAttribute("listaAdendamentos",  fa.agendamentos());
		url = "view/listaAgendamento.jsp";
    	return url;
	}

}
