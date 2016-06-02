
package br.com.sgm.controller;

import br.com.sgm.model.Exame;
import br.com.sgm.model.Procedimento;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProcedimentoCadastroControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Procedimento procedimento = new Procedimento();
        Exame exame = new Exame();
        boolean resposta = false;
       
        //Pegando parâmetros da tela. 
        procedimento.setIdentificador(Integer.parseInt(request.getParameter("txtCodigoProcedimento")));   //a servlet pode não funcionar por causa dessa converã para inteiro  
        procedimento.setNome(request.getParameter("txtNomeProcedimento"));
        procedimento.setValor(Double.valueOf(request.getParameter("txtValorBase")));
        procedimento.setDescricao(request.getParameter("txtDescricaoProcedimento"));
        procedimento.setTipoDeProcedimento(request.getParameter("txtTipoProcedimento"));
        exame.setNomeExame(request.getParameter("txtExamesAtrelados"));
        procedimento.setExame(exame);
        
        try {
            resposta = procedimento.cadastrarProcedimento(procedimento);
        } catch (Exception ex) {
            Logger.getLogger(ProcedimentoCadastroControl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
