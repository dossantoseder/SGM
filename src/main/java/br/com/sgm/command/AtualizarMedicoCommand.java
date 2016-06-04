package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeMedico;
import br.com.sgm.model.Especialidade;
import br.com.sgm.model.Medico;

public class AtualizarMedicoCommand implements Command{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nome = req.getParameter("txtEspecialidade");
		String telefone = req.getParameter("txtTelefone");
		String espec = req.getParameter("txtEspecialidade");
                Especialidade especialidade = new Especialidade();
                especialidade.setNome(espec);
		
		Medico m = new Medico(nome, telefone, especialidade);
		FacadeMedico fp = new FacadeMedico();
		fp.atualizarMedico(m);
		return null;

	}

}
