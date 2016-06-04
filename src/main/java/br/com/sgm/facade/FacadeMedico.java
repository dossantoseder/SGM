package br.com.sgm.facade;

import java.util.List;

import br.com.sgm.dao.DefaultMedico;
import br.com.sgm.model.Medico;

public class FacadeMedico {

	Medico medico;
	DefaultMedico defaultMedico;

	public FacadeMedico() {
		//defaultMedico = new DefaultMedico();
	}

	public void cadastrarMedico(Medico medico) {
		//defaultMedico.cadastrarPaciente(medico);

	}

	public void atualizarMedico(Medico paciente) {
		//defaultMedico.atualizarMedico(medico);

	}

	public void excluirMedico(Medico medico) {
		//defaultMedico.excluirMedico(medico);
	}

	public Medico medico(int idMedico) {
		//return defaultMedico.getMedico(idMedico);
		return null;
	}

	public List<Medico> medicos() {
		//return defaultPaciente.getPacientes();
		return null;

	}
}
