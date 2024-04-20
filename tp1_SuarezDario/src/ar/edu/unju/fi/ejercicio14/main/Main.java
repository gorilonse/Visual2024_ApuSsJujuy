package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int tamanio;
		int [] miArreglo;
		Scanner sc =new Scanner (System.in);
		System.out.println("*****************");
		System.out.println("*****************");
		System.out.println("Definiendo tamñao del Array o Vector");
		System.out.println("Ingrese un Numero entero entre 3 y 10");
		System.out.println("");
		tamanio=sc.nextInt();
		
		if(tamanio >= 3 && tamanio <=10) {
			System.out.println("*****************");
			System.out.println("*****************");
			miArreglo=new int [tamanio];
			System.out.println("Cargando el Array o Arreglo");
			for (int i = 0; i < miArreglo.length; i++) {
				System.out.println("Escribir un numero entero: ");
				miArreglo[i]=sc.nextInt();
			}
			System.out.println("*****************");
			System.out.println("*****************");
			System.out.println("Mostrando el Array o Arreglo");
			for (int i = 0; i < miArreglo.length; i++) {
				System.out.println(miArreglo[i]);
				//System.out.print(miArreglo[i]);
			}
			
		}else {
			System.out.println("El numero ingresado esta fuera del rango");
		}
	}

	/**
	 * Array.
Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
Solicitar al usuario que ingrese por consola un número entero, que se encuentre en el
rango [3,10]. Luego crear un array de tipo entero donde el tamaño del array es el número
ingresado por el usuario. Luego solicitar al usuario (de forma iterativa) que ingrese por
consola un número entero para guardarlo en el array. Por último, mostrar el valor de
cada posición y la suma de todos los valores.
	 */
}
