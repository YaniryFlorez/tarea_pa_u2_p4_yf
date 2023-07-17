package com.example.demo.tarea.service;

import java.util.List;

import com.example.demo.tarea.repository.modelo.Habitacion;


public interface IHabitacionService {

	public void crear(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void borrar(Integer id);
	
	
	public List<Habitacion> buscarInnerJoin();
	
    public List<Habitacion>  buscarOuterRightJoin();
	
	public List<Habitacion>  buscarOuterLeftJoin();
		
	public List<Habitacion>  buscarOuterFullJoin();
	
	public List<Habitacion>  buscarWhereJoin();
	
	public List<Habitacion> buscarJoinFetch();

}
