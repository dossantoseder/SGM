package br.com.sgm.command;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeAgendamento;
import br.com.sgm.facade.FacadeMedico;
import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.model.Agendamento;
import br.com.sgm.model.Medico;
import br.com.sgm.model.Paciente;

public class CadastarAgendamentoCommand implements Command{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Medico m = new Medico();
		Paciente p = new Paciente();
		String data = req.getParameter("txtData");
		String hora = req.getParameter("txtHora");
		int idPaciente = Integer.parseInt(req.getParameter("txtIdPaciente"));
		int idMedico = Integer.parseInt(req.getParameter("txtIdMedico"));
                p.setIdentificador(idPaciente);
                m.setIdentificador(idMedico);
		//Calendar data, String hora, Paciente paciente, Medico medico
		Agendamento a = new Agendamento(hora, p, m);
		
		FacadeAgendamento fa = new FacadeAgendamento();
		
		
		fa.cadastrarAgendamento(a);
		String msg = "Agendamento cadastrado com sucesso!";
	    req.setAttribute("msg", msg);
		return "view/cadastrarAgendamento.jsp";
	}

}
