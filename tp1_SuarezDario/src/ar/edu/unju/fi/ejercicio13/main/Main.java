package ar.edu.unju.fi.ejercicio13.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList listaEnteros = new ArrayList<>();
		List listaEnteros2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Ingrese un numero: \n" );
			listaEnteros.add(sc.nextInt());
		}
		
		for (int i = 0; i < listaEnteros.size(); i++) {
			System.out.println("indice: "+i);
			System.out.println("Numero guardado: "+listaEnteros.get(i)); 
		}
		
		//CON list
		System.out.println("Ingrese maximo de digitos: \n");
		int max=sc.nextInt();
		for (int i=0; i<max;i++) {
			System.out.println("Ingresar un numero: ");
			//listaEnteros2.set(i, sc.nextInt()); // esta LINEA NO SIRVE NO CARGA NADA, se debe hacer como la sig linea.
			listaEnteros2.add(i, sc.nextInt());
		}
		
		for (int i = 0; i < listaEnteros2.size(); i++) {
			System.out.println("Posicion: "+i);
			System.out.println("Elemento: "+listaEnteros2.get(i));
		}
		
		
		
		
	}

}
