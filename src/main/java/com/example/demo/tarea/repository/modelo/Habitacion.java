package com.example.demo.tarea.repository.modelo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Table(name = "habitacion",schema = "public")
@Entity
public class Habitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_habitacion")
	@SequenceGenerator(name = "seq_habitacion", sequenceName = "seq_habitacion", allocationSize = 1)
	
	@Column(name = "habi_id")
	private Integer id;
	@Column(name = "habi_numero")
	private String numero;
	@Column(name = "habi_valor")
	private BigDecimal valor;
	@Column(name = "habi_numero_camillas")
	private String camillas;
	
	
	@ManyToOne()
	@JoinColumn(name = "habi_id_hospital")
	private Hospital hospital;

	//Get y sets
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public String getCamillas() {
		return camillas;
	}


	public void setCamillas(String camillas) {
		this.camillas = camillas;
	}


	public Hospital getHospital() {
		return hospital;
	}


	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}


	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", valor=" + valor + ", camillas=" + camillas
				+ ", hospital=" + hospital + "]";
	}

	
}
