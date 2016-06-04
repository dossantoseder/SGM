package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeAgendamento;
import br.com.sgm.facade.FacadeMedico;
import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.model.Agendamento;
import br.com.sgm.model.Medico;
import br.com.sgm.model.Paciente;

public class AtualizarAgendamentoCommand implements Command {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Medico m = new Medico();
		Paciente p = new Paciente();
		//String data = req.getParameter("txtIdentificador");
		int identificador = Integer.parseInt(req.getParameter("txtData"));
		String hora = req.getParameter("txtHora");
		int idPaciente = Integer.parseInt(req.getParameter("txtIdPaciente"));
		int idMedico = Integer.parseInt(req.getParameter("txtIdMedico"));
                p.setIdentificador(idPaciente);
                m.setIdentificador(idMedico);
		//Calendar data, String hora, Paciente paciente, Medico medico
		Agendamento a = new Agendamento(identificador, hora, p, m);
		
		FacadeAgendamento fa = new FacadeAgendamento();
		
		
		fa.atualizarAgendamento(a);
		String msg = "Agendamento atualizado com sucesso!";
                req.setAttribute("msg", msg);
		return "view/atualizarAgendamento.jsp";
	}

}
