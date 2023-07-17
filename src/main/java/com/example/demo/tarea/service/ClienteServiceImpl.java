package com.example.demo.tarea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea.repository.IClienteRepository;
import com.example.demo.tarea.repository.modelo.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public void crear(Cliente cliente) {
         this.clienteRepository.ingresar(cliente);		
	}

	@Override
	public void actualizar(Cliente cliente) {
		this.clienteRepository.actualizar(cliente);		
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepository.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.clienteRepository.eliminar(id);		
	}

}
