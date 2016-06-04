package br.com.sgm.dao;

import java.util.List;

import br.com.sgm.model.Usuario;

public interface UsuarioDAO {
	public boolean cadastrarUsuario(Usuario usuario);
	public boolean atualizarUsuario(Usuario usuario);
	public boolean excluirUsuario(int idUsuario);
	public Usuario getUsuario(int rg);
	public List<Usuario> getUsuario();
	public boolean autenticar(Usuario usuario);
}
