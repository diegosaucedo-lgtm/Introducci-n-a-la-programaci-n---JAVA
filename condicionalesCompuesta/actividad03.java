package condicionalesCompuesta;

import java.util.Scanner;

public class actividad03 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int nota1, nota2, nota3;
		double promedio;
		
		System.out.println("Calcular si LA CATEGORIA DEL ALUMNO");
		System.out.println("Ingresa la primera nota: ");
		nota1 = leer.nextInt();
		System.out.println("Ingresa la segunda nota: ");
		nota2 = leer.nextInt();
		System.out.println("Ingresa la tercera nota: ");
		nota3 = leer.nextInt();
		
		promedio=(0.20*nota1)+(0.35*nota2)+(0.45*nota3);
		
		if (promedio>=13.0) {
			System.out.println("El alumno está APROBADO con nota "+promedio);	
		}
		else {
			System.out.println("El alumno está DESAPROBADO con nota "+promedio);
		}
				

	}

}
