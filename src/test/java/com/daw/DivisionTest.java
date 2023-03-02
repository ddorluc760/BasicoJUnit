package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDivision() {
		//Ejecutamos la división
		double resultado=Division.dividir(10, 2);
		System.out.println(resultado);
		//Con esto comprobaremos que nos dan los resultados esperados
		assertEquals(5.0,resultado);
	}

}
