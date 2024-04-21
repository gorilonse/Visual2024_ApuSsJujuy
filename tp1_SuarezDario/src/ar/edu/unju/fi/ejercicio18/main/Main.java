package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List<Pais> paises = new ArrayList<Pais>();
		List<DestinoTuristico> destinos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		String codigo,nombre,codigoPais;
		int cantidadDias;
		double precio;
		
		paises.add(new Pais("aaa", "Argentina"));
		paises.add(new Pais("bbb", "Uruguay"));
		paises.add(new Pais("ccc", "Paraguay"));
		paises.add(new Pais("ddd", "Brasil"));

		destinos.add(new DestinoTuristico("111", "Destino 1", 100, new Pais("ddd", "Brasil"),10 ));
		destinos.add(new DestinoTuristico("222", "Destino 2", 200, new Pais("bbb", "Uruguay"),20 ));
		destinos.add(new DestinoTuristico("333", "Destino 3", 300, new Pais("ccc", "Paraguay"),30 ));
		destinos.add(new DestinoTuristico("444", "Destino 4", 400, new Pais("aaa", "Argentina"),40 ));
		
		do {
			System.out.println("*********** MENU *************");
			System.out.println("Seleccione una opcíon");
			System.out.println("1 – Alta de destino turístico (para asociar el país se ingresa el código de páis).");
			System.out.println("2 – Mostrar todos los destinos turísticos.");
			System.out.println("3 – Modificar el país de un destino turístico.");
			System.out.println("4 – Limpiar el ArrayList de destino turísticos.");
			System.out.println("5 – Eliminar un destino turístico (el usuario debe ingresar el código del destino turístico.");
			System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre.");
			System.out.println("7 – Mostrar todos los países.");
			System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país (el usuario ingresa el código de\r\n"
					+ "		país).");
			System.out.println("9 – Salir.");
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
					System.out.println("Codigo");
					codigo=sc.next();
					System.out.println("nombre");
					nombre=sc.next();
					System.out.println("Precio");
					precio=sc.nextDouble();
					System.out.println("Cantidad de dias");
					cantidadDias = sc.nextInt();
					System.out.println("Codigo de pais");
					codigoPais=sc.next();
					Pais nuevoPais = new Pais();
					for(Pais p:paises) {
						if(p.getCodigo().equals(codigoPais)) {
							nuevoPais = p;
							destinos.add(new DestinoTuristico(codigo, nombre, precio, nuevoPais, cantidadDias));
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Debe ingresar valores permitidos");
					e.printStackTrace();
				}
				
			}break;
			case 2: {
				for(DestinoTuristico d:destinos) {
					System.out.println(d.toString());
				}
			}break;
			case 3: {
				try {
					System.out.println("Ingrese el codigo del destino que desea modificar");
					codigo = sc.next();
					Pais nuevoPais = new Pais();
					for(DestinoTuristico d:destinos) {
						if(d.getCodigo().equals(codigo)) {
							d.toString();
							System.out.println("Ingrese el codigo del pais que quiere agregar");
							codigoPais=sc.next();
							for(Pais p:paises) {
								if(p.getCodigo().equals(codigoPais)) {
									nuevoPais = p;
								}
							}
							d.setPais(nuevoPais);
						}
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 4: {
				destinos.clear();
			}break;
			case 5: {
				Iterator<DestinoTuristico> iterator = destinos.iterator();
				System.out.println("Ingrese el codigo del destino a eliminar");
				try {
					codigo=sc.next();
					while(iterator.hasNext()) {
						DestinoTuristico d = iterator.next();
						if(d.getCodigo().equals(codigo)) {
							iterator.remove();
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 6: {
				destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
				for(DestinoTuristico d:destinos) {
					System.out.println(d.toString());
				}
			}break;
			case 7: {
				for(Pais p:paises) {
					System.out.println(p.toString());
				}
			}break;
			case 8: {
				System.out.println("Ingrese codigo de pais");
				try {
					codigoPais = sc.next();
					for(DestinoTuristico d:destinos) {
						if(d.getPais().getCodigo().equals(codigoPais)) {
							System.out.println(d.toString());
						}
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}break;
			case 9: {
				System.out.println("Fin del programa");
			}break;
			default:
				System.out.println("Ingrese un numero del 1 al 8");
			}
		}while(opcion!=9);
	}

}
