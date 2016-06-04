
package br.com.sgm.command;

import br.com.sgm.model.Especialidade;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EspecialidadeControl implements Command{

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
          Especialidade especialidade = new Especialidade();
        boolean resposta = false;
       
        //Pegando parâmetros da tela. 
        especialidade.setIdentificador(Integer.parseInt(req.getParameter("txtCodigoEspecialidade")));   //a servlet pode não funcionar por causa dessa converã para inteiro  
        especialidade.setNome(req.getParameter("txtEspecialidade"));
        especialidade.setValor(Double.valueOf(req.getParameter("txtValorBase")));
        especialidade.setDescricao(req.getParameter("txtDescricaoEspecialidade"));
       
        try {
            resposta = especialidade.cadastrarEspecialidade(especialidade);
        } catch (Exception ex) {
            Logger.getLogger(br.com.sgm.controller.EspecialidadeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
