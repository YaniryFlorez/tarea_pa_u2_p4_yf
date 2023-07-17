package com.example.demo.tarea.service;

import com.example.demo.tarea.repository.modelo.CuentaBanciaria;

public interface ICuentaBancariaService {

	public void crear(CuentaBanciaria cuentaBanciaria);

	public void modificar(CuentaBanciaria cuentaBanciaria);

	public CuentaBanciaria buscar(String numero);

	public void borrar(String numero);
	

}
