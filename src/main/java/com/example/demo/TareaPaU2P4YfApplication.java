package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea.repository.modelo.CuentaBanciaria;
import com.example.demo.tarea.repository.modelo.Estudiante;
import com.example.demo.tarea.repository.modelo.Habitacion;
import com.example.demo.tarea.repository.modelo.Hospital;
import com.example.demo.tarea.service.EstudianteService;
import com.example.demo.tarea.service.IClienteService;
import com.example.demo.tarea.service.ICuentaBancariaService;
import com.example.demo.tarea.service.IHabitacionService;
import com.example.demo.tarea.service.IHospitalService;
import com.example.demo.tarea.service.ITransferenciaGestorService;

@SpringBootApplication
public class TareaPaU2P4YfApplication implements CommandLineRunner{


	@Autowired
	private ICuentaBancariaService cuentaService;
	
	@Autowired
	private IClienteService clienteService;

	@Autowired
	private ITransferenciaGestorService tranService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(TareaPaU2P4YfApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		
		// Opcion 1
		        CuentaBanciaria bancariaOrigen = new CuentaBanciaria();
				bancariaOrigen.setNumero("0123456787");
				bancariaOrigen.getCliente();
				bancariaOrigen.setTipo("A");
				bancariaOrigen.setSaldo(new BigDecimal(200));

				this.cuentaService.crear(bancariaOrigen);

				CuentaBanciaria bancariaDestino = new CuentaBanciaria();
				bancariaDestino.setNumero("9876543218");
				bancariaDestino.setCedula("1725840538");
				bancariaDestino.setTipo("C");
				bancariaDestino.setSaldo(new BigDecimal(100));

				this.cuentaService.crear(bancariaDestino);

				// Opcion 2
				this.gestorService.transferir("0123456789", "9876543210", new BigDecimal(100));

				// Opcion3
				this.cuentaService.buscar(bancariaOrigen.getNumero());
		
		
	}

}
