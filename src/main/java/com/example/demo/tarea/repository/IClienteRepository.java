package com.example.demo.tarea.repository;

import com.example.demo.tarea.repository.modelo.Cliente;

public interface IClienteRepository {

	public void ingresar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente seleccionar(Integer id);
	public void eliminar(Integer id);


}
