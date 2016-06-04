package br.com.sgm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.sgm.model.Agendamento;
import br.com.sgm.model.Paciente;




public class DefaultAgendamento implements AgendamentoDAO{
	
	Agendamento agendamento;
	PreparedStatement stmt;
	private Connection con;
	boolean exe;
	static BDMySql bd = BDMySql.getInstance();

	public DefaultAgendamento() {
		con = bd.getConexao();
	}


	@Override
	public List<Agendamento> buscarPorCampus(String campus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cadastrarAgendamento(Agendamento agendamento) {
		try {

			stmt = con.prepareStatement("insert into agendamento(identificador,data,hora,paciente,medico) values(?,?,?,?,?)");

			//stmt.setInt(1, (int) agendamento.getIdentificador());
			//stmt.setDate(2, agendamento.getData());
			stmt.setString(3, agendamento.getHora());
			//stmt.setString(3, agendamento.getPaciente());
			//stmt.setString(3, agendamento.getMedico());
			//stmt.setLong(4, paciente.getIdentificador());

			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exe;
	}

	@Override
	public boolean atualizarAgendamento(Agendamento agendamento) {
		try {
			stmt = con.prepareStatement("update agendamento set identificador=?, data=?, hora=?, paciente=?, medico=? where identificador = ?");

			stmt.setString(1, agendamento.getHora());
			//stmt.setDate(2, agendamento.getData());
			stmt.setString(3, agendamento.getHora());
			

			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return exe;
	}

	@Override
	public boolean excluirAgendamento(Agendamento agendamento) {
		try {
			stmt = con.prepareStatement("delete from agendamento where identificador = ?");
			//stmt.setLong(4, agendamento.getIdentificador());

			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exe;
	}

	@Override
	public Agendamento getAgendamento(int rg) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from agendamento where identificadro = ?");

			stmt.setInt(1, rg);
			rs = stmt.executeQuery();

			if (rs.next()) {
				agendamento = new Agendamento();
				//agendamento.setIdentificador(rs.getInt("identificador"));
				//agendamento.setData((rs.getDate("data"));;
				agendamento.setHora((rs.getString("hora")));
				//agendamento.setMedico((rs.getMedico("medico")));
				//agendamento.setPaciente((rs.getPaciente("medico")));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return agendamento;
	}

	@Override
	public List<Agendamento> getAgendamento() {
		List<Agendamento> agendamentos = null;
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from agendamento");
				rs = stmt.executeQuery();
				agendamentos = new ArrayList<Agendamento>();

				while (rs.next()) {
					agendamentos = (List<Agendamento>) new Agendamento();
					//((Agendamento) agendamentos).setIdentificador(rs.getInt("identificador"));
					//((Agendamento) agendamentos).setDate((rs.getDate("data")));
					((Agendamento) agendamentos).setHora((rs.getString("hora")));
					//agendamento.setMedico((rs.getMedico("medico")));
					//agendamento.setPaciente((rs.getPaciente("medico")));
					// adiciona o objeto à lista
					//agendamento.add(agendamentos);

				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return agendamentos;
	}
	}

