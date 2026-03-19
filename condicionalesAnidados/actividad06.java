package condicionalesAnidados;

import java.util.Scanner;

public class actividad06 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String planeta;
		
		System.out.println("Señala la VELOCIDAD DE ESCAPE");
		System.out.println("Ingresa el nombre del planeta: ");
		planeta=leer.nextLine();
		
		if (planeta.equals("Mercurio")){
			System.out.println("La velocidad de escape es 4.2 km/seg");
		} else if (planeta.equals("Venus")) {
			System.out.println("La velocidad de escape es 10.3 km/seg");
		} else if (planeta.equals("Tierra")) {
			System.out.println("La velocidad de escape es 11.2 km/seg");
		} else if (planeta.equals("Marte")) {
			System.out.println("La velocidad de escape es 5.0 km/seg");
		} else if (planeta.equals("Júpiter")) {
			System.out.println("La velocidad de escape es 61.0 km/seg");
		} else if (planeta.equals("Saturno")) {
			System.out.println("La velocidad de escape es 36.0 km/seg");
		} else if (planeta.equals("Urano")) {
			System.out.println("La velocidad de escape es 22.0 km/seg");
		} else if (planeta.equals("Neptuno")) {
			System.out.println("La velocidad de escape es 24.0 km/seg");
		} else if (planeta.equals("Plutón")) {
			System.out.println("La velocidad de escape es 5.3 km/seg");
		} else if (planeta.equals("Luna")) {
			System.out.println("La velocidad de escape es 2.4 km/seg");
		} else {
			System.out.println("No hay velocidad de escape para este astro");
		}
		
		
		

	}

}
