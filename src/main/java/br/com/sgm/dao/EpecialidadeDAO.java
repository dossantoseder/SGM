package br.com.sgm.dao;

import br.com.sgm.model.Especialidade;

public interface EpecialidadeDAO {
	
	void save(Especialidade epecialidade);

	void update(Especialidade epecialidade);

	void refresh(Especialidade epecialidade);

	Especialidade load(Especialidade epecialidade);

}
