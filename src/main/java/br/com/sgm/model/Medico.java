package br.com.sgm.model;

public class Medico {

    private long identificador;
    private String nome;
    private int CRM;
    private Especialidade especialidade;

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
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

    public int consultarCID() throws Exception {

        return 1;
    }

    public int criarPrescricao() throws Exception {

        return 1;
    }

}
