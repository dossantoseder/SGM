package br.com.sgm.model;

public class Medico {

    private int identificador;
    private String nome;
    String telefone;
    private int CRM;
    private Especialidade especialidade;

    public Medico(String nome, String telefone, Especialidade especialidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public Medico(String nome, String telefone, int CRM, Especialidade especialidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    public Medico(int CRM) {
        this.CRM = CRM;
    }

    public Medico() {
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

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int cRM) {
        CRM = cRM;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
     public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int consultarCID() throws Exception {

        return 1;
    }

    public int criarPrescricao() throws Exception {

        return 1;
    }

}
