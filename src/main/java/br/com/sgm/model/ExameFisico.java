package br.com.sgm.model;

public class ExameFisico extends Exame {

    private String alteracoesFisicas;
    private Double peso;
    private Double altura;
    private int idade;

    public String getAlteracoesFisicas() {
        return alteracoesFisicas;
    }

    public void setAlteracoesFisicas(String alteracoesFisicas) {
        this.alteracoesFisicas = alteracoesFisicas;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int inserirRegistroExame() throws Exception {

        return 1;
    }
}
