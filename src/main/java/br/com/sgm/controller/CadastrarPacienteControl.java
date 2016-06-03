
package br.com.sgm.controller;

import br.com.sgm.model.Paciente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CadastrarPacienteControl extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Paciente paciente = new Paciente();
        boolean resposta = false;
        
        paciente.setNome(request.getParameter("txtNome"));   
        paciente.setRG(Integer.parseInt(request.getParameter("txtRg")));       //a servlet pode não funcionar por causa dessa converã para inteiro  
        paciente.setEmail(request.getParameter("txtEmail"));
        paciente.setCPF(Integer.parseInt(request.getParameter("txtCpf")));
        paciente.setTelefone(request.getParameter("txtTelefone"));  
        
        try {
            resposta = paciente.cadastrarPaciente(paciente);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarPacienteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("sucesso.jsp");
        rd.include(request, response);
        
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
