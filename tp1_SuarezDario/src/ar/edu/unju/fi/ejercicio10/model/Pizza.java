package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
//atributos
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	private static final double INGREDIENTES_ESPECIALES_20=500;
	private static final double INGREDIENTES_ESPECIALES_30=750;
	private static final double INGREDIENTES_ESPECIALES_40=1000;
	
	
	
	//METODOS
	
	public double calcularPrecio() {
		double precioCalculado=0;
		if(diametro==20 && ingredientesEspeciales!=true) {
			precioCalculado=4500;		
		}else if (diametro==20 && ingredientesEspeciales==true) {
			precioCalculado=4500+INGREDIENTES_ESPECIALES_20;
		}else if (diametro==30 && ingredientesEspeciales!=true) {
			precioCalculado=4800;
		}else if (diametro==30 && ingredientesEspeciales==true) {
			precioCalculado=4800+INGREDIENTES_ESPECIALES_30;
		}else if (diametro==40 && ingredientesEspeciales!=true) {
			precioCalculado=5500;
		}else if (diametro==40 && ingredientesEspeciales==true) {
			precioCalculado=5500+INGREDIENTES_ESPECIALES_40;
		}
		
		return precioCalculado;
	}
	
	public double calcularArea() {
		double areaCalculada=0;
		areaCalculada=Math.PI*Math.pow((diametro/2), 2);
		return areaCalculada;
	}
	
	//CONSTRUCTORES
	
	public Pizza() {
		super();
	}
	
	
	
	//Getter y Setter
	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public static double getIngredientesEspeciales20() {
		return INGREDIENTES_ESPECIALES_20;
	}
	public static double getIngredientesEspeciales30() {
		return INGREDIENTES_ESPECIALES_30;
	}
	public static double getIngredientesEspeciales40() {
		return INGREDIENTES_ESPECIALES_40;
	}
	
	
	
	
	
	
	
	
	
}
