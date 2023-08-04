package com.example.demo.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class); 

	public static void main(String[] args) {


		LOG.info("Metodos High Order");
		// Supplier
		LOG.info("Supplier");
		// 1. Clase
		IPersonaSupplier<String> supplierHO = new PersonaSupplierImpl();
		MetodosHighOrder.metodoSupplier(supplierHO);

		// 2. Lambda

		MetodosHighOrder.metodoSupplier(() -> "17123456789HO");

		// 3. metodos referenciados
		LOG.info("Metodo referenciado>>");
		MetodosHighOrder.metodoSupplier(MetodosReferenciados::getIdHO);

		// Consumer
		LOG.info("Consumer");
		// 1. Clase
		MetodosHighOrder.metodoConsumer(new PersonaConsumerImpl(), "Maria");

		// 2. Lambda
		MetodosHighOrder.metodoConsumer((str) -> LOG.info("lambda " + str), "Mario");

		// 3. metodos referenciados
		LOG.info("Metodo referenciado>>");
		MetodosHighOrder.metodoConsumer(MetodosReferenciados::acceptar, "Luis");

		// Predicate
		LOG.info("Predicate");
		// 1.- Clase
		MetodosHighOrder.metodoPredicate(new PersonaPredicateImpl(), 25);

		// 2.- Lambda
		MetodosHighOrder.metodoPredicate((numero) -> {
			LOG.info("Lambda HO");
			return numero.compareTo(0) >= 0;
		}, -8);
		LOG.info("Metodo referenciado>>");
		// 3.- Metodos referenciados
		MetodosHighOrder.metodoPredicate(MetodosReferenciados::evaluar, 3);

		// Function
		LOG.info("Function");
		// 1.- Clase
		MetodosHighOrder.metodoFunction(new PersonaFunctionImpl(), "12345");

		// 2.- Lambda
		MetodosHighOrder.metodoFunction((arg) -> Integer.valueOf(arg) * 1000, "67890");
		LOG.info("Metodo referenciado>>");
		// 3.- Metodos referenciados
		MetodosHighOrder.metodoFunction(MetodosReferenciados::aplicar, "11234");

		// Unary operator
		LOG.info("Unary operator");
		// 1.- Clase
		MetodosHighOrder.metodoUnaryOperator(new PersonaUnaryOperatorImpl(), "metodo Unary Operator");

		// 2.- Lambda
		MetodosHighOrder.metodoUnaryOperator((cadena) -> cadena + "Lambda Unary O", "metodo Unary Operator");
		LOG.info("Metodo referenciado>>");
		// 3.- Metodos referenciados
		MetodosHighOrder.metodoUnaryOperator(MetodosReferenciados::aplicarStrStr, "abcd");

		
	}

}
