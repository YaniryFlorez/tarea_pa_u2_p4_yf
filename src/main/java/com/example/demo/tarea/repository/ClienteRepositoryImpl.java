package com.example.demo.tarea.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.tarea.repository.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepositoryImpl implements IClienteRepository{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void ingresar(Cliente cliente) {
		this.entityManager.persist(cliente);		
	}

	@Override
	public void actualizar(Cliente cliente) {
        this.entityManager.merge(cliente);		
	}

	@Override
	public Cliente seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public void eliminar(Integer id) {
          this.entityManager.remove(id);		
	}

}
