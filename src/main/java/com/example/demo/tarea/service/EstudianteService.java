package com.example.demo.tarea.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.tarea.repository.modelo.Estudiante;

public interface EstudianteService {

	public void guardar(Estudiante estudiante);

	public Estudiante buscarPorCedula(String cedula);

	public void borrar(String cedula);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorApellidoTyped(String apellido);
	
	public List<Estudiante> reportePorApellidoyNombre(String apellido,String nombre);
	
	public List<Estudiante> reportePorApellido(String apellido);
	
	public Estudiante buscarPorApellidoNamedTypedQuery(String apellido);
	
	public Estudiante buscarPorApellidoNamedQuery(String apellido);
	
	public Estudiante buscarPorApellidoNativeQuery(String apellido);

	public Estudiante buscarPorApellidoNamedNativeQuery(String apellido);
	
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedNativeQuery(String nombre);
	
	public Estudiante buscarPorApellidoCriteriaAPIQuery(String apellido);
	
	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public Estudiante buscarEstudianteDinamicoFecha(	String cedula, BigDecimal bono, LocalDate fechaNacimiento);

	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre, String apellido);
}
