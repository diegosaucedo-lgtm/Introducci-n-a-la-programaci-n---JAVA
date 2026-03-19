package condicionales;

import java.util.Scanner;

public class actividad08 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int cant;
		double pagar=0.0, cancelar, descuento=0.0;
		
		System.out.println("Calcular el PAGO");
		System.out.println("Ingresa la cantidad adquirida: ");
		cant = leer.nextInt();
		
		if (cant>=1 && cant<=50) {
			pagar=cant*25.50;
		}
		
		if (cant>=51 && cant<=100) {
			pagar=cant*22.50;
		}
		
		if (cant>=101 && cant<=150) {
			pagar=cant*20.00;
		}
		
		if (cant>150) {
			pagar=cant*18.00;
		}

		if (cant>50) {
			descuento=pagar*0.15;
		}
		
		if (cant<=50) {
			descuento=pagar*0.05;
		}
		
		cancelar=pagar-descuento;
		
		System.out.println("El importe de compra es s/."+pagar);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El importe a pagar s/."+cancelar);
		
		
		
		
	}

}
