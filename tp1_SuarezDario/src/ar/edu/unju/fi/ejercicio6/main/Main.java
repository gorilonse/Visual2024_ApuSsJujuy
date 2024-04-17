package ar.edu.unju.fi.ejercicio6.main;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		
		int dia=0,mes=0,anio=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** ***********");
		System.out.println("***** Constructor por defecto***********");
		System.out.println("***** ***********");
		System.out.println("Ingreser la fecha de nacimiento segun se solicite");
		System.out.println("Ingresar el dia usando un digito o dos si corresponde");
	     dia = sc.nextInt();
	     System.out.println("Ingrese el mes de nacimiento");
	     mes=sc.nextInt();
	     System.out.println("Ingrese el año de nacimiento");
	     anio=sc.nextInt();
	     System.out.println("Cargar DNI");
	     persona.setDni(sc.next());
	     System.out.println("Nombre y Apellido");
	     persona.setNombre(sc.next());
	     System.out.println("Ingrese su Provincia");
	     persona.setProvincia(sc.next());
	     
	     
	     persona.setFechaNacimientoDate(LocalDate.of(anio, mes, dia));
	     System.out.println("su edad es: "+persona.calcularEdadDeLaPersona()); //- Calcular edad de la persona (el método retorna la edad de la persona).
		
	     if(persona.calcularMayorDeEdad() == true) { //solo muestra si es o no mayor de 18 años.
	    	 System.out.println("es mayor de edad");
	     }else {
			System.out.println("no es mayor de edad");
		}
	     
	     System.out.println("con Metodo");
	    System.out.println(persona.mostrarDatos()); //solo muestra datos
	    System.out.println("con ToString \n");
	    System.out.println(persona.toString()); //solo muestra datos otra forma
	    
	    System.out.println("***** ***********");
	    System.out.println("***** Constructor por Parametrizado***********");
	    System.out.println("***** ***********");
	    	    
	    Persona persona2 = new Persona(persona.getDni(), persona.getNombre(), persona.getProvincia(),persona.getFechaNacimientoDate());
	    System.out.println("los datos: "+persona2.mostrarDatos());
	    
	    
	    System.out.println("****************");
	    System.out.println("***** Constructor solo 3 variableso***********");
	    System.out.println("***** ***********");
	    Persona persona3 = new Persona(persona.getDni(), persona.getNombre(), persona.getFechaNacimientoDate());
	    System.out.println("los datos: "+ persona3.mostrarDatos());
	    
	}

	
	
	/*
	 * Uso de constructores de clase – métodos - creación de objetos.
Dentro del paquete creado para este ejercicio cree los siguientes paquetes: main y model
Dentro del paquete model crear una clase java denominada Persona con los siguientes atributos:
 dni
 nombre
 fecha de nacimiento (usar LocalDate)
 provincia
El modificador de acceso es privado para cada uno de los atributos.
Declare los métodos accesores para los atributos de la clase.
Dentro de la clase declare métodos que realicen las siguientes acciones:
- Calcular edad de la persona (el método retorna la edad de la persona). ***
- Verificar si es mayor de edad (el método devuelve true si la edad es mayor a 18 años)****
- Mostrar datos, en este método se muestran todos los datos de la persona, la edad y un
mensaje si es mayor de edad “La persona es mayor de edad”, si no es mayor de edad se
muestra un mensaje “La persona no es mayor de edad”. *****
Agregue los siguientes constructores:
- Constructor por defecto (constructor vacío)
- Constructor que inicialice cada uno de los atributos (constructor parametrizado).
- Constructor que inicialice solo los atributos dni, nombre y fecha de nacimiento. Para el valor
del atributo provincia inicializarlo con valor “Jujuy”.
Dentro del método main() de la clase Main (paquete main) realice:
-
La construcción de un objeto perteneciente a la clase Persona utilizando el constructor por
defecto. Una vez creado el objeto mostrar el mismo por la consola (se deben mostrar todos
los datos, incluyendo la edad y si es mayor de edad).
3- La construcción de un objeto perteneciente a la clase Persona utilizando el constructor
parametrizado. Una vez creado el objeto mostrar el mismo por la consola (se deben mostrar
todos los datos, incluyendo la edad y si es mayor de edad).
- La construcción de un objeto perteneciente a la clase Persona utilizando el constructor que
lleva como parámetros el dni, nombre y fecha de nacimiento. Una vez creado el objeto
mostrar el mismo por la consola (se deben mostrar todos los datos, incluyendo la edad y si
es mayor de edad).
Para la creación de los 3 objetos, los datos se ingresan por consola.
	 */
}
