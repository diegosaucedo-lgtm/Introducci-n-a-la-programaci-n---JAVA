package string;

import java.util.Scanner;

public class ejercicio00 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String cadena, comparacion, inversion="";
		char caracter;
		int longitud, comp;
		
		System.out.println("CLASE STRING");
		System.out.println("Ingresa una frase o una palabra: ");
		cadena = leer.nextLine();
		System.out.println("Ingresa una frase para comparar con la anterior: ");
		comparacion = leer.nextLine();
		
		longitud=cadena.length();
		
		System.out.println("Descomponer en caracteres: ");
		
		for (int i=0; i<longitud; i++) {
			caracter=cadena.charAt(i);
			System.out.print(caracter+"  ");
		}
		
		System.out.println("\nLa longitud de la cadena es "+longitud);
		
		if (cadena.equals(comparacion)) {
			System.out.println("Las palabras "+cadena+" y "+comparacion+" son iguales");
		} else {
			System.out.println("Las palabras "+cadena+" y "+comparacion+" no son iguales");
		}
		
		comp=cadena.compareTo(comparacion);
		
		if (comp>0) {
			System.out.println("La primera cadena tiene "+comp+" caracteres más que la segunda");
		} else if (comp<0) {
			System.out.println("La primera cadena tiene "+comp+" caracteres menos que la segunda");
		} else {
			System.out.println("La primera primera y segunda cadena tiene la misma longitud");
		}
		
		for (int i=longitud-1; i>=0; i--) {
			inversion+=cadena.charAt(i);
		}
		
		System.out.println("El inverso de la primera cadena es "+inversion);
		
		
		
		
		
		
		
	}

}
