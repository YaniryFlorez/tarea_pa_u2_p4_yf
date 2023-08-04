package com.example.demo.banco.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.banco.repo.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(CuentaBancaria cuentaBancaria) {
		//System.out.println("Repo: "+TransactionSynchronizationManager.isActualTransactionActive());
		this.entityManager.persist(cuentaBancaria);
	}


	
	@Override
	public CuentaBancaria seleccionarPorId(Integer id) {
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)//requiried
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.entityManager.merge(cuentaBancaria);
	}

}
