package com.example.demo.tarea.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cli")
	@SequenceGenerator(name = "seq_cli", sequenceName = "seq_cli", allocationSize = 1)
	@Column(name = "cli_id")
	private Integer id;
	@Column(name = "cli_cedula")
	private String cedula;
	@Column(name = "cli_nombre")
	private String nombre;
	@Column(name = "cli_apellido")
	private String apellido;
	

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<CuentaBanciaria> cuentas;

//SET Y GET
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public List<CuentaBanciaria> getCuentas() {
		return cuentas;
	}


	public void setCuentas(List<CuentaBanciaria> cuentas) {
		this.cuentas = cuentas;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", cuentas=" + cuentas + "]";
	}
	
	
}
