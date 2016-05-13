package br.com.sgm.model;

import java.util.Calendar;

public class Exame {
	private long identificador;
	private Paciente paciente;
	private Calendar dataResultado;
	private String tipoExame;
	private String nomeExame;
	private String observacao;
	private double valor;

	
	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getDataResultado() {
		return dataResultado;
	}

	public void setDataResultado(Calendar dataResultado) {
		this.dataResultado = dataResultado;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
        
        public int gerarGuiaPagamentoExame() throws Exception {

        return 1;
    }

}
