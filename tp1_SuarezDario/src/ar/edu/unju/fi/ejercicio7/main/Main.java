package ar.edu.unju.fi.ejercicio7.main;

import java.io.InputStream;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables 
		String nombreMain;
		String legajoMain;
		Double salarioMain;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("Ingresar datos para el nuevo Empleado");
		System.out.println("Cargar Nombre: ");
		nombreMain=sc.next();
		System.out.println("Cargar Legajo: ");
		legajoMain=sc.next();
		System.out.println("ingresar Saladio: ");
		salarioMain=sc.nextDouble();
		
		Empleado empleado01 = new Empleado(nombreMain, salarioMain, legajoMain);
		System.out.println("Datos: \n");
		System.out.println(empleado01.mostrarDatos());
				
		System.out.println("****************");
		System.out.println("****************");
		System.out.println("Dar Aumento");
		empleado01.AumentarSueldo();
		System.out.println(empleado01.mostrarDatos());
		System.out.println("****************");
		System.out.println("****************");
	}

/**
 * Uso de constructor de clase – métodos - constantes - creación de objetos.
Dentro del paquete creado para este ejercicio cree los siguientes paquetes: main y model.
-Dentro del paquete model crear la clase Empleado.
-Dentro de la clase declare los atributos nombre, legajo y salario. 
-El modificador de acceso, para estos atributos es privado.
-Declare 2 constantes dentro de la clase, la primera constante define el salario mínimo y
tiene un valor de 210.000,00$. 
  -La segunda constante define un aumento por méritos con
un valor de 20.000,00$ (leer pdf Programación Java).
-Declare un constructor parametrizado para inicializar los atributos. Dentro del constructor
agregar la lógica para realizar la asignación del salario.
-Si el parámetro salario es mayor o igual al salario mínimo entonces asignar al atributo
salario el valor del parámetro salario.
-Si el parámetro salario es menor que el salario mínimo entonces asignar al atributo salario
el valor de la constante salario mínimo.

-Construya un método que permita mostrar los datos del empleado, ejemplo:
Nombre del empleado: Juan Perez
Legajo: 1245
Salario $: 950.000,75

Construya un método que permita dar un aumento al salario del empleado. Se incrementa
el salario sumándole la constante aumento por méritos.

Dentro del método main() de la clase Main (paquete main) solicite al usuario que ingrese
los datos para un nuevo empleado, utilice el constructor parametrizado para crear el
objeto.
Luego de ingresar los datos, con el objeto creado 
-invoque al método mostrar datos.
-Invoque al método dar aumento y 
-por último vuelva a invocar al método mostrar datos.
 * 
 */
}
