package procedimientos;

import java.util.Scanner;

public class actividad03 {

	public static void main(String[] args) {
		
		importePagar();
		
	}
	
	public static void importePagar(){
		
		Scanner leer=new Scanner(System.in);
		
		String turno;
		int cant;
		double compra=0.0, descuento=0.0, pagar;
		
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
				System.out.println("No hay turno");
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
		
		System.out.println("Turno: "+turno);
		System.out.println("La cantidad de boletos es "+cant);
		System.out.println("El importe de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El importe a pagar es s/."+pagar);
		
		
		
	}

}
