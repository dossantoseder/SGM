package br.com.sgm.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sgm.facade.FacadeMedico;
import br.com.sgm.model.Medico;

public class ExcluirMedicoCommand implements Command {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String url = null;
        int crm = Integer.parseInt(req.getParameter("txtCrm"));
        FacadeMedico fp = new FacadeMedico();
        Medico m = fp.medico(crm);
        fp.excluirMedico(m);
        url = "view/listaMedico.jsp";
        return url;
    }

}
