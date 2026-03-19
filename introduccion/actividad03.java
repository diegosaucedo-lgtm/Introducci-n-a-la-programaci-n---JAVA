package introduccion;

import java.util.Scanner;

public class actividad03 {
	
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		
		double area, dmayor, dmenor;
		
		System.out.println("Calcular el área de un ROMBO");
		System.out.println("Ingrese la diagonal menor: ");
		dmenor = leer.nextDouble();
		System.out.println("Ingresa la diagonal mayor: ");
		dmayor = leer.nextDouble();
		area=dmayor*dmenor/2;
		System.out.println("El área del rombo es "+area);
		
	}

}
