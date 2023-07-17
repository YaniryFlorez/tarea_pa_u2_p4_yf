package com.example.demo.tarea.repository;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.tarea.repository.modelo.Habitacion;
import com.example.demo.tarea.repository.modelo.Hospital;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HabitacionRepoImpl implements IHabitacionRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);
	}

	@Override
	public Habitacion selescionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}
	@Override
	public List<Habitacion> seleccionarOuterRightJoin() {
		// SQL
		// select * from hotel h right join habitacion ha on h.hotel_id=ha.habi_id_hotel

		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("" + "select h from Habitacion h right join h.hospital ha", Habitacion.class);

		List<Habitacion> hab = myQuery.getResultList();

		hab.forEach(h -> {
			if (h != null) {
				h.getHospital();
			}
		});

		return hab;
	}

	@Override
	public List<Habitacion> seleccionarOuterLeftJoin() {
		// SQL
		// select * from hotel h left join habitacion ha on h.hotel_id=ha.habi_id_hotel

		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("" + "select h from Habitacion h left join h.hospital ha", Habitacion.class);

		List<Habitacion> hab1 = myQuery.getResultList();

		hab1.forEach(h -> {
			if (h != null) {
				h.getHospital();
			}
		});

		return hab1;
	}


	@Override
	public List<Habitacion> seleccionarOuterFullJoin() {
		// SQL
		// select * from hotel h full join habitacion ha on h.hotel_id=ha.habi_id_hotel

		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("" + "select h from Habitacion h full join h.hospital ha", Habitacion.class);

		List<Habitacion> hab2 = myQuery.getResultList();

		hab2.forEach(h -> {
			if (h != null) {
				h.getHospital();
			}
		});

		return hab2;
	}

	@Override
	public List<Habitacion> seleccionarWhereJoin() {
		// SQL
		// select * from hotel h, habitacion ha where h.hotel_id=ha.habi_id_hotel
		// JPQL
		// select h where Hotel h, Habitacion ha where h=ha.hotel
		// Se compara entre objetos ***
		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("select h from Habitacion h, Habitacion ha where h=ha.hospital ", Habitacion.class);

		List<Habitacion> hab3 = myQuery.getResultList();

		hab3.forEach(h -> {

			h.getHospital();

		});

		return hab3;
	}

	@Override
	public List<Habitacion> seleccionarInnerJoin() {
		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("" + "select h from Habitacion h right join h.hospital ha", Habitacion.class);

		List<Habitacion> hab4 = myQuery.getResultList();

		hab4.forEach(h -> {
			if (h != null) {
				h.getHospital();
			}
		});

		return hab4;
	}

	@Override
	public List<Habitacion> seleccionaroinFetch() {
		TypedQuery<Habitacion> myQuery = this.entityManager
				.createQuery("" + "select h from Habitacion h full join fetch h.hospital ha", Habitacion.class);

		List<Habitacion> hab5 = myQuery.getResultList();

		hab5.forEach(h -> {
			if (h != null) {
				h.getHospital();
			}
		});

		return hab5;
	}

	

}

