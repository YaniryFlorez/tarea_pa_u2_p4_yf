package com.example.demo.tarea.repository.modelo;

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

@Table(name = "hospital")
@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hosp")
	@SequenceGenerator(name = "seq_hosp", sequenceName = "seq_hosp", allocationSize = 1)
	@Column(name = "hosp_id")
	private Integer id;
	@Column(name = "hosp_nombre")
	private String nombre;
	@Column(name = "hosp_direccion")
	private String direccion;

	@OneToMany(mappedBy = "hospital", fetch = FetchType.LAZY)
	private List<Habitacion> habitaciones;

	//Get y sets
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	

}
