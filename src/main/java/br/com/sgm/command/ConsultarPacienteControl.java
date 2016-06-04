package br.com.sgm.command;

import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.model.Paciente;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConsultarPacienteControl implements Command {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        int idPaciente = Integer.parseInt(req.getParameter("txtIdPaciente"));
        Paciente p = new Paciente(idPaciente);
        FacadePaciente fp = new FacadePaciente();
        fp.getpaciente(p);

        req.setAttribute("pacienteConsulta", p);
        RequestDispatcher rd = req.getRequestDispatcher("ConsultarPaciente.jsp");
        rd.forward(req, res);

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
