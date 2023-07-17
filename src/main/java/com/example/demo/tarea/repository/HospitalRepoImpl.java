package com.example.demo.tarea.repository;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.demo.tarea.repository.modelo.Hospital;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HospitalRepoImpl implements IHospitalRepo {

	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public List<Hospital> seleccionarInnerJoin() {
		//SQL
		//SELECT * FROM hotel h inner JOIN habitacion ha on h.hotel_id=ha.habi_id_hotel;
		//JPQL
		//select h from Hotel h join h.habitaciones ha
		//ponemos la relacion que hace la referencia a habitaciones
		TypedQuery<Hospital> myQuery=this.entityManager.createQuery(""
				+ "select h from Hospital h join h.habitaciones ha", Hospital.class);
		
		List<Hospital> hosp= myQuery.getResultList();
		
		hosp.forEach(h->{
			h.getHabitaciones().size();
		});
		
		return hosp;
	}


	@Override
	public void ingresar(Hospital hospital) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hospital);
	}


	@Override
	public void actualizar(Hospital hospital) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hospital);
	}


	@Override
	public Hospital selescionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hospital.class, id);
	}


	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	@Override
	public List<Hospital> seleccionarOuterRightJoin() {
		// SQL
		// select * from hotel h right join habitacion ha on h.hotel_id=ha.habi_id_hotel

		TypedQuery<Hospital> myQuery = this.entityManager
				.createQuery("" + "select h from Hospital h right join h.habitaciones ha", Hospital.class);

		List<Hospital> hosp = myQuery.getResultList();

		hosp.forEach(h -> {
			if (h != null) {
				h.getHabitaciones().size();
			}
		});

		return hosp;
	}

	@Override
	public List<Hospital> seleccionarOuterLeftJoin() {
		// SQL
		// select * from hotel h left join habitacion ha on h.hotel_id=ha.habi_id_hotel

		TypedQuery<Hospital> myQuery = this.entityManager
				.createQuery("" + "select h from Hospital h left join h.habitaciones ha", Hospital.class);

		List<Hospital> hosp = myQuery.getResultList();

		hosp.forEach(h -> {
			if (h != null) {
				h.getHabitaciones().size();
			}
		});

		return hosp;
	}


	@Override
	public List<Hospital> seleccionarOuterFullJoin() {
		// SQL
		// select * from hotel h full join habitacion ha on h.hotel_id=ha.habi_id_hotel

		TypedQuery<Hospital> myQuery = this.entityManager
				.createQuery("" + "select h from Hospital h full join h.habitaciones ha", Hospital.class);

		List<Hospital> hosp = myQuery.getResultList();

		hosp.forEach(h -> {
			if (h != null) {
				h.getHabitaciones().size();
			}
		});

		return hosp;
	}

	@Override
	public List<Hospital> seleccionarWhereJoin() {
		// SQL
		// select * from hotel h, habitacion ha where h.hotel_id=ha.habi_id_hotel
		// JPQL
		// select h where Hotel h, Habitacion ha where h=ha.hotel
		// Se compara entre objetos ***
		TypedQuery<Hospital> myQuery = this.entityManager
				.createQuery("select h from Hospital h, Habitacion ha where h=ha.hospital ", Hospital.class);

		List<Hospital> hosp = myQuery.getResultList();

		hosp.forEach(h -> {

			h.getHabitaciones().size();

		});

		return hosp;
	}


	@Override
	public List<Hospital> seleccionarFechJoin() {

		TypedQuery<Hospital> myQuery = this.entityManager
				.createQuery("" + "select h from Hospital h full join fetch h.habitaciones ha", Hospital.class);

		List<Hospital> hosp = myQuery.getResultList();

		hosp.forEach(h -> {
			if (h != null) {
				h.getHabitaciones().size();
			}
		});

		return hosp;
	}

}
