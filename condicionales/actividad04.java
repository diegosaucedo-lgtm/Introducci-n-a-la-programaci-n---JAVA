package condicionales;

import java.util.Scanner;

public class actividad04 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double compra=0, pagar, descuento=0;
		int cantidad, producto;
		
		System.out.println("Calcular el precio a pagar por un PRODUCTO");
		System.out.println("Producto 1 ---> 1");
		System.out.println("Producto 2 ---> 2");
		System.out.println("Producto 3 ---> 3");
		System.out.println("Ingresa el producto: ");
		producto = leer.nextInt();
		System.out.println("Ingresa la cantidad: ");
		cantidad = leer.nextInt();
		
		if (producto == 1 ) {			
			compra=17.5*cantidad;
		}
		
		if (producto == 2 ) {		
			compra=25.0*cantidad;
		}
		
		if (producto == 3 ) {		
			compra=15.5*cantidad;
		}
		
		if (cantidad>=1 && cantidad<=10) {
			descuento=0.05*compra;
		}
		
		if (cantidad>=11 && cantidad<=20) {
			descuento=0.075*compra;
		}
			
		if (cantidad>=21) {
			descuento=0.10*compra;
		}
		
		pagar=compra-descuento;
		
		System.out.println("El monto a pagar es "+pagar);
		System.out.println("El monto de la compra es "+compra);
		System.out.println("El monto del descuento es "+descuento);
	}

}
