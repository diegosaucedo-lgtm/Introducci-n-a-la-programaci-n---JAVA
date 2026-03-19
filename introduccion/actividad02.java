package introduccion;

import java.util.Scanner;
public class actividad02 {

	public static void main (String args[]){
		Scanner leer = new Scanner(System.in);
		
		double area, altura, bmayor, bmenor;
		
		System.out.println("Calcular el área de un ROMBO");
		System.out.println("Ingresa la altura: ");
		altura = leer.nextDouble();
		System.out.println("Ingrese la base menor: ");
		bmenor = leer.nextDouble();
		System.out.println("Ingresa la base mayor: ");
		bmayor = leer.nextDouble();
		area=((bmenor+bmayor)*altura)/2;
		System.out.println("El área del rombo es "+area);
		
		
	}
}
