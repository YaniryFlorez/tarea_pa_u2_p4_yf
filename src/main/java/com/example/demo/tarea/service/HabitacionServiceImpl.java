package com.example.demo.tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea.repository.IHabitacionRepo;
import com.example.demo.tarea.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private  IHabitacionRepo iHabitacionRepo;

	@Override
	public void crear(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.ingresar(habitacion);
	}

	@Override
	public void actualizar(com.example.demo.tarea.repository.modelo.Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.actualizar(habitacion);
	}

	@Override
	public com.example.demo.tarea.repository.modelo.Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.selescionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.eliminar(id);
	}

	@Override
	public List<Habitacion> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Habitacion> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionarOuterFullJoin();
	}

	@Override
	public List<Habitacion> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionarWhereJoin();
	}

	@Override
	public List<Habitacion> buscarJoinFetch() {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.seleccionaroinFetch();
	}
	
	

	
}
