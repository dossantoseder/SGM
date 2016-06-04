package br.com.sgm.facade;

import java.util.List;

import br.com.sgm.dao.DefaultPaciente;
import br.com.sgm.model.Paciente;

public class FacadePaciente {
	Paciente paciente;
	DefaultPaciente defaultPaciente;

	public FacadePaciente() {
		defaultPaciente = new DefaultPaciente();
	}

	public void cadastrarPaciente(Paciente paciente) {
		defaultPaciente.cadastrarPaciente(paciente);

	}

	public void atualizarPaciente(Paciente paciente) {
		defaultPaciente.atualizarPaciente(paciente);

	}

	public void excluirPaciente(Paciente paciente) {
		defaultPaciente.excluirPaciente(paciente);
	}

	public Paciente getpaciente(Paciente paciente) {
		return defaultPaciente.getPaciente(paciente);
	}

	public List<Paciente> pacientes() {

		return defaultPaciente.getPacientes();

	}

}
