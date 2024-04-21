package ar.edu.unju.fi.ejercicio16.main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		
		String [] miArreglo=new String [5];
		Scanner sc = new Scanner(System.in);
		byte indiceAEliminar;
		
		System.out.println("Cargango nombres: \n");
		for (int i = 0; i < miArreglo.length; i++) {
			System.out.println("ingrese un nombre:");
			miArreglo[i]=sc.next();
		}
		System.out.println("************");
		System.out.println("******Eliminando******");
		System.out.println("Ingrese un indice: \n");
		indiceAEliminar=sc.nextByte();
		if(indiceAEliminar >=0 && indiceAEliminar <=4) {
			int aux=indiceAEliminar;
			//int k=indiceAEliminar;
			do {
				if(aux!=miArreglo.length-1) {
					System.out.println("aux: "+miArreglo[aux]);
					System.out.println("indice: "+miArreglo[indiceAEliminar]);
					miArreglo[aux]=miArreglo[aux+1];
				}else {
					miArreglo[aux]="";
				}
				aux++;
				//k++;
			} while (aux <=miArreglo.length-1);
		}
		
		
		
		System.out.println("ver el contenido del Arreglo con While");
		int j = miArreglo.length-1;
		while(j >=0) {
			//System.out.println(" posicion: "+ j+" nombre es:"+miArreglo[j]);
			System.out.print(miArreglo[j] + " ");
			j--;
		}
		
	}
	
	/**
	 * 16. Array.
Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
-Defina y cree un array para almacenar 5 elementos de tipo String. Esos elementos
representan nombres de personas y 
-se debe pedir al usuario que ingrese por consola (utilice la estructura de control repetitiva for para ingresar los
 datos), luego cada nombre ingresado será almacenado en el arreglo.
 
Con la estructura de control repetitiva while muestre los valores guardados en el array.
Muestre el tamaño de array (utilice length).
Solicite al usuario que ingrese un valor de tipo byte que representa el índice de un
elemento a eliminar del arreglo (utilice una estructura de control repetitiva do-while).
Con ese valor de índice elimine el elemento del arreglo, realice el desplazamiento de los
otros elementos si fuera necesario, de otra forma asigne un espacio en blanco para
eliminar el elemento.
Recordar que el tamaño de un arreglo no puede modificarse en ejecución.
Muestre nuevamente el arreglo.
Ejemplo
3
Martina Sergio Sofía Pedro Máximo
Si se ingresa el índice 1 para eliminar, entonces realizo desplazamientos y el arreglo debe
quedar así.
	 */

}
