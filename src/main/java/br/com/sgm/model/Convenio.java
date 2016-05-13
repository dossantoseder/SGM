package br.com.sgm.model;

import java.util.Calendar;

public class Convenio {
	private String nome;
	private Calendar dataValidade;
	private String cobertura;
	private int faixaEtaria;
	private String tipoInternacao;   
	//private double taxaCadastro;
	//private String areaComercialização;
	private Calendar vencimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getTipoInternacao() {
		return tipoInternacao;
	}
	public void setTipoInternacao(String tipoInternacao) {
		this.tipoInternacao = tipoInternacao;
	}
	public Calendar getVencimento() {
		return vencimento;
	}
	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

}
