package br.com.sgm.dao;

import br.com.sgm.model.Especialidade;

public interface EspecialidadeDAO {
	
	void save(Especialidade especialidade);

	void update(Especialidade especialidade);

	void refresh(Especialidade especialidade);

	Especialidade load(Especialidade especialidade);

}
