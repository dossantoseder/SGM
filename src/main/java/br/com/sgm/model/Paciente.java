package br.com.sgm.model;

import br.com.sgm.dao.DefaultPaciente;

public class Paciente {

    private int identificador;
    private String email;
    private String telefone;
    private String nome;
    private int RG;
    private int CPF;

    public Paciente( String email, String telefone, String nome){
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
    }

    public Paciente(String email, String telefone, String nome, int RG, int CPF) {
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public Paciente() {
    }

    public Paciente(int identificador) {
        this.identificador = identificador;
    }
    
  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int rG) {
        RG = rG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }
    
    public boolean cadastrarPaciente(Paciente paciente) throws Exception{
        boolean resposta= false;
        DefaultPaciente pacienteDAO = new DefaultPaciente();
        resposta = pacienteDAO.cadastrarPaciente(paciente);
       
        return resposta;
    }

    public boolean excluirPaciente(Paciente paciente) throws Exception{
        boolean resposta= false;
        DefaultPaciente pacienteDAO = new DefaultPaciente();
      //  resposta = pacienteDAO.excluirPaciente(paciente);
       
        return resposta;
    }
    
     public boolean consultarPaciente(Paciente paciente) throws Exception{
        boolean resposta= false;
        DefaultPaciente pacienteDAO = new DefaultPaciente();
        resposta = pacienteDAO.consultar(paciente);
       
        return resposta;
    }
     
      public boolean atualizarPaciente(Paciente paciente) throws Exception{
        boolean resposta= false;
        DefaultPaciente pacienteDAO = new DefaultPaciente();
        resposta = pacienteDAO.atualizarPaciente(paciente);
       
        return resposta;
    }
    public int pagarConta() throws Exception {

        return 1;
    }

    public int marcarConsulta() throws Exception {

        return 1;
    }

}
