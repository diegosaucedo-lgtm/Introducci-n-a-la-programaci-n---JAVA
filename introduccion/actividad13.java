package introduccion;

import java.util.Scanner;

public class actividad13 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int docena;
		double precio, compra, pago, descuento;
		
		System.out.println("CALCULAR EL PAGO");
		System.out.println("Ingresa el precio del producto: ");
		precio = leer.nextDouble();
		System.out.println("Ingresa la cantidad de docenas adquiridas: ");
		docena = leer.nextInt();
		
		compra=precio*docena;
		descuento=compra*0.12;
		pago=compra-descuento;
		

		System.out.println("El precio de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El precio a pagar es s/."+pago);
		
		

	}

}
