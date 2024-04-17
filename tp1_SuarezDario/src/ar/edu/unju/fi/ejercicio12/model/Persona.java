package ar.edu.unju.fi.ejercicio12.model;

import java.security.MessageDigest;
import java.text.BreakIterator;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;

public class Persona {

	//Atributos
	private String nombre;
	private Calendar fechaNacimiento = Calendar.getInstance();
	
	
	
	//METODOS
	
	/**
	 * 
	 * @return Conocer el mes y dia cargado.
	 */
	public int mesesillo() {
		return fechaNacimiento.get(Calendar.MONTH); //devuelve el mes en entero
		// return fechaNacimiento.get(Calendar.DAY_OF_YEAR); //devulve el dia correctamente
	}
	
	
	public String EstacionDelAnio() {
		String estacion="sin estacion";
	    switch (fechaNacimiento.get(Calendar.MONTH)) {
		case 1,2,3:
			estacion="Verano";
			break;
		case 4,5,6:
			estacion="Otoño";
		break;
		case 7,8,9:
			estacion="Invierno";
		break;
		case 10,11,12:
			estacion="Primavera";
		default:
			break;
		}
		
		return estacion;
	}
	
	public String mostrarFecha() {
		String cadena;
		cadena = fechaNacimiento.get(Calendar.DAY_OF_MONTH)+ "/"+fechaNacimiento.get(Calendar.MONTH)+"/"+fechaNacimiento.get(Calendar.YEAR);
		return cadena;
	}
	
	public String mostrarSignoZodiaco() {
		String signo="nada";
		int mesNacimiento = fechaNacimiento.get(Calendar.MONTH);
		
		switch(mesNacimiento){
			case 1 :
				signo="Aries";
				break;
			case 2 :
				signo="Tauro";
				break;
			case 3:
				signo="Geminis";
			    break;
			case 4:
				signo="Cancer";
				break;
			case 5:
				signo="Leo";
				break;
			case 6:
				signo="Virgo";
				break;
			case 7:
				signo="Libra";
				break;
			case 8:
				signo="Scorpio";
				break;
			case 9:
				signo="Sagitario";
				break;
			case 10:
				signo="Capricornio";
				break;
			case 11:
				signo="Acuario";
				break;
			case 12:
				signo="Picis";
				break;
			default:
				signo ="no tiene signo";
			break;
		}
		
		return signo;
	}
	
	/**
	 * Metodo CargaFechaNacimiento
	 * @param anio
	 * @param mes
	 * @param dia
	 */
	public void cargarFechaNacimiento(int anio, int mes, int dia) {
		//System.out.println("Ingrese año: ");
		//fechaNacimiento.set(Calendar.YEAR, anio);
		//System.out.println("Ingrese mes: ");
		//fechaNacimiento.set(Calendar.MONTH,mes);
		//System.out.println("Dia: ");
		//fechaNacimiento.set(Calendar.DAY_OF_YEAR, dia);
		//una sola linea
		fechaNacimiento.set(anio, mes, dia);
	}
	
	/*
	 * Calcula Cantidad de Años
	 */
	public int cantidadDeAnios() {
		int anios=0;
		Calendar fechaActual = Calendar.getInstance();
		int dia = fechaActual.get(Calendar.DAY_OF_YEAR);
		int mes = fechaActual.get(Calendar.MONTH)+1;
		int anio = fechaActual.get(Calendar.YEAR);
		anios = anio - fechaNacimiento.get(Calendar.YEAR);
		return anios;
	}
	
	
	
	
	
	// CONSTRUCTORES
	
	
	/**
	 * Cons. Sin Parametro
	 */
	public Persona() {
		super();
	}
	
	
	/**
	 * Cons. con Parametro
	 * @param nombre
	 * @param fechaNacimiento
	 */
	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
}
