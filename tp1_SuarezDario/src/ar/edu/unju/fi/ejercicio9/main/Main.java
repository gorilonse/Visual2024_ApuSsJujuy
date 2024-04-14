package ar.edu.unju.fi.ejercicio9.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creamos objetos
        Producto producto1=new Producto();
        Producto producto2=new Producto();
        Producto producto3=new Producto();
        //Producto proAux=new Producto();
        
        Scanner sc =new Scanner(System.in);
        
        //Creacion de Productos
        
        List <Producto> listaProdcutosList = new ArrayList<Producto>();
      //  listaProdcutosList.add(0, producto1);
      //  listaProdcutosList.add(1, producto2);
       // listaProdcutosList.add(2, producto3);
        
        
        
        
        for (int i = 0; i <= 2; i++) {
        	Producto proAux=new Producto();
        	System.out.println("*****************");
        	System.out.println("vamos a crear 3 productos");
        	System.out.println("*****************");
        	System.out.println("ingrese Nombre: ");
        	proAux.setNombre(sc.next());
        	System.out.println("Ingrese codigo: ");
        	proAux.setCodigo(sc.next());
        	System.out.println("Ingrese Precio: ");
        	proAux.setPrecio(sc.nextDouble());
        	System.out.println("Ingrese el Descuento");
        	proAux.setDescuento(sc.nextInt());
        	System.out.println("*****************");
        	System.out.println("*****************");
        	if(i==0) {
        		producto1=proAux;
        		listaProdcutosList.add(producto1);
        	}else if (i==1) {
				producto2=proAux;
				listaProdcutosList.add(producto2);
			}else if(i==2){
				producto3=proAux;
				listaProdcutosList.add(producto3);
					}
		}
       System.out.println("ver los datos: ");
       for(int i=0; i<=2; i++) {
    	   System.out.println(listaProdcutosList.get(i).getNombre());
    	   System.out.println(listaProdcutosList.get(i).getCodigo());
    	   System.out.println(listaProdcutosList.get(i).calcularDescuento());
    	   
       }
		
		
	}

	/**
	 * 9. Uso de constructor de clase – métodos - creación de objetos.
Dentro del paquete creado para este ejercicio cree los siguientes paquetes: model y main, dentro de
model crear la clase denominada Producto. En el paquete main crear la clase denominada Main que
contenga el método main().

Los atributos de clase Producto son:
 Nombre
 Código
 Precio
 Descuento (valor entero comprendido entre [0,50])
-El modificado de acceso de cada atributo es privado.
-Agregue en la declaración de la clase los métodos accesores (getters y setters).
-Utilizar el constructor por defecto.
-Un método llamado calcularDescuento() que devuelva el resultado de calcular el descuento del
producto si es que tuviera descuento, lo que retorna representa el precio con descuento.

En el método main() de la clase Main solicite al usuario que ingrese por consola los valores para cada
atributo de la clase para construir:
-3 objetos de la clase Producto. (usar estructura de control iterativa).
Muestre los datos ingresados para cada producto y el resultado de calcularDescuento().
	 */
	
}
