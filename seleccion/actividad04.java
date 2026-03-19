package seleccion;

import java.util.Scanner;

public class actividad04 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String libro;
		int  cant;
		double descuento=0.0, compra=0.0, pagar=0.0;
		
		System.out.println("Calcular el precio del PAGO");
		System.out.println("Marca de los libros: ");
		System.out.println("1. Java 2 a Fondo");
		System.out.println("2. HTML 5 Fácil");
		System.out.println("3. Aprende C++");
		System.out.println("4. Compendio de Javascript");
		System.out.println("Ingresa el libro a comprar: ");
		libro = leer.nextLine();
		System.out.println("Ingresa la cantidad de libros: ");
		cant = leer.nextInt();
		
		switch (libro) {
			case "Java 2 a Fondo":
				compra=cant*30;
			break;
			
			case "HTML 5 Fácil":
				compra=cant*27;
			break;
			
			case "Aprende C++":
				compra=cant*20;
			break;
			
			case "Compendio de Javascript":
				compra=cant*35;
			break;
			
			default:
				System.out.println("No hay el libro");
			break;
			
		}
		
		if (compra>=300) {
			descuento=compra*0.11;
		} else if (compra>=200) {
			descuento=compra*0.09;
		} else if (compra>=100) {
			descuento=compra*0.07;
		} else {
			descuento=compra*0.05;
		}
		
		
		pagar=compra-descuento;
		
		
		System.out.println("El importe de compra es s/."+compra);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El importe a pagar es s/."+pagar);
		
		
		
		

	}

}
