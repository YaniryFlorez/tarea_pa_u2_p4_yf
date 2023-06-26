package com.example.demo.tarea.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "estudiante")
@NamedQuery(name = "Estudiante.buscarPorNombre", query = "select e from Estudiante e where e.nombre = :datoNombre")
@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "select * from estudiante estu where estu_nombre = :datoNombre")
public class Estudiante {
	
	@Id	
	@SequenceGenerator(name="estu_seq",sequenceName = "estu_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq")
	@Column(name = "estu_id")
	private Integer id;
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_genero")
	private String genero;
	
	@Column(name = "estu_cedula")
	private String cedula;
	
	@Column(name = "estu_ciudad")
	private String ciudad;
	
	@Column(name = "estu_salario")
	private BigDecimal salario;
	
	@Column(name = "estu_fecha_naciemiento")
	private LocalDateTime fechaNacimiento;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", cedula=" + cedula + ", ciudad=" + ciudad + "]";
	}
	
		
}
