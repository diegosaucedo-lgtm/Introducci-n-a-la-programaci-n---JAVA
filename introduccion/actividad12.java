package introduccion;

import java.util.Scanner;

public class actividad12 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int boletos, regalos;
		double precio, compra, pago, descuento;
		
		System.out.println("CALCULAR EL PAGO");
		System.out.println("Ingresa el precio del producto: ");
		precio = leer.nextDouble();
		System.out.println("Ingresa la cantidad adquiridad: ");
		boletos = leer.nextInt();
		
		compra=boletos*precio;
		descuento=0.07*compra;
		regalos=boletos*3;
		pago=compra-descuento;

		System.out.println("El precio de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El precio a pagar es s/."+pago);
		System.out.println("Por la compra se lleva "+regalos+" chocolates de regalo");

	}

}
