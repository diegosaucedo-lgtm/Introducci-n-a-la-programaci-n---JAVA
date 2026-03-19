package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio03 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar si un alumno aprobo o desaprobo
		double p1,p2,p3;
		double promedioFinal;
		//Ingreso de datos
		System.out.print("Ingresa la nota de la primera práctica calificada: ");
		p1=leer.nextDouble();
		System.out.print("Ingresa la nota de la segunda práctica calificada: ");
		p2=leer.nextDouble();
		System.out.print("Ingresa la nota de la tercera práctica calificada: ");
		p3=leer.nextDouble();
		//Proceso de datos
		//1. Obtenermos el promedio 
		promedioFinal=0.20*p1+0.35*p2+0.45*p3;
		//2. Indicamos si aprueba o no 
		if (promedioFinal >= 13) {
			System.out.print("El alumno aprobo el curso con "+promedioFinal+" de nota.");
		}
		else {
			System.out.print("El alumno desaprobo el curso con "+promedioFinal+" de nota.");
		}
			
		
	}

}
