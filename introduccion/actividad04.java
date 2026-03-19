package introduccion;

import java.util.Scanner;

public class actividad04 {

	public static void main(String args[]){
		Scanner leer=new Scanner(System.in);
		
		double f, peso;
		int edad;
		
		System.out.println("Hallar la frecuencia cardíaca: ");
		System.out.println("Ingrese la edad: ");
		edad = leer.nextInt();
		System.out.println("Ingrese el peso: ");
		peso = leer.nextDouble();
		f = 210-(0.5*edad)-((0.01*peso)+4);
		System.out.println("La frecuencia cardíaca es "+f);
		
	}
}
