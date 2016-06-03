package br.com.sgm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sgm.model.Paciente;

public class DefaultPaciente {

	Paciente paciente;
	PreparedStatement stmt;
	private Connection con;
	boolean exe;
	static BDMySql bd = BDMySql.getInstance();

	public DefaultPaciente() {
	}

	public boolean cadastrarPaciente(Paciente paciente) {
		try {

			stmt = con.prepareStatement("insert into paciente(nome,rg,dtNasc,bairro,"
					+ "endereco,telResidencial,telCelular," + "mae,pai,idusuario)values(?,?,?,?,?,?,?,?,?,?)");

			stmt.setString(1, paciente.getNome());
			stmt.setInt(2, paciente.getCPF());
			stmt.setInt(3, paciente.getRG());
			stmt.setLong(4, paciente.getIdentificador());

			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exe;
	}

	public boolean excluirPaciente(Paciente paciente) {

		try {
			stmt = con.prepareStatement("delete from paciente where idPaciente = ?");
			stmt.setLong(1, paciente.getIdentificador());

			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exe;
	}

	public boolean atualizarPaciente(Paciente paciente) {
		try {
			stmt = con.prepareStatement("update paciente set nome=?,rg=?,dtNasc=?,"
					+ "bairro=?,endereco=?,telResidencial=?,telCelular=?," + "mae=?,pai=? where idPaciente = ?");

			stmt.setString(1, paciente.getNome());
			stmt.setInt(2, paciente.getCPF());
			stmt.setInt(3, paciente.getRG());
			stmt.setLong(4, paciente.getIdentificador());

			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return exe;
	}

	public Paciente getPaciente(int rg) {

		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from paciente where rg = ?");

			stmt.setInt(1, rg);
			rs = stmt.executeQuery();

			if (rs.next()) {
				paciente = new Paciente();
				paciente.setIdentificador(rs.getInt("idpaciente"));
				paciente.setNome(rs.getString("nome"));
				paciente.setRG(rs.getInt("rg"));
				paciente.setCPF(rs.getInt("cpf"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return paciente;
	}

	public List<Paciente> getPacientes() {
		List<Paciente> pacientes = null;
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from paciente");
				rs = stmt.executeQuery();
				pacientes = new ArrayList<Paciente>();

				while (rs.next()) {
					paciente = new Paciente();
					paciente.setIdentificador(rs.getInt("idpaciente"));
					paciente.setNome(rs.getString("nome"));
					paciente.setRG(rs.getInt("rg"));
					paciente.setCPF(rs.getInt("cpf"));

					// adiciona o objeto � lista
					pacientes.add(paciente);

				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pacientes;
	}
        
        public boolean consultar(Paciente paciente) throws Exception {

        Connection conexao = ConnectionFactory.getConnection();
        ResultSet resposta = null;
        boolean ok = false;
        StringBuilder sql = new StringBuilder();

        try {
            sql.append("select * from sgm.paciente");
            sql.append(" where idPaciente = ?");
            PreparedStatement stmt = conexao.prepareStatement(sql.toString());
            stmt.setInt(1, paciente.getIdentificador());
            
            
            resposta = stmt.executeQuery();
            while (resposta.next()) { 
                paciente.setIdentificador(Integer.parseInt(resposta.getString("idPaciente")));
                paciente.setNome(resposta.getString("nome"));
                paciente.setCPF(Integer.parseInt(resposta.getString("Cpf")));
                paciente.setTelefone(resposta.getString("telefone"));
                   
                ok = true;
            }
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        } finally {
            if (conexao != null) {
                ConnectionFactory.FecharConexao(conexao, null, resposta);
            }
        }
        return ok;
    }
        

}
