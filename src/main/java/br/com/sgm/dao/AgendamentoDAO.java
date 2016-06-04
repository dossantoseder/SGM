package br.com.sgm.dao;

import java.util.Calendar;
import java.util.List;

import br.com.sgm.model.Agendamento;
import br.com.sgm.model.Paciente;

public interface AgendamentoDAO {
	
	List<Agendamento> buscarPorCampus(String campus);
	public boolean cadastrarAgendamento(Agendamento agendamento);
	public boolean atualizarAgendamento(Agendamento agendamento);
	public boolean excluirAgendamento(Agendamento agendamento);
	public Agendamento getAgendamento(int rg);
	public List<Agendamento> getAgendamento();

}
	