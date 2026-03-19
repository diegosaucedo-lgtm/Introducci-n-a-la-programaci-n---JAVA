package introduccion;

import java.util.Scanner;

public class actividad18 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int edad;
		double peso;
		
		System.out.println("Calcular el PESO");
		System.out.println("Ingresa la edad del niño: ");
		edad=leer.nextInt();
		
		peso=(edad*3)+7;
		
		System.out.println("El niño de "+edad+" años pesa "+peso+" kilogramos");

	}

}
