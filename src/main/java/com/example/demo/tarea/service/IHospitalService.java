package com.example.demo.tarea.service;

import java.util.List;

import com.example.demo.tarea.repository.modelo.Hospital;


public interface IHospitalService {
	public void crear(Hospital hospital);
	public void actualizar(Hospital hospital);
	public Hospital buscar(Integer id);
	public void borrar(Integer id);

	public List<Hospital> buscarInnerJoin();
	
	public List<Hospital> buacarOuterRightJoin();
	
	public List<Hospital> buacarOuterLeftJoin();
		
	public List<Hospital> buacarOuterFullJoin();
	
	public List<Hospital> buacarWhereJoin();
	
	public List<Hospital> buscarFechJoin();

}
