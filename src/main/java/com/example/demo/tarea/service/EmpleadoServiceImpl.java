package com.example.demo.tarea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea.repository.EmpleadoRepository;
import com.example.demo.tarea.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public void crear(Empleado empleado) {
			this.empleadoRepository.insertar(empleado);	
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.empleadoRepository.actualizar(empleado);		
	}

	@Override
	public Empleado buscar(Integer id) {
		return this.empleadoRepository.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.empleadoRepository.eliminar(id);
		
	}

}
