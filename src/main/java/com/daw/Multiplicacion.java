package com.daw;

public class Multiplicacion {
	private static int a;
	private static int b;
	
	/**
	 * Constructor de Clase
	 * @param a
	 * @param b
	 */
	public Multiplicacion(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static  int multiplicar() {
		return a * b;
	}
}
