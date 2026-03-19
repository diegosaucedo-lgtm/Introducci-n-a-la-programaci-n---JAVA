package funciones;

import java.util.Scanner;

public class funcionSinParametros01 {

	public static void main(String[] args) {

		double pagar;
		
		pagar=importePagar();
		
		System.out.println("El importe a pagar es s/."+pagar);

	}
	
	public static double importePagar() {
		
		Scanner leer=new Scanner(System.in);
		
		double pagar=0.0, compra=0.0, descuento=0.0;
		String turno;
		int cant;
		
		
		System.out.println("Calcular los PASAJES");
		System.out.println("Turnos: Mañana, Tarde y Noche");
		System.out.println("Ingresa el turno: ");
		turno = leer.nextLine();
		System.out.println("Ingresa la cantidad de boletos: ");
		cant = leer.nextInt();
		
		switch (turno) {
			case "Mañana":
				compra=cant*30.0;
			break;

			case "Tarde":
				compra=cant*35.0;
			break;

			case "Noche":
				compra=cant*42.5;
			break;

			default:
				compra=0.0;
		}	
		
		if (cant>10) {
			descuento=0.16*compra;
		} else if (cant>=6) {
			descuento=0.14*compra;
		} else if (cant>=1) {
			descuento=0.12*compra;
		} else {
			descuento=0.0;
		}
		
		pagar=compra-descuento;
		
		return pagar;
		

	}
}
