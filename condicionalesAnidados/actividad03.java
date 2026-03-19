package condicionalesAnidados;

import java.util.Scanner;

public class actividad03 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
			String marca;
			int cant;
			double compra=0.0, descuento=0.0, pagar=0.0;
			
			System.out.println("Calcular el PAGO");
			System.out.println("La marca de aceites: Buena vida, Pura salud, Todo sabor y Cielo");
			System.out.println("Ingresa la marca de aceite: ");
			marca = leer.nextLine();
			System.out.println("Ingresa la cantidad de botellas de aceite: ");
			cant = leer.nextInt();
			
			if (marca.equals("Buena vida")) {
				compra=cant*3.90;
			} else if (marca.equals("Pura salud")) {
				compra=cant*3.80;
			} else if (marca.equals("Todo sabor")) {
				compra=cant*4.20;
			} else if (marca.equals("Cielo")) {
				compra=cant*3.60;
			} else {
				System.out.println("No existe esta marca de aceite");
			}
		
		
			if (cant>=45) {
				descuento=0.115*compra;
			} else {
				if (cant>=30) {
					descuento=0.09*compra;
				} else {
					if (cant>=15) {
						descuento=0.065*compra;
					} else {
						descuento=0.04*compra;
					}
				}
			}
		
			pagar=compra-descuento;
			
			
			System.out.println("El importe de compra es s/."+compra);
			System.out.println("El descuento es s/."+descuento);
			System.out.println("El importe a pagar es s/."+pagar);
		
	}

}
