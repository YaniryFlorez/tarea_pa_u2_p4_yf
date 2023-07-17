package com.example.demo.tarea.service;

import com.example.demo.tarea.repository.modelo.Cliente;

public interface IClienteService {

	public void crear(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(Integer id);
	public void borrar(Integer id);


}
