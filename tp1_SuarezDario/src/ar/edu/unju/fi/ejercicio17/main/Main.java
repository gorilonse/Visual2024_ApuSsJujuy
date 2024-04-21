package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		int dia,mes,anio, estatura;
		double peso;
		String nombre,apellido,nacionalidad,posicion;

		//Usado para probar
		jugadores.add(new Jugador("Luis", "Lucas",LocalDate.of(1998, 10, 4), "Argentina", 170, 55, "Delantero"));
		jugadores.add(new Jugador("Daniel", "Lopez",LocalDate.of(2000, 1, 3), "Argentina", 172, 75, "Arquero"));
		jugadores.add(new Jugador("Fernando", "Lucas",LocalDate.of(2003, 12, 12), "Argentina", 180, 65, "Defensa"));
		
		
		do {
			System.out.println("*********** MENU *************");
			System.out.println("Seleccione una opcíon");
			System.out.println("1 - Alta Jugador");
			System.out.println("2 – Mostrar los datos del jugador (Ingrese nombre y apellido) ");
			System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
			System.out.println("4 – Modificar los datos de un jugador (Ingrese nombre y apellido)");
			System.out.println("5 – Eliminar un jugador");
			System.out.println("6 – Mostrar la cantidad total de jugadores");
			System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad (Ingresar nacionalidad)");
			System.out.println("8 – Salir.");
			try {
				opcion=sc.nextInt();
			} catch (Exception e) {
				System.out.println(" ------------ Debe ingresar un numero de 1 al 8 --------------");
				sc = new Scanner(System.in);
			}
			
			switch (opcion) {
			case 1: {
				try {
					System.out.println("Ingrese los siguientes datos");
					System.out.println("Nombre");
					nombre=sc.next();
					System.out.println("Apellido");
					apellido=sc.next();
					System.out.println("Fecha de nacimiento");
					System.out.println("dia");
					dia=sc.nextInt();
					System.out.println("mes");
					mes=sc.nextInt();
					System.out.println("año");
					anio=sc.nextInt();
					System.out.println("Nacionalidad");
					nacionalidad=sc.next();
					System.out.println("Estatura en cm");
					estatura=sc.nextInt();
					System.out.println("Peso en kg");
					peso = sc.nextDouble();
					System.out.println("Posicion  (delantero, medio, defensa, arquero)");
					posicion=sc.next();
					jugadores.add(new Jugador(nombre, apellido,LocalDate.of(anio, mes, dia), nacionalidad, estatura, peso, posicion));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 2: {
				try {
					System.out.println("Ingrese Nombre");
					nombre = sc.next();
					System.out.println("Ingrese Apellido");
					apellido = sc.next();
					for(int i = 0; i<jugadores.size();i++) {
						if(jugadores.get(i).getApellido().equals(apellido)&&jugadores.get(i).getNombre().equals(nombre)) {
							System.out.println("Datos del jugador");
							System.out.println(jugadores.get(i).toString());
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 3: {
				jugadores.sort(Comparator.comparing(Jugador::getApellido));
				for(Jugador j:jugadores) {
					System.out.println(j.toString());
				}
			}break;
			case 4: {
				try {
					System.out.println("Ingrese Nombre del jugador a modificar");
					nombre = sc.next();
					System.out.println("Ingrese Apellido del jugador a modificar");
					apellido = sc.next();
					for(int i = 0; i<jugadores.size();i++) {
						if(jugadores.get(i).getApellido().equals(apellido)&&jugadores.get(i).getNombre().equals(nombre)) {
							System.out.println("Datos del jugador antes de modificar");
							System.out.println(jugadores.get(i).toString());
							System.out.println("Ingrese los siguientes datos");
							System.out.println("Nombre");
							nombre=sc.next();
							System.out.println("Apellido");
							apellido=sc.next();
							System.out.println("Fecha de nacimiento");
							System.out.println("dia");
							dia=sc.nextInt();
							System.out.println("mes");
							mes=sc.nextInt();
							System.out.println("año");
							anio=sc.nextInt();
							System.out.println("Nacionalidad");
							nacionalidad=sc.next();
							System.out.println("Estatura en cm");
							estatura=sc.nextInt();
							System.out.println("Peso en kg");
							peso = sc.nextDouble();
							System.out.println("Posicion  (delantero, medio, defensa, arquero)");
							posicion=sc.next();
							jugadores.set(i, new Jugador(nombre, apellido,LocalDate.of(anio, mes, dia), nacionalidad, estatura, peso, posicion) );
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 5: {
				Iterator<Jugador> iterator = jugadores.iterator();
				try {
					System.out.println("Ingrese el nombre del jugador a eliminar");
					nombre=sc.next();
					System.out.println("Ingrese el apellido del jugador a eliminar");
					apellido=sc.next();
					while(iterator.hasNext()) {
						Jugador j = iterator.next();
						if(j.getNombre().equals(nombre)&&j.getApellido().equals(apellido)) {
							iterator.remove();
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 6: {
				System.out.println("La cantidad total de jugadores es: "+jugadores.size());
			}break;
			case 7: {
				int cant=0;
				try {
					System.out.println("Ingrese nacionalidad");
					nacionalidad=sc.next();
					for(int i=0;i<jugadores.size();i++) {
						if(jugadores.get(i).getNacionalidad().equals(nacionalidad)) {
							cant = cant + 1;
						}
					}
					System.out.println("La cantidad de jugadores con esa nacionalidad es "+cant);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 8: {
				System.out.println("Fin del programa");
			}break;
			default:
				System.out.println("Ingrese un numero del 1 al 8");
			}
		}while(opcion!=8);
	}
	
	
	/*
	1 – Alta de jugador
	2 – Mostrar los datos del jugador (el usuario debe ingresar el nombre y el apellido)
	3 – Mostrar todos los jugadores ordenados por apellido.
	4 – Modificar los datos de un jugador (el usuario debe ingresar el nombre y el apellido del
	jugador)
	5 – Eliminar un jugador (el usuario debe ingresar el nombre y apellido. Utilice Iterator).
	6 – Mostrar la cantidad total de jugadores que tiene el ArrayList.
	7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad (el usuario ingresa la
	nacionalidad).
	8 – Salir.
*/

}
