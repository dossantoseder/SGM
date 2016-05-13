package br.com.sgm.dao;

import br.com.sgm.model.Exame;

public interface ExameDAO {
	
	void save(Exame exame);

	void update(Exame exame);

	void refresh(Exame exame);

	Exame load(Exame exame);
}
