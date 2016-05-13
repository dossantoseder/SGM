package br.com.sgm.model;

public class Paciente {

    private long identificador;
    private String nome;
    private int RG;
    private int CPF;

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

    public int pagarConta() throws Exception {

        return 1;
    }

    public int marcarConsulta() throws Exception {

        return 1;
    }

}
