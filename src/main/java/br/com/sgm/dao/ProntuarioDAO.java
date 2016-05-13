package br.com.sgm.dao;

import br.com.sgm.model.Prontuario;

public interface ProntuarioDAO {
	void save(Prontuario prontuario);

	void update(Prontuario prontuario);

	void refresh(Prontuario prontuario);

	Prontuario load(Prontuario prontuario);

}
