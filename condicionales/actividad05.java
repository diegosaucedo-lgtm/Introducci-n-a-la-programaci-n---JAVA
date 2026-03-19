package condicionales;

import java.util.Scanner;

public class actividad05 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String marca;
		int cantidad=0;
		double pagar, compra=0, descuento=0;
		
		System.out.println("Calcular el precio a pagar por un YOGURT");
		System.out.println("Marca 1---> Buena vida");
		System.out.println("Marca 2 ---> Pura salud");
		System.out.println("Marca 3 ---> Todo sabor");
		System.out.println("Marca 4 ---> Todo sabor");
		System.out.println("Ingresa el nombre de la marca: ");
		marca = leer.nextLine();
		System.out.println("Ingresa la cantidad: ");
		cantidad = leer.nextInt();

		if (marca.equals("Buena vida")) {
			compra=3.90*cantidad;
		}
		
		if (marca.equals("Pura salud")) {
			compra=3.80*cantidad;
		}
		
		if (marca.equals("Todo sabor")) {
			compra=4.20*cantidad;
		}
		
		if (marca.equals("Cielo")) {
			compra=3.60*cantidad;
		}
		
		
		if (cantidad<15) {
			descuento=0.04*compra;
		}
		
		if (cantidad>=16 && cantidad<=30) {
			descuento=0.065*compra;
		}
		
		if (cantidad>=31 && cantidad<=45) {
			descuento=0.09*compra;
		}
		
		if (cantidad>45) {
			descuento=0.115*compra;
		}
		
		pagar=compra-descuento;
		
		System.out.println("El monto a pagar es "+pagar);
		System.out.println("El monto de la compra es "+compra);
		System.out.println("El monto del descuento es "+descuento);
		System.out.println(marca);
	}

}
