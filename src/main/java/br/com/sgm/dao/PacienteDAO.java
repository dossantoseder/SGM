package br.com.sgm.dao;

import java.util.List;

import br.com.sgm.model.Paciente;


public interface PacienteDAO {
	void save(Paciente paciente);

	Paciente load(Paciente paciente);

	List<Paciente> buscarPorLoginAnoSemestre(String login, int ano, Integer semestre);

	List<Paciente> buscarPorLogin(String login);

	void refresh(Paciente paciente);

	void update(Paciente paciente);

	List<Paciente> buscarPorCampus(String campus);

}
