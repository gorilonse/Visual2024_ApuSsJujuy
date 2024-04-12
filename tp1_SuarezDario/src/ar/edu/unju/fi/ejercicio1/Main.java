package ar.edu.unju.fi.ejercicio1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//variables enteras
		int a=3,b=5,c = 7,d=20,e=87,f=1;
		double resultado;
		
		/*
		 * Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
	      Declare 5 variables de tipo entero para almacenar valores numéricos.
	     Asigne valores numéricos a cada una de las variables.
	    Calcule el promedio y guarde el resultado en otra variable. Muestre por consola el resultado
	    obtenido.
	    Ejemplo:
	    8, 5, 1, 20, 9
	    El promedio es: 8.6
		 */
		
		//calcular promedio
		resultado = a+b+c+d+e+f;
		resultado=resultado/5;
		System.out.println("promedio: "+resultado );
	}

	
}
