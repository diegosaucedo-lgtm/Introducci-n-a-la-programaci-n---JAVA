package condicionales;

import java.util.Scanner;

public class actividad09 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);

		int nota1, nota2, nota3, nota4;
		double promedio;
		
		System.out.println("Calcular PROMEDIO");
		System.out.println("Ingresa la primera nota: ");
		nota1 = leer.nextInt();
		System.out.println("Ingresa la segunda nota: ");
		nota2 = leer.nextInt();
		System.out.println("Ingresa la tercera nota: ");
		nota3 = leer.nextInt();
		System.out.println("Ingresa la cuarta nota: ");
		nota4 = leer.nextInt();
		
		if (nota1<nota2 && nota1<nota3 && nota1<nota4) {
			promedio=(nota2+nota3+nota4)/3;
			System.out.println("El promedio es "+promedio);
		}
		
		if (nota2<nota1 && nota2<nota3 && nota2<nota4) {
			promedio=(nota1+nota3+nota4)/3;
			System.out.println("El promedio es "+promedio);
		}
		
		if (nota3<nota1 && nota3<nota2 && nota3<nota4) {
			promedio=(nota1+nota2+nota4)/3;
			System.out.println("El promedio es "+promedio);
		}
		
		if (nota4<nota1 && nota4<nota2 && nota4<nota3) {
			promedio=(nota1+nota2+nota3)/3;
			System.out.println("El promedio es "+promedio);
		}
		
		
		
	}

}
