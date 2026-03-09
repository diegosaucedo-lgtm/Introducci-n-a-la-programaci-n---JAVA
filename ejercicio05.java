package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio05 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elige un estado civil 
		//Declaracion de variables
		int opcion;
		String hombre;
		//Ingreso de datos
		System.out.print("Ingresa tu nombre: "+"\n");
		hombre=leer.next();
		System.out.print("Presiona las siguientes opciopnes segón tu estado civil: "+"\n");
		System.out.print("1. Soltero "+"\n");
		System.out.print("2. Casado "+"\n");
		System.out.print("3. Viudo "+"\n");
		System.out.print("4. Divorciado "+"\n");
		opcion=leer.nextInt();
		//Proceso de datos
		//case M:  --indica que se evalua las dos condiciones para la misma acción
		// case m:
		switch (opcion) {
			case 1:
				System.out.print(hombre+" es soltero");
				break;
			case 2:
				System.out.print(hombre+" es casado");
				break;
			case 3: 
				System.out.print(hombre+" es viudo");
				break;
			case 4:
				System.out.print(hombre+" es divorciado ");
				break;
			default:
				System.out.print("Error");
		}
	}

}
