package com.example.demo.tarea.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.tarea.repository.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar(Estudiante estudiante);

	public Estudiante seleccionarPorCedula(String cedula);

	public void eliminar(String cedula);

	public void actualizar(Estudiante estudiante);
	
	public Estudiante seleccionarPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	
	public List<Estudiante> seleccionarListaPorApellidoyNombre(String apellido,String nombre);
	
	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedTypedQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedNativeQuery(String apellido);
	
	public Estudiante seleccionarPorNombreNamedQuery(String nombre);

	public Estudiante seleccionarPorNombreNamedNativeQuery(String nombre);
	
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido);
	
	//si es mayor a 100 se busca por nombre y apellido caso contrario se busca por alguno de los dos
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public Estudiante seleccionarEstudianteDinamicoFecha(String cedula, BigDecimal bono, LocalDate fechaNacimiento);

	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre, String apellido);

}
