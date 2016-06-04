
package br.com.sgm.command;

import br.com.sgm.facade.FacadePaciente;
import br.com.sgm.model.Paciente;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AtualizarPacienteControl implements Command{

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        String nome = req.getParameter("txtNome");
        String email = req.getParameter("txtEmail");
        String telefone = req.getParameter("txtTelefone");
        Paciente p = new Paciente(email, telefone, nome);
        FacadePaciente fp = new FacadePaciente();
        fp.atualizarPaciente(p);
        String msg = "Paciente Atualizado com Sucesso!";
        req.setAttribute("msg", msg);
        
        
        RequestDispatcher rd = req.getRequestDispatcher("sucesso.jsp");
        rd.forward(req, res);
        
        
       return null;
    }
    
}
