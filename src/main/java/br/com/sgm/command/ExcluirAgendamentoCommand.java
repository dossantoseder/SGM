package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.sgm.facade.FacadeAgendamento;
import br.com.sgm.model.Agendamento;

public class ExcluirAgendamentoCommand implements Command{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String url = null;
		int identificador = Integer.parseInt(req.getParameter("txtIdentificador"));
		FacadeAgendamento fa = new FacadeAgendamento();
		Agendamento a = fa.agendamento(identificador);
		fa.excluirAgendamento(a);
		url = "view/listaPaciente.jsp";
		return url;
	}

}
