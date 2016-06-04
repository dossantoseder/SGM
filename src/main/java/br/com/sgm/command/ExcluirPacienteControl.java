package br.com.sgm.command;

import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.model.Paciente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcluirPacienteControl implements Command {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        int idUsuario = Integer.parseInt(req.getParameter("codigo"));
        Paciente p = new Paciente(idUsuario);
        FacadePaciente fp = new FacadePaciente();
        fp.excluirPaciente(p);
        String msg = "Paciente excluido com sucesso!";

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
