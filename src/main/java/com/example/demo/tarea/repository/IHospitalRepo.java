package com.example.demo.tarea.repository;

import java.util.List;

import com.example.demo.tarea.repository.modelo.Hospital;

public interface IHospitalRepo {

	// create, read, update delete
	public void ingresar(Hospital hospital);
	public void actualizar(Hospital hospital);
	public Hospital selescionar(Integer id);
	public void eliminar(Integer id);
	
	public List<Hospital> seleccionarInnerJoin();
	
    public List<Hospital> seleccionarOuterRightJoin();
	
	public List<Hospital> seleccionarOuterLeftJoin();
		
	public List<Hospital> seleccionarOuterFullJoin();
	
	public List<Hospital> seleccionarWhereJoin();
	
	public List<Hospital> seleccionarFechJoin();
	

}
