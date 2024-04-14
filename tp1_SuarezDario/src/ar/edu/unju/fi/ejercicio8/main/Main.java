package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculadoraEspecial calc01=new CalculadoraEspecial();
		
		System.out.println("Ingrese numero: ");
		Scanner sc = new Scanner (System.in);
		calc01.setN(sc.nextInt());
		System.out.println("Sumatoria es: ");
		System.out.println(calc01.calcularSumatoria());
		System.out.println("*************");
		System.out.println("*************");
		System.out.println("Productoria es: ");
		System.out.println(calc01.calcularProductoria());
		System.out.println("*************");
		System.out.println("*************");
	}

	
	/**
	 * 8. Uso de constructor de clase – métodos - creación de objetos.
Dentro del paquete creado para este ejercicio cree los siguientes paquetes: model y main.
Dentro del paquete model crear la clase denominada CalculadoraEspecial.
En el paquete main crear la clase denominada Main que contenga el método main().
El atributo de la clase es n (valor numérico entero).
4El modificado de acceso del atributo es privado.
Agregue en la declaración de la clase los métodos accesores (getters y setters).
Un constructor por defecto.
Un método llamado calcularSumatoria() que devuelva el resultado del siguiente cálculo:
n
∑[
k=1
n
∑[
k=1
k ∗ (k + 1) 2
]
2
k ∗ (k + 1) 2
1 ∗ (1 + 1) 2
2 ∗ (2 + 1) 2
] =[
] +[
]
2
2
2
Utilice la estructura de control iterativa “for”
Un método llamado calcularProductoria() que devuelva el resultado del siguiente cálculo:
n
∏ k ∗ (k + 4)
k=1
n
∏ k ∗ (k + 4) = 1 ∗ (1 + 4) ∗ 2 ∗ (2 + 4)
k=1
Utilice la estructura de control iterativa “for”
En el método main() de la clase Main solicite al usuario que ingrese por consola el valor de n para
construir un objeto de la clase CalculadoraEspecial.
Invoque los métodos del objeto y muestre el resultado por consola.
	 */
}
