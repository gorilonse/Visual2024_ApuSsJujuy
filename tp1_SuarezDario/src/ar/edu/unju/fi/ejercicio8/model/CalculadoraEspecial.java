package ar.edu.unju.fi.ejercicio8.model;

import java.security.PublicKey;
import java.util.Iterator;

public class CalculadoraEspecial {

	//Atributos
	private int n;


	
	//Metodos
	
	public double calcularSumatoria() {
		double resultado=0;
		for (int i = 1; i <= n; i++) {
			resultado=resultado+Math.pow(((i*(i+1))/2),2);
		}
		return resultado;
	}
	
	
	public double calcularProductoria() {
		double resultado=1;
		for (int i = 1; i <= n; i++) {
			resultado=resultado*(i*(i+4));
			
		}
		
		return resultado;
	}
	
	// Constructores
	/**
	 * Constructor por Defecto
	 */
	public CalculadoraEspecial() {
		super();
	}

	//Getter y Setter
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
