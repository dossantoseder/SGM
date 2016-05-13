package br.com.sgm.model;

public class Procedimento {

    private long identificador;
    private String nome;
    private Paciente paciente;
    private Medico medico;
    private String descricao;
    private Exame exame;
    private String tipoDeProcedimento;
    private double valor;

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public String getTipoDeProcedimento() {
        return tipoDeProcedimento;
    }

    public void setTipoDeProcedimento(String tipoDeProcedimento) {
        this.tipoDeProcedimento = tipoDeProcedimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int cadastrarProcedimento() throws Exception {

        return 1;
    }
}
