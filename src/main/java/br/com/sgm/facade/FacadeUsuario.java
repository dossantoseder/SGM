package br.com.sgm.facade;

import java.util.List;

import br.com.sgm.dao.DefaultUsuario;
import br.com.sgm.model.Paciente;
import br.com.sgm.model.Usuario;

public class FacadeUsuario {
	Paciente paciente;
	DefaultUsuario defaultUsuario;

	public FacadeUsuario() {
		defaultUsuario = new DefaultUsuario();
	}

	public void cadastrarPaciente(Usuario usuario) {
		defaultUsuario.cadastrarUsuario(usuario);

	}

	public void atualizarPaciente(Usuario usuario) {

	}

	public void excluirPaciente(int idpaciente) {
	}

	public Usuario usuario(int idUsuario) {
		return defaultUsuario.getUsuario(idUsuario);
	}

	public boolean autenticar(Usuario usuario) {
		return defaultUsuario.autenticar(usuario);
	}
	public List<Usuario> usuarios() {
		return null;

	}
}
