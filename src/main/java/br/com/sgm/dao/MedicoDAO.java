package br.com.sgm.dao;

import java.util.List;

import br.com.sgm.model.Medico;

public interface MedicoDAO {

	void save(Medico medico);

	void update(Medico medico);

	void refresh(Medico medico);

	Medico load(Medico medico);

	List<Medico> buscarPorEspecialidade(String especialidade);

}
