package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

import javax.tools.Diagnostic;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		int anio,mes,dia;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Año: ");
		anio=sc.nextInt();
		System.out.println("Mes: ");
		mes=sc.nextInt();
		System.out.println("Dia: ");
		dia=sc.nextInt();
		
		persona1.cargarFechaNacimiento(anio, mes, dia);
	    System.out.println("Nombre: "+persona1.getNombre());
	    System.out.println("Fecha Nacimiento: "+persona1.mostrarFecha());
		System.out.println("Edad: "+ persona1.cantidadDeAnios()+" Años");
	    System.out.println("El signo es: "+persona1.mostrarSignoZodiaco());
	    System.out.println("Estacion: "+persona1.EstacionDelAnio());
	    //System.out.println("mes 01: "+persona1.getFechaNacimiento().DAY_OF_MONTH);
	   
	   
		
	}

}
