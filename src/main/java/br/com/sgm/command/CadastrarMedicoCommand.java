package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeMedico;
import br.com.sgm.model.Especialidade;
import br.com.sgm.model.Medico;

public class CadastrarMedicoCommand implements Command {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nome = req.getParameter("txtNome");
		int crm= Integer.parseInt(req.getParameter("txtCrm"));
		String telefone = req.getParameter("txtTelefone");
		String espec = req.getParameter("txtEspecialidade");
                Especialidade especialidade = new Especialidade();
                especialidade.setNome(espec);
		
		Medico m = new Medico(nome, telefone, crm, especialidade);
		FacadeMedico fp = new FacadeMedico();
		fp.cadastrarMedico(m);
		return null;
	}

}
