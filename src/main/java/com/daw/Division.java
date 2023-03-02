package com.daw;

public class Division {
	private static int a;
	private static int b;
	
	public Division(int a, int b) {
		this.a=a;
		this.b=b;
	}
	/**
	 * Creamos el constructor de la division
	 * return a/b
	 */
	
	public static double dividir(int a, int b) {
		return (double)a/(double)b;
	}
}
