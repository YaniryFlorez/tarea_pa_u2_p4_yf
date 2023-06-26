package com.example.demo.tarea.repository;

import com.example.demo.tarea.repository.modelo.Ciudadano;

public interface CiudadanoRepository {

	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void eliminar(Integer id);
	
}
