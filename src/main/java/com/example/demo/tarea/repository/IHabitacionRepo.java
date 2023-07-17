package com.example.demo.tarea.repository;

import java.util.List;

import com.example.demo.tarea.repository.modelo.Habitacion;
import com.example.demo.tarea.repository.modelo.Hospital;


public interface IHabitacionRepo {

	// create, read, update delete
		public void ingresar(Habitacion habitacion);
		public void actualizar(Habitacion habitacion);
		public Habitacion selescionar(Integer id);
		public void eliminar(Integer id);
		
		public List<Habitacion> seleccionarInnerJoin();
		
	    public List<Habitacion> seleccionarOuterRightJoin();
		
		public List<Habitacion> seleccionarOuterLeftJoin();
			
		public List<Habitacion> seleccionarOuterFullJoin();
		
		public List<Habitacion> seleccionarWhereJoin();
		
		public List<Habitacion> seleccionaroinFetch();


	
}
