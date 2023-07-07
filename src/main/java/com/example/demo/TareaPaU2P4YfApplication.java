package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea.repository.modelo.Estudiante;



import com.example.demo.tarea.service.EstudianteService;

@SpringBootApplication
public class TareaPaU2P4YfApplication implements CommandLineRunner{


	@Autowired
	private EstudianteService estudianteService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(TareaPaU2P4YfApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Estudiante estudiante1 = this.estudianteService.buscarEstudianteDinamicoFecha("123456744",new BigDecimal(250) , LocalDate.of(2000, 01, 01));

		System.out.println(estudiante1);
	}

}
