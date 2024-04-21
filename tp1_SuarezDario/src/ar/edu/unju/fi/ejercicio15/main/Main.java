package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int tamanio=0, numero;
		String [] miArregloStrings;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero entre 5 y 10");
		tamanio=sc.nextInt();
		miArregloStrings=new String [tamanio];
		if(tamanio <= 10 && tamanio >=5) {
			for (int i = 0; i < miArregloStrings.length; i++) {
				System.out.println("Ingrese un nombre");
				miArregloStrings[i]=sc.next();
			}
			System.out.println("*******************");
			System.out.println("*******************");
			System.out.println("Ver contenido del Array");
			System.out.println("Desde Cero \n");
			for (int j = 0; j < miArregloStrings.length; j++) {
				System.out.println("Posicion: "+ j +" Nombre: "+miArregloStrings[j]);
			}
			//System.out.println("*******************");
			System.out.println("Desde la Ultima posicion \n");
			for (int k = miArregloStrings.length-1; k >= 0; k--) { //VER aqui utilice menos uno.
				System.out.println("posicion: "+k+" nombre: "+miArregloStrings[k]);
			  
			}
			
		}else {
			System.out.println("Numero fura de rango.....");
		}
		
		
		
	}

	/**
	 * 15. Array.
Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
Solicitar al usuario que ingrese por consola un número entero, que se encuentre en el
rango [5,10]. 
-Luego crear un array de tipo String donde el tamaño del array es el
número ingresado por el usuario. 

-Luego solicitar al usuario que ingrese (de forma
iterativa) por consola un nombre de persona para guardarlo en el array.
- Por último, mostrar el valor de cada posición comenzando por el primer índice 0. 
-Luego mostrar el contenido del array pero comenzando con la última posición del array.
	 */
}
