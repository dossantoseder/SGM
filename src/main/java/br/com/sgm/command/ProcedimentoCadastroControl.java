/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgm.command;

import br.com.sgm.model.Exame;
import br.com.sgm.model.Procedimento;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProcedimentoCadastroControl implements Command{

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
         Procedimento procedimento = new Procedimento();
        Exame exame = new Exame();
        boolean resposta = false;
       
        //Pegando parâmetros da tela. 
        procedimento.setIdentificador(Integer.parseInt(req.getParameter("txtCodigoProcedimento")));   //a servlet pode não funcionar por causa dessa converã para inteiro  
        procedimento.setNome(req.getParameter("txtNomeProcedimento"));
        procedimento.setValor(Double.valueOf(req.getParameter("txtValorBase")));
        procedimento.setDescricao(req.getParameter("txtDescricaoProcedimento"));
        procedimento.setTipoDeProcedimento(req.getParameter("txtTipoProcedimento"));
        exame.setNomeExame(req.getParameter("txtExamesAtrelados"));
        procedimento.setExame(exame);
        
        try {
            resposta = procedimento.cadastrarProcedimento(procedimento);
        } catch (Exception ex) {
            Logger.getLogger(br.com.sgm.controller.ProcedimentoCadastroControl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
               
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
