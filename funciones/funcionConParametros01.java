package funciones;

import java.util.Scanner;

public class funcionConParametros01 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String turno;
		int cant;
		double compra, descuento, pagar;
		
		System.out.println("Calcular los PASAJES");
		System.out.println("Turnos: Mañana, Tarde y Noche");
		System.out.println("Ingresa el turno: ");
		turno = leer.nextLine();
		System.out.println("Ingresa la cantidad de boletos: ");
		cant = leer.nextInt();
		
		compra=importeCompra(turno, cant);
		descuento=calcularDescuento(cant, compra);
		pagar=importePagar(compra, descuento);
		
		System.out.println("Turno: "+turno);
		System.out.println("La cantidad de boletos es "+cant);
		System.out.println("El importe de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El importe a pagar es s/."+pagar);
		

	}
	
	public static double importeCompra(String turno, int cant) {
		
		double compra=0.0;
		
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
				System.out.println("No hay turno");
	}	
		
		return compra;
	}
	
	public static double calcularDescuento (int cant, double compra) {
		
		double descuento=0.0;
		
		if (cant>10) {
			descuento=0.16*compra;
		} else if (cant>=6) {
			descuento=0.14*compra;
		} else if (cant>=1) {
			descuento=0.12*compra;
		} else {
			descuento=0.0;
	}
		
		return descuento;
	}
	
	public static double importePagar(double compra, double descuento) {
		
		double pagar;
		
		pagar=compra-descuento;
		
		return pagar;
	}
	
	
	
	

}
