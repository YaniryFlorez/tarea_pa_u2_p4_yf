package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea.repository.modelo.Estudiante;
import com.example.demo.tarea.repository.modelo.Habitacion;
import com.example.demo.tarea.repository.modelo.Hospital;
import com.example.demo.tarea.service.EstudianteService;
import com.example.demo.tarea.service.IHabitacionService;
import com.example.demo.tarea.service.IHospitalService;

@SpringBootApplication
public class TareaPaU2P4YfApplication implements CommandLineRunner{


	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	@Autowired
	private IHospitalService hospitalService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(TareaPaU2P4YfApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Hospital hos = new Hospital();
		Habitacion hab = new Habitacion();

		hos.setNombre("Baca Ortiz");
		hos.setDireccion("sector centro");
		this.hospitalService.crear(hos);
		/*
		hab.setNumero("hab002");
		hab.setValor(new BigDecimal(17));
		hab.setCamillas("3");
		hab.setHospital(hos);
		
		this.habitacionService.crear(hab);
		
		System.out.println("********  INNER JOIN ********");
		List<Hospital> hosp1= this.hospitalService.buscarInnerJoin();
		hosp1.forEach(h ->{
			System.out.println("#HOSPITAL#");
			System.out.println(h);
			System.out.println("Habitaciones");
			System.out.println(h.getHabitaciones());
		});
		
		System.out.println("********  OUTER RIGHT JOIN  ********");
		List<Hospital> hosp2= this.hospitalService.buacarOuterRightJoin();
		hosp2.forEach(h ->{
			System.out.println("#HOSPITAL#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Habitaciones:");
				System.out.println(h.getHabitaciones());
			}else {
				System.out.println("No existe ");
			}
			
		});
		
		System.out.println("********  OUTER LEFT JOIN  ********");
		List<Hospital> hosp3= this.hospitalService.buacarOuterLeftJoin();
		hosp3.forEach(h ->{
			System.out.println("#HOSPITAL#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Habitaciones:");
				System.out.println(h.getHabitaciones());
			}else {
				System.out.println("No existe ");
			}
			
		});
			
		System.out.println("********  OUTER FULL JOIN  ********");
		List<Hospital> hosp4= this.hospitalService.buacarOuterFullJoin();
		hosp4.forEach(h ->{
			System.out.println("#HOSPITAL#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Habitaciones:");
				System.out.println(h.getHabitaciones());
			}else {
				System.out.println("No existe ");
			}
			
		});
		
		System.out.println("********WHERE JOIN********");
		List<Hospital> hosp5= this.hospitalService.buacarWhereJoin();
		hosp5.forEach(h ->{
			System.out.println("#HOSPITAL#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Habitaciones:");
				System.out.println(h.getHabitaciones());
			}else {
				System.out.println("No existe ");
			}
			
		});  
		
		System.out.println("******** FETCH JOIN********");
		List<Hospital> hosp6= this.hospitalService.buscarFechJoin();
		hosp6.forEach(h ->{
			System.out.println("#HOSPITAL#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Habitaciones:");
				System.out.println(h.getHabitaciones());
			}else {
				System.out.println("No existe ");
			}
			
		});  
		*/
		//HABITACION
		
		System.out.println("********  INNER JOIN ********");
		List<Habitacion> habit1= this.habitacionService.buscarInnerJoin();
		habit1.forEach(h ->{
			System.out.println("#HABITACION#");
			System.out.println(h);

			if(h!=null) {
				System.out.println("Hospital:");
				System.out.println(h.getHospital());
			}else {
				System.out.println("No existe ");
			}
		});
		
		System.out.println("********  OUTER RIGHT JOIN  ********");
		List<Habitacion> habit2= this.habitacionService.buscarOuterRightJoin();
		habit2.forEach(h ->{
			System.out.println("#HABITACION#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Hospital:");
				System.out.println(h.getHospital());
			}else {
				System.out.println("No existe ");
			}
			
		});
		
		System.out.println("********  OUTER LEFT JOIN  ********");
		List<Habitacion> habit3= this.habitacionService.buscarOuterLeftJoin();
		habit3.forEach(h ->{
			System.out.println("#HABITACION#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Hospital:");
				System.out.println(h.getHospital());
			}else {
				System.out.println("No existe ");
			}
			
		});
			
		System.out.println("********  OUTER FULL JOIN  ********");
		List<Habitacion> habit4= this.habitacionService.buscarOuterFullJoin();
		habit4.forEach(h ->{
			System.out.println("#HABITACION#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Hospital:");
				System.out.println(h.getHospital());
			}else {
				System.out.println("No existe ");
			}
			
		});
		
			System.out.println("********WHERE JOIN********");
		List<Habitacion> hait5= this.habitacionService.buscarWhereJoin();
		hait5.forEach(h ->{
			System.out.println("#HABITACION#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Hospital:");
				System.out.println(h.getHospital());
			}else {
				System.out.println("No existe ");
			}
			
		}); 
		
		System.out.println("********  FETCH JOIN ********");
		List<Habitacion> habit6= this.habitacionService.buscarJoinFetch();
		habit6.forEach(h ->{
			System.out.println("#HABITACION#");
			System.out.println(h);
			if(h!=null) {
				System.out.println("Hospital:");
				System.out.println(h.getHospital());
			}else {
				System.out.println("No existe ");
			}
			
		}); 
		
		
	}

}
