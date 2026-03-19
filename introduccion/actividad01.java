package introduccion;

import java.util.Scanner;

public class actividad01 {

	public static void main (String ars[]){
		Scanner leer = new Scanner(System.in);
		double area, perimetro, base, altura;
		
		System.out.println("Calcular el área y el perímetro de un RECTANGULO");
		System.out.println("Ingresa la base del rectángulo");
		base = leer.nextDouble();
		System.out.println("Ingresa la altura del rectángulo: ");
		altura = leer.nextDouble();
		area=base*altura;
		perimetro=2*(base+altura);
		System.out.println("El área del rectangulo es "+area);
		System.out.println("El perímetro del rectangulo es "+perimetro);
		
		
	}
}
