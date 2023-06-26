package com.example.demo.tarea.service;

import com.example.demo.tarea.repository.modelo.Empleado;

public interface EmpleadoService {
	public void crear(Empleado empleado);
	public void actualizar(Empleado empleado );
	public Empleado buscar(Integer id);
	public void borrar(Integer id);
}
