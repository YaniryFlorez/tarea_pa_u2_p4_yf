package com.example.demo.tarea.repository;

import com.example.demo.tarea.repository.modelo.Empleado;

public interface EmpleadoRepository {
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado );
	public Empleado buscar(Integer id);
	public void eliminar(Integer id);
}
