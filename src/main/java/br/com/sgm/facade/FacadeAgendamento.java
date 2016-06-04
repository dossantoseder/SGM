package br.com.sgm.facade;

import java.util.List;

import br.com.sgm.dao.DefaultAgendamento;
//import br.com.sgm.dao.DefaultMedico;
import br.com.sgm.dao.DefaultPaciente;
import br.com.sgm.model.Agendamento;
import br.com.sgm.model.Medico;

public class FacadeAgendamento {


	Agendamento agendamento;
	DefaultAgendamento defaultAgendamento;

	public FacadeAgendamento() {
		//defaultAgendamento = new DefaultAgendamento();
	}

	public void cadastrarAgendamento(Agendamento agendamento) {
		//defaultAgendamento.cadastrarAgendamento(agendamento);

	}

	public void atualizarAgendamento(Agendamento agendamento) {
		//defaultAgendamento.atualizarAgendamento(agendamento);

	}

	public void excluirAgendamento(Agendamento agendamento) {
		//defaultAgendamento.excluirAgendamento(agendamento);
	}

	public Agendamento agendamento(int idAgendamento) {
		//return defaultAgendamento.getAgendamento(idAgendamento);
		return null;
	}

	public List<Agendamento> agendamentos() {
		//return defaultAgendamento.getAgendamentos();
		return null;

	}
}
