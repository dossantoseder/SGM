package br.com.sgm.model;

import java.util.Calendar;

public class Agendamento {

	private int identificador;
	private Calendar data;
	private String hora;
	private Paciente paciente;
	private Medico medico;

	public Agendamento() {

	}

	public Agendamento(String hora, Paciente paciente, Medico medico) {
		this.setData(data);
		this.setHora(hora);
		this.setPaciente(paciente);
		this.setMedico(medico);
	}

	public Agendamento(int identificador,String hora, Paciente paciente, Medico medico) {
		this.setIdentificador(identificador);
		this.setData(data);
		this.setHora(hora);
		this.setPaciente(paciente);
		this.setMedico(medico);

	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

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

}
