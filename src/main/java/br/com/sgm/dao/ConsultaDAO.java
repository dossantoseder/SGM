package br.com.sgm.dao;

import java.util.Calendar;
import java.util.List;

import br.com.sgm.model.Consulta;
import br.com.sgm.model.Paciente;

public interface ConsultaDAO {

	void save(Consulta consulta);

	void update(Consulta consulta);

	void refresh(Consulta consulta);

	Paciente load(Consulta consulta);

	List<Consulta> buscarPorEspecialidade(String especialidade);

	List<Consulta> buscarPorMedico(String nomeMedico);

	List<Consulta> buscarPorData(Calendar data);

}
