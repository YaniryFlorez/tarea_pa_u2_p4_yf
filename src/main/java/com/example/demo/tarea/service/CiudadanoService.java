package com.example.demo.tarea.service;

import com.example.demo.tarea.repository.modelo.Ciudadano;

public interface CiudadanoService {
	public void crear(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void borrar(Integer id);
}
