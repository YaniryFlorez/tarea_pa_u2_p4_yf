package com.example.demo.tarea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea.repository.CiudadanoRepository;
import com.example.demo.tarea.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements CiudadanoService{
	
	@Autowired
	private CiudadanoRepository ciudadanoRepository;
	

	@Override
	public void crear(Ciudadano ciudadano) {
		this.ciudadanoRepository.insertar(ciudadano);	
		
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.ciudadanoRepository.actualizar(ciudadano);		
	}

	@Override
	public Ciudadano buscar(Integer id) {
				return this.ciudadanoRepository.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
				this.ciudadanoRepository.eliminar(id);
	}
	

}
