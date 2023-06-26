package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea.repository.modelo.Estudiante;



import com.example.demo.tarea.service.IEstudianteService;

@SpringBootApplication
public class TareaPaU2P4YfApplication implements CommandLineRunner{


	@Autowired
	private IEstudianteService estudianteService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(TareaPaU2P4YfApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

		//CREATE
		Estudiante estu = this.estudianteService.buscarPorNombreTypedQuery("Mabel");
		System.out.println("consulta 1: "+estu);		
		
		estu = this.estudianteService.buscarPorNombreNamedQuery("Mabel");
		System.out.println("consulta 2: "+estu);
		
		estu = this.estudianteService.buscarPorNombreNamedQueryTyped("Mabel");
		System.out.println("consulta 3: "+estu);
		
		estu = this.estudianteService.buscarPorNombreNativeQuery("Mabel");
		System.out.println("consulta 4: "+estu);
	}

}
