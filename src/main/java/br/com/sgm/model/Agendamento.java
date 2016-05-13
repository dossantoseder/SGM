package br.com.sgm.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
@Entity
public class Agendamento {
	
	@Id
	@SequenceGenerator(name = "Agendamento_SEQ", sequenceName = "Agendamento_SEQ", allocationSize = 1)  
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Agendamento_SEQ")
	private long identificador;
	@NotNull(message = "N�o pode ser nulo")
	@Length(min = 4, max = 100, message = "N�o pode ser nulo")
	private Calendar data;
	@NotNull()
	private String hora;
	private Paciente paciente;
	private Medico medico;

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
