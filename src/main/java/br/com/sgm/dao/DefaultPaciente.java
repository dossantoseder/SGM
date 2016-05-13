package br.com.sgm.dao;

import java.util.List;
//import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.sgm.model.Paciente;

public class DefaultPaciente implements PacienteDAO{
	
	private final EntityManager entityManager;

	//@Inject
	public DefaultPaciente(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void save(Paciente paciente) {
		// TODO Auto-generated method stub
		entityManager.persist(paciente);
		
	}
	
	@Override
	public void update(Paciente paciente) {
		// TODO Auto-generated method stub
		entityManager.merge(paciente);
	}

	@Override
	public Paciente load(Paciente paciente) {
		// TODO Auto-generated method stub
		return (Paciente) entityManager.find(Paciente.class, paciente.getIdentificador());
	}

	@Override
	public List<Paciente> buscarPorLoginAnoSemestre(String login, int ano, Integer semestre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paciente> buscarPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Paciente> buscarPorCampus(String campus) {
		// TODO Auto-generated method stub
		return null;
	}

}
