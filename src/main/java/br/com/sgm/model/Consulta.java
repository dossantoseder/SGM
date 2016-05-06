package br.com.sgm.model;

import java.util.Calendar;

public class Consulta {
	private Calendar data;
	private String hora;
	private  boolean situacao;
	private Paciente paciente;
	private Medico medico;
	private String diagn�stico;
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
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
	public String getDiagn�stico() {
		return diagn�stico;
	}
	public void setDiagn�stico(String diagn�stico) {
		this.diagn�stico = diagn�stico;
	}


}
