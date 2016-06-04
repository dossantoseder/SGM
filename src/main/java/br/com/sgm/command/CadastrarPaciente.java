package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.model.Paciente;

public class CadastrarPaciente implements Command {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        String nome = req.getParameter("txtNome");
        int rg = Integer.parseInt(req.getParameter("txtRg"));
        String email = req.getParameter("txtEmail");
        int cpf = Integer.parseInt(req.getParameter("txtCpf"));
        String telefone = req.getParameter("txtTelefone");
        Paciente p = new Paciente(email, telefone, nome, rg, cpf);
        FacadePaciente fp = new FacadePaciente();
        fp.cadastrarPaciente(p);
        String msg = "Paciente cadastrado com sucesso!";
        req.setAttribute("msg", msg);
        return null;
    }

}
