package condicionalesAnidados;

import java.util.Scanner;

public class actividad02 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String marca;
		int cant;
		double pagar, compra=0, descuento;
		
		System.out.println("Cacular el monto de la COMPRA");
		System.out.println("Tenemos las marcas de aceite: Primor, Girasol, Cil y Cocinero");
		System.out.println("Ingresa la marca: ");
		marca = leer.nextLine();
		System.out.println("Ingresa la cantidad de litro: ");
		cant = leer.nextInt();
		
		if (marca.equals("Primor")) {
			compra=5.99*cant;
		} else {
			if (marca.equals("Girasol")){
				compra=5.50*cant;
				
			} else {
				if (marca.equals("Cocinero")) {
					compra=4.50*cant;
				} else {
					if (marca.equals("Cocinero")){
						compra=4.70*cant;
					} else {
						System.out.println("Error en ingresar el nombre de la marca de aceite");					
					}
				}
			}
		}
		
		if (cant>=10) {
			descuento=compra*0.125;
		} else if (cant>=7) {
			descuento=compra*0.10;
			} else if (cant>=4) {
				descuento=compra*0.075;
				} else {
					descuento=compra*0.05;
		}
		
		pagar=compra-descuento;
		
		System.out.println("La marca elegida es "+marca);
		System.out.println("El monto de compra es "+compra);
		System.out.println("El monto del descuento es "+descuento);
		System.out.println("El monto a pagar es "+pagar);
		
	}
}