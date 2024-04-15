package ar.edu.unju.fi.ejercicio10.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pizza pizza01=new Pizza();
		Scanner sc = new Scanner(System.in);
		List <Pizza> listaPizzasList = new ArrayList<Pizza>();
		
	//crear objeto	
		for(int i=0;i<=2;i++) {
			System.out.println("Creando Pizza "+ (i+1));
			Pizza pizzaAux=new Pizza();
			System.out.println("Ingresar Diametro: 20 (pizza pequeña), 30 (pizza mediana) o 40 (pizza grande)");
			pizzaAux.setDiametro(sc.nextInt());
			System.out.println("Ingresar si desea ingredienres Especiales: ");
			pizzaAux.setIngredientesEspeciales(sc.nextBoolean());
			if(i==0){
				listaPizzasList.add(pizzaAux);			
			}else if (i==1) {
				listaPizzasList.add(pizzaAux);
			}else if (i==2) {
				listaPizzasList.add(pizzaAux);
			}
		
		}

		//Mostrar Datos
		for (int i = 0; i <= 2; i++) {
			System.out.println("Mostrando datos"+(i+1));
			System.out.println("Diametro: ");
			System.out.println(listaPizzasList.get(i).getDiametro());
			System.out.println("Ingredientes Especiales:");
			System.out.println(listaPizzasList.get(i).isIngredientesEspeciales());
			System.out.println("Precio de la Pizza: ");
			System.out.println(listaPizzasList.get(i).calcularPrecio());
			System.out.println("Area de la Pizza: ");
			System.out.println(listaPizzasList.get(i).calcularArea());
		}
		

	}
/**
 * 10. Uso de constructor de clase – métodos - creación de objetos.
Dentro del paquete creado para este ejercicio cree los siguientes paquetes: model y main.
Dentro de model crear la clase denominada Pizza.
En el paquete main crear la clase denominada Main que contenga el método main().
Los atributos de la clase Pizza son los siguientes:
 -diametro
 -precio
 -area
 -ingredientes especiales (valor de tipo boolean, leer pdf Programación Java)
 -adicional ingredientes especiales 20 (constante = 500$)
 -adicional ingredientes especiales 30 (constante = 750$)
 -adicional ingredientes especiales 40 (constante = 1000$)
-El modificador de acceso de cada atributo es privado.
-Agregue en la declaración de la clase los métodos accesores (getters y setters).

El ejercicio consiste en solicitar al usuario que ingrese por consola los datos de 3 objetos de la clase
Pizza (usar una estructura de control iterativa). Se ingresa el diámetro y si tiene o no ingredientes
especiales (el usuario ingresa true o false).
Utilizar el constructor por defecto para la construcción de los objetos.

Los valores permitidos para el diámetro de las pizzas son: 20 (pizza pequeña), 30 (pizza mediana),
40 (pizza grande).

Crear el método calcularPrecio() que permita establecer el valor del precio de la pizza, el cálculo se
realiza de la siguiente forma:
Si la pizza tiene un diámetro de 20 cm y no lleva ingredientes especiales, el precio es igual a 4500$
Si la pizza tiene un diámetro de 20 cm y lleva ingredientes especiales, el precio es igual a 4500$ más
el valor de la constante adicional ingredientes especiales 20.
Si la pizza tiene un diámetro de 30 cm y no lleva ingredientes especiales, el precio es igual a 4800$
Si la pizza tiene un diámetro de 30 cm y lleva ingredientes especiales, el precio es igual a 4800$ más
el valor de la constante adicional ingredientes especiales 30.
Si la pizza tiene un diámetro de 40 cm y no lleva ingredientes especiales, el precio es igual a 5500$
Si la pizza tiene un diámetro de 40 cm y lleva ingredientes especiales, el precio es igual a 5500$ más
el valor de la constante adicional ingredientes especiales 40.
Crear el método calcularArea(), que actualiza el valor del atributo área.
Luego de ingresar los datos del objeto pizza, se deben mostrar por consola los siguientes valores:
6Ejemplo:
** Pizza 1 **
Diámetro = 10
Ingredientes especiales = false
Precio Pizza = 4500$
Área de la pizza = 78,539818163397
 */
	
}
