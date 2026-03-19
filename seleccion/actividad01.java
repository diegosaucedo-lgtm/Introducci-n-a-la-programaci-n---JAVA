package seleccion;

import java.util.Scanner;

public class actividad01 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int opcion, cant;
		double pagar, compra=0, descuento;
		
		System.out.println("Calcular PAGO A LA HELADERIA");
		System.out.println("Marcar de helado: ");
		System.out.println("1. Sol");
		System.out.println("2. Fresa");
		System.out.println("3. Mar");
		System.out.println("4. Rico");
		System.out.println("Ingresa el número de la marca: ");
		opcion = leer.nextInt();
		System.out.println("Ingresa la cantidad: ");
		cant = leer.nextInt();
		
		switch (opcion) {
			case 1:
				compra=cant*1.5;
				break;
				
			case 2:
				compra=cant*2.0;
				break;
				
			case 3:
				compra=cant*1.7;
				break;
				
			case 4:
				compra=cant*2.5;
				break;	
				
			default:
					System.out.println("Error en ingresar el número de la marca");
		}
		
		if(compra>250) {
			descuento=compra*0.05;
			pagar=compra-descuento;
			System.out.println("El importe a pagar es "+pagar);
			System.out.println("El importe de compra es "+compra);
			System.out.println("El importe del descuento es "+descuento);
		} else {
			descuento=0;
			pagar=compra-descuento;
			System.out.println("El importe a pagar es "+pagar);
			System.out.println("El importe de compra es "+compra);
			System.out.println("El importe del descuento es "+descuento);
		}
		
		
		
	}

}
