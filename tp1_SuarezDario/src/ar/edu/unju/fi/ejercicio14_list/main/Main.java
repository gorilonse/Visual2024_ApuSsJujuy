package ar.edu.unju.fi.ejercicio14_list.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int tamanio,numero;
		Scanner sc = new Scanner(System.in);
		List <Integer> miLista = new ArrayList<>();
		ArrayList<Integer> otraLista = new ArrayList<>();
		
		System.out.println("***************");
		System.out.println("***************");
		System.out.println("Definir tamaño de la lista");
		System.out.println("ingrese un numero entre 3 y 10");
		tamanio=sc.nextInt();
		// miLista.ensureCapacity(tamanio); //CONSULTAR esto no funciona
		otraLista.ensureCapacity(tamanio);

		if(tamanio >=3 && tamanio <=10) {
			System.out.println("***************");
			System.out.println("***************");
			System.out.println("Cargando los Numeros \n");
			for (int i = 0; i < tamanio; i++) {
				System.out.println("ingrese un numero entero: ");
				numero=sc.nextInt();
				// miLista.add(numero);
				otraLista.add(numero);
			}
			System.out.println("***************");
			System.out.println("***************");
			System.out.println("existen: "+otraLista.size()+" elementos"); // el size me trae la cantidad de elementos.
			for (int i = 0; i <otraLista.size(); i++) {
				System.out.println(""+otraLista.get(i));
				
			}
			System.out.println("***************");
			System.out.println("***************");	
				
		   }else {
			System.out.println("Tamaño fuera de rango ");
		}
		
		
		
	}

	/**
	 * 14. Array.
Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
Solicitar al usuario que ingrese por consola un número entero, que se encuentre en el
rango [3,10]. Luego crear un array de tipo entero donde el tamaño del array es el número
ingresado por el usuario. Luego solicitar al usuario (de forma iterativa) que ingrese por
consola un número entero para guardarlo en el array.
	 */
}
