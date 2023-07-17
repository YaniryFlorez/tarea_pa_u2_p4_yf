package com.example.demo.tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tarea.repository.IHospitalRepo;
import com.example.demo.tarea.repository.modelo.Habitacion;
import com.example.demo.tarea.repository.modelo.Hospital;

@Service
public class HospitalServiceImpl implements IHospitalService {
	
	@Autowired
	private IHospitalRepo iHospitalRepo;



	@Override
	public void crear(Hospital hospital) {
		// TODO Auto-generated method stub
		this.iHospitalRepo.ingresar(hospital);
	}

	@Override
	public void actualizar(Hospital hospital) {
		// TODO Auto-generated method stub
		this.iHospitalRepo.actualizar(hospital);
	}

	@Override
	public Hospital buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.selescionar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHospitalRepo.eliminar(id);
	}

	@Override
	public List<Hospital> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Hospital> buacarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.seleccionarOuterRightJoin();
	}

	@Override
	public List<Hospital> buacarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Hospital> buacarOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.seleccionarOuterFullJoin();
	}

	@Override
	public List<Hospital> buacarWhereJoin() {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.seleccionarWhereJoin();
	}

	@Override
	public List<Hospital> buscarFechJoin() {
		// TODO Auto-generated method stub
		return this.iHospitalRepo.seleccionarFechJoin();
	}
	
	

	
}
