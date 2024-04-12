package ar.edu.unju.fi.ejercicio5;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		Scanner sc =new Scanner (System.in);
		
		
		
		System.out.println("ingrese un numero entero entre 1 y 9");
		int num=sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(num +"x"+i+" = "+num*i);
			
		}
		
	}

	/*
	 * Estructura de control iterativa – 
	 * estructura de control condicional
Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
Declare las variables necesarias para solicitar al usuario que ingrese por consola un número
entero que esté comprendido entre [1,9],
mostrar por consola la tabla de multiplicar correspondiente al número ingresado. (usar la estructura de control iterativa for)
	 */
}
