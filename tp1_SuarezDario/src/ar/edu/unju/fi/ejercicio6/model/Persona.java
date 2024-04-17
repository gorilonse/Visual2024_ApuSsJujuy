package ar.edu.unju.fi.ejercicio6.model;


import java.time.LocalDate;
import java.time.Period;

public class Persona {

	//Atributos
	private String dni;
	private String nombre;
	private String provincia;
	
	private LocalDate fechaNacimientoDate;
	
	
	
	//metodos
	/**
	 * 
	 * @return Calcula la edad de la persona desde su año de nacimiento al año actual.
	 */
	public int calcularEdadDeLaPersona () {
		LocalDate fechaActual = LocalDate.now();
		if((fechaNacimientoDate != null) && (fechaActual != null)) {
			return Period.between(fechaNacimientoDate, fechaActual).getYears();
		}
		
		return 0;
		
	}
	
	/**
	 * 
	 * @return devuelve una bandera si es o no mayor de edad "18 años"
	 */
	public boolean calcularMayorDeEdad () {
		boolean b=false;
		if (calcularEdadDeLaPersona() >= 18) {
			b = true;
		}
		return b;
	}
	
	
	public String mostrarDatos() {
		String datos="dni: ";
		datos=datos +dni+" \n";
		datos=datos + nombre+" \n";
		datos= datos + provincia+" \n";
		datos=datos + String.valueOf(fechaNacimientoDate)+" \n"; //forma de transformar objeto a string
		datos=datos + fechaNacimientoDate.toString()+" \n";      //forma de transformar objeto a string
		datos = datos + String.valueOf(calcularEdadDeLaPersona());
		if(calcularMayorDeEdad()== true) {
			datos=datos+" \n es mayor de edad";
		}else {
			datos=datos+"\n es menor de edad";
		}
		return datos;
	}
	
	
	
	
	@Override
	public String toString() {
		String mayor;
		if(calcularMayorDeEdad()== true) {
			mayor = "es mayor de edad";
		}else {
			mayor = "es menor de edad";
		}
		return "Persona [dni;" + dni + ", nombre;" + nombre + ", provincia;" + provincia + ", fechaNacimientoDate;"
				+ fechaNacimientoDate + ",  ]"+ mayor ;
	}

	//contructores
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param provincia
	 * @param fechaNacimientoDate
	 */
	public Persona(String dni, String nombre, String provincia, LocalDate fechaNacimientoDate) {
		super(); // que inializa cada uno de los atributos, el parametrizado.
		this.dni = dni;
		this.nombre = nombre;
		this.provincia = provincia;
		this.fechaNacimientoDate = fechaNacimientoDate;
	}
	
	/**
	 * Por defecto
	 */
	public Persona () { // contructor por defecto vacio
		
	}
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param fechaNacimientoDate
	 */
	public Persona (String dni, String nombre, LocalDate fechaNacimientoDate) { //con solo 3 atributos
		this.dni=dni;
		this.nombre=nombre;
		this.fechaNacimientoDate=fechaNacimientoDate;
	}
	
	
	//metodos de acceso
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public LocalDate getFechaNacimientoDate() {
		return fechaNacimientoDate;
	}
	public void setFechaNacimientoDate(LocalDate fechaNacimientoDate) {
		this.fechaNacimientoDate = fechaNacimientoDate;
	}
	
	
	
	

	
	
}
