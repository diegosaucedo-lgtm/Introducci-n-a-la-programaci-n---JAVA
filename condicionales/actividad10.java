package condicionales;

import java.util.Scanner;

public class actividad10 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int dia;
		
		System.out.println("Número del DIA");
		System.out.println("Ingresa el número: ");
		dia = leer.nextInt();
		
		if (dia == 1) {
			System.out.println("Lunes");
		}

		if (dia == 2) {
			System.out.println("Martes");
		}
		
		if (dia == 3) {
			System.out.println("Miércoles");
		}
		
		if (dia == 4) {
			System.out.println("Jueves");
		}
		
		if (dia == 1) {
			System.out.println("Lunes");
		}
		
		if (dia == 5) {
			System.out.println("Viernes");
		}
		
		if (dia == 6) {
			System.out.println("Sábado");
		}
		
		if (dia == 7) {
			System.out.println("Domingo");
		}
		
		if (dia>7) {
			System.out.println("Día desconocido");
		}
		
	}

}
