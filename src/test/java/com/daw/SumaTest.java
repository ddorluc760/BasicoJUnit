package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumaTest {
	private Suma suma;
	@BeforeEach
	void setUp() throws Exception {
		suma = new Suma(2,3);
	}
	
	@Test
	void testSuma() {
		//ejecuta la suma
		int resultado = suma.suma();
		
		//con esto verificamos que el resultado es el esperado
		assertTrue(resultado==5);
	}
	
	@Test
	void testResta() {
		int resultado= suma.resta();
		assertTrue(resultado==-1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	}

}
