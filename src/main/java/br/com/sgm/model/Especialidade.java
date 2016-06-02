package br.com.sgm.model;

import br.com.sgm.dao.EspecialidadeDAO;

public class Especialidade {

    private int identificador;
    private String descricao;
    private double valor;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 
    public boolean cadastrarEspecialidade(Especialidade especialidade) throws Exception {
        //EspecialidadeDAO especialidade = new EspecialidadeDAO();
        //especialidade.save(especialidade);
        return true;
    }

}
