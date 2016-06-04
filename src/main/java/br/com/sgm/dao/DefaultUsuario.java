package br.com.sgm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.sgm.model.Paciente;
import br.com.sgm.model.Usuario;

public class DefaultUsuario implements UsuarioDAO {

	Usuario usuario;
	PreparedStatement stmt;
	ResultSet rs ;
	private Connection con;
	boolean exe;
	static BDMySql bd = BDMySql.getInstance();

	public DefaultUsuario() {
		con = bd.getConexao();
	}

	@Override
	public boolean cadastrarUsuario(Usuario usuario) {
		try {
			stmt = con.prepareStatement("insert into" + " usuario set login = ?, senha = ?");
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exe;
	}

	@Override
	public boolean atualizarUsuario(Usuario usuario) {
		try {
			stmt = con.prepareStatement("update" + " usuario set login = ?, senha = ?");
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			exe = stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exe;
	}

	@Override
	public boolean excluirUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario getUsuario(int rg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean autenticar(Usuario usuario) {
		boolean ok = false;
		
		try {
			stmt = con.prepareStatement("SELECT * FROM"+
					" usuario where login = ? and senha = ? ");
			
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			rs = stmt.executeQuery();
			
			if(rs.next()){
	        		ok = true;
	        }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ok;
	}

}
