package br.com.sgm.dao;

import br.com.sgm.model.Procedimento;

public interface ProcedimentoDAO {
	void save(Procedimento procedimento);

	void update(Procedimento procedimento);

	void refresh(Procedimento procedimento);

	Procedimento load(Procedimento procedimento);

}
