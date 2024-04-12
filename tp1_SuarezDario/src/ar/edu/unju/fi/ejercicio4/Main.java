package ar.edu.unju.fi.ejercicio4;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int num=0;
		int resultado=1; //como control por si se ingresa 0 en consola es mejor inicializar en cero.
		Scanner sc = new Scanner(System.in);
		
				
		
		System.out.println("Ingrese un numero: ");
		num =sc.nextInt();
		
		for (int j = 1; j <= num; j++) {	
			resultado=resultado*j;
		}
		System.out.println("el factorial de: "+num +" es: "+resultado);
	}

	
	/*
	 * Estructura de control iterativa 
	 * estructura de control condicional.
Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
Declare las variables necesarias para realizar el cálculo del factorial de un número que se introduce
por consola y está dentro del rango numérico [0,10]. Utilice una estructura de control iterativa While
para resolver el ejercicio. Muestre el resultado por consola.
El factorial de un número entero (n!) se calcula de la siguiente forma:
numero! = numero *(numero-1)*(numero-2)...1
0! = 1 (por definición)
1! = 1
2! = 2 * 1 = 2
3! = 3 * 2 * 1 = 6
4! = 4 * 3 * 2 * 1 = 24
	 */
	
}
