package condicionalesCompuesta;

import java.util.Scanner;

public class actividad04 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int num;
		double compra, pagar, descuento;
		
		System.out.println("Calcular el PAGO");
		System.out.println("Ingresa el número oculto de la tarjeta: ");
		num = leer.nextInt();
		System.out.println("Ingresa el importe de compra: ");
		compra = leer.nextDouble();
		
		if (num > 100) {
			descuento=compra*0.15;
		} else {
			descuento=compra*0.05;
		}
		
		
		pagar=compra-descuento;
		
		System.out.println("El número de la tarjeta es "+num);
		System.out.println("El importe de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El importe a pagar es s/."+pagar);

	}

}
