package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {

	//Atributos
	
	private String nombre;
	private String legajo;
	private double salario;
	
	
	private static final double SALARIO_MINIMO = 210000;
	private static final double AUMENTO_POR_MERITO = 20000;
	
	
	
	//METODOS
	public String mostrarDatos() {
		String cadena;
		cadena="el Nombre es: "+nombre+"\n";
		cadena=cadena+"el numero de lejaro es:"+legajo+"\n";
		cadena=cadena+"el salario es: "+String.valueOf(salario);
		return cadena;
	}
	
	
	public void AumentarSueldo() { //como no devuelve dato uso VOID
		salario=salario+AUMENTO_POR_MERITO;
		
	}
	
	// CONSTRUCTORES
	/**
	 * Contructor por defecto
	 */
	public Empleado() {
		super();
	}
	
	
	/**
	 * Constructor Parametrizado
	 * 
	 * @param nombre
	 * @param salario
	 * @param legajo
	 */
	public Empleado(String nombre, double salario, String legajo) {
		super();
		this.nombre = nombre;
		this.salario = salario; // es opcional, ya que se ejecuta por el "IF".
		this.legajo = legajo;
		
		if(salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario=SALARIO_MINIMO;
		}
	}
	
	
	
	//gettet y Setter
	
	public static double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}
	public static double getAumentoPorMerito() {
		return AUMENTO_POR_MERITO;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}




}
