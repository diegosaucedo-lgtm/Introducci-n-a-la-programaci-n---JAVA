package condicionales;

import java.util.Scanner;

public class actividad03 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int promedio;
		
		System.out.println("Determinar la catergoría de un ESTUDIANTE");
		System.out.println("Ingresa el promedio ponderado: ");
		promedio = leer.nextInt();
		
		if (promedio>=17) {
			System.out.println("Categoría A");
		}
		
		if (promedio>=14 && promedio<17){
			System.out.println("Categoría B");
		}
		
		if (promedio>=12 && promedio<14){
			System.out.println("Categoría C");
		}

		if (promedio<12){
			System.out.println("Categoría D");
		}
	}

}
