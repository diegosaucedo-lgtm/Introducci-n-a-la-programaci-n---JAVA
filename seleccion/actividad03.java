package seleccion;

import java.util.Scanner;

public class actividad03 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int num;
		
		System.out.println("ESTADO CIVIL");
		System.out.println("Ingresa un número entre 1 y 4: ");
		num = leer.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("Estado civil: SOLTERO");
			break;
			
			case 2:
				System.out.println("Estado civil: CASADO");
			break;
			
			case 3:
				System.out.println("Estado civil: VIUDO");
			break;
			
			case 4:
				System.out.println("Estado civil: DIVORCIADO");
			break;
			
			default:
				System.out.println("Error");
			break;		
		}

	}

}
