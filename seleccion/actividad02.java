package seleccion;

import java.util.Scanner;

public class actividad02 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int num;
		
		System.out.println("Sistema de calificación de DADOS");
		System.out.println("Ingresa el número del dado: ");
		num = leer.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("Calificación: Pésimo");
				break;
			case 2:
				System.out.println("Calificación: Pésimo");
				break;
			case 3:
				System.out.println("Calificación: Regular");
				break;
			case 4:
				System.out.println("Calificación: Regular");
				break;
			case 5:
				System.out.println("Calificación: Muy bien");
				break;
			case 6:
				System.out.println("Calificación: Excelente");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}

}
