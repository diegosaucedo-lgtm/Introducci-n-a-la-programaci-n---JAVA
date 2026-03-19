package condicionalesCompuesta;

import java.util.Scanner;

public class actividad01 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double precio, pagar, compra, descuento;
		int cant;
		
		System.out.println("Calcular precio del PRODUCTO");
		System.out.println("Ingrese el precio por unidad del producto: ");
		precio = leer.nextDouble();
		System.out.println("Ingrese la cantida: ");
		cant = leer.nextInt();
		
		compra=precio*cant;
		
		if (cant>10) {
			descuento=0.15*compra;
		} 
		else {
			descuento=0.05*compra;
		}

		pagar=compra-descuento;
		
		if (pagar>200) {
			System.out.println("El importe de compra es s/."+compra);
			System.out.println("El descuento es s/."+descuento);
			System.out.println("El total a pagar es s/."+pagar);
			System.out.println("Se lleva de regalo una agenda");
		}
		else {
			System.out.println("El importe de compra es s/."+compra);
			System.out.println("El descuento es s/."+descuento);
			System.out.println("El total a pagar es "+pagar);
			System.out.println("Se lleva de regalo un cuaderno");
		}
	}

}
