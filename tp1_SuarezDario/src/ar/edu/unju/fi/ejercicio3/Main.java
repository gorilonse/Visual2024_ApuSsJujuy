package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int a;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Ingresar un numero entero");
	    a = sc.nextInt();
	    
	    if(a%2 == 0) {
	    	System.out.println("es par: "+a*3);
	    	
	    }else {
			System.out.println("es impar: "+a*2 );
		}
	}

	/*
	 * Uso de variables – Estructura de control condicional.
Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
Declare las variables necesarias para realizar lo siguiente:
Solicitar al usuario que ingrese por consola un número entero que debe ser almacenado en una
variable (Investigue como utilizar la clase Scanner para poder ingresar datos por consola).
Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.
	 */
}
