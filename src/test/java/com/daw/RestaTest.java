package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestaTest {
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testResta() {
		
		//Ejecuta la resta
		int resultado=Resta.restar(2,3);
		
		//Con esto verificamos que el resultado es el que esperamos 
		assertTrue(resultado==-1);
	}

}
