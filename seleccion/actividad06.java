package seleccion;

import java.util.Scanner;

public class actividad06 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String dia;
		int canG, canN;
		double importe = 0;
		
		System.out.println("Calcular el PAGO");
		System.out.println("Ingresa el día: ");
		dia=leer.nextLine();
		System.out.println("Ingresa la cantidad de entradas generales: ");
		canG=leer.nextInt();
		System.out.println("Ingresa la cantidad de entradas de niños: ");
		canN=leer.nextInt();
		
		
		switch (dia) {
		
		case "Lunes":
			importe=(canG*9)+(canN*7);
			break;
		
		case "Martes":
			importe=(canG*7)+(canN*7);
			break;
		
		case "Miércoles":
			importe=(canG*10)+(canN*8);
			break;
			
		case "Jueves":
			importe=(canG*10)+(canN*8);
			break;
			
		case "Viernes":
			importe=(canG*10)+(canN*8);
			break;
			
		case "Sábado":
			importe=(canG*12)+(canN*9);
			break;
			
		case "Domingo":
			importe=(canG*12)+(canN*9);
			break;	
			
		default:
			System.out.println("Error en ingresar el día");
		
		}
		
		System.out.print("El importe a pagar es s/."+importe);
		
		
		
		
	}

}
