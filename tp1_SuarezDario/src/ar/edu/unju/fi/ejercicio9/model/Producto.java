package ar.edu.unju.fi.ejercicio9.model;

import javax.print.attribute.standard.Sides;

public class Producto {
//atributos
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento; //porcentaje entre 0 y 50.
	
	
	
	
	//METODOS
	/**
	 * 
	 * @return el Precio menos el descuento.
	 * o dicho de otro modo El precio con descuento.
	 */
	public double calcularDescuento() {
		double descuentoCalculado=0;
		descuentoCalculado = precio - (precio*(descuento/100));
		return descuentoCalculado;
	}
	
	
	
	//CONSTRUCTORES
	public Producto(String nombre, String codigo, double precio, int descuento) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}
	
	
	
	public Producto() {
		super();
	}


	

	//getter y setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
	
	
}
