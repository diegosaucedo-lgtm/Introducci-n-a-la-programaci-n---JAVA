package condicionales;

import java.util.Scanner;

public class actividad07 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double velocidad;
		
		System.out.println("Calcular la MULTA");
		System.out.println("Ingresa la velocidad del vehículo: ");
		velocidad = leer.nextDouble();
		
		if (velocidad>100) {
			System.out.println("La multa es de 200 euros");
		}
		
		if (velocidad<=100 && velocidad>=91) {
			System.out.println("La multa es de 140 euros");
		}
		
		if (velocidad<91 && velocidad>=71) {
			System.out.println("La multa es de 100 euros");
		}
		
		if (velocidad<=70) {
			System.out.println("No hay multa");
		}
		
		

	}

}
