package introduccion;

import java.util.Scanner;

public class actividad11 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int cant;
		double precio, descuento, compra, pago;
		
		System.out.println("CALCULAR EL PAGO");
		System.out.println("Ingresa el precio del producto: ");
		precio = leer.nextDouble();
		System.out.println("Ingresa la cantidad adquiridad: ");
		cant = leer.nextInt();
		
		compra=precio*cant;
		descuento=0.15*compra;
		pago=compra-descuento;
		
		System.out.println("El precio de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El precio a pagar es s/."+pago);

	}

}
