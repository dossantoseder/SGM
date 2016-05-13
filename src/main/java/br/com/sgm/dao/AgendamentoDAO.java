package br.com.sgm.dao;

import java.util.Calendar;
import java.util.List;

import br.com.sgm.model.Agendamento;

public interface AgendamentoDAO {
	
	void save(Agendamento agendamento);

	void update(Agendamento agendamento);

	void refresh(Agendamento agendamento);

	Agendamento load(Agendamento agendamento);

	List<Agendamento> buscarPorPaciente(String nomePaciente);
	
	List<Agendamento> buscarPorMedico(String nomeMedico);
	
	List<Agendamento> buscarPorData(Calendar data);
}
