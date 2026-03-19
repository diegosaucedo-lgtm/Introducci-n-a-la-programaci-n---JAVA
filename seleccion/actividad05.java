package seleccion;

import java.util.Scanner;

public class actividad05 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int num;
		
		System.out.println("Calcular el DIA");
		System.out.println("Ingresa un número entero: ");
		num=leer.nextInt();
		
		switch (num) {
		
		case 1:
			System.out.println("Día: LUNES");
			break;
		
		case 2:
			System.out.println("Día: MARTES");
			break;
		
		case 3: 
			System.out.println("Día: MIERCOLES");
			break;
		
		case 4: 
			System.out.println("Día: JUEVES");
			break;
		
		case 5: 
			System.out.println("Día: VIERNES");
			break;
		
		case 6:
			System.out.println("Día: SABADO");
			break;
		
		case 7: 
			System.out.println("Día: DOMINGO");
			break;
		
		default:
			System.out.println("No hay día");
			break;
		
		}
		
	}

}
