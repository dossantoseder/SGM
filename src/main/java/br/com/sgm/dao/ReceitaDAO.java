package br.com.sgm.dao;

import br.com.sgm.model.Receita;

public interface ReceitaDAO {

	void save(Receita receita);

	void update(Receita receita);

	void refresh(Receita receita);

	Receita load(Receita receita);
}
