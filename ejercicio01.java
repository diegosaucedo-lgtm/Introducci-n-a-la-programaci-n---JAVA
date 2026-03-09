package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio01 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Area y perímetro de un rectángulo
		//Declaracion de variables
		double base, altura;
		double p;
		//Entrada de datos
		System.out.print("Ingresa la altura del rectángulo: ");
		altura=leer.nextDouble();
		System.out.print("Ingresar la base del rectángulo: ");
		base=leer.nextDouble();
		//Proceso de datos
		p=2*(base+altura);
		//Salida de datos
		System.out.print("El perímetro del rectángulo es "+p);
		
	}

}
