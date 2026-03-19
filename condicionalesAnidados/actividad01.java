package condicionalesAnidados;

import java.util.Scanner;

public class actividad01 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double promedio;
		
		System.out.println("Calcular la CATERGORIA DEL ALUMNO");
		System.out.println("Ingresa el promedio: ");
		promedio = leer.nextDouble();
		
		if (promedio>=17) {
			System.out.println("Categoría A");
		} else if (promedio>=14) {
			System.out.println("Categoría B");
		} else if (promedio>=12) {
			System.out.println("Categoría C");
		} else {
			System.out.println("Categoría D");
		}

	}

}
