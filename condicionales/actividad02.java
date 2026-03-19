package condicionales;

import java.util.Scanner;

public class actividad02 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double numero;
		
		System.out.println("Evaluar el NUMERO");
		System.out.println("Ingresa un número decimal: ");
		numero = leer.nextDouble();
		
		if (numero>0) {
			System.out.println("Es positivo");
		}

		if (numero<0) {
			System.out.println("Es negativo");
		}
		
		if (numero == 0) {
			System.out.println("Es igual a cero");
		}
		
	}

}
