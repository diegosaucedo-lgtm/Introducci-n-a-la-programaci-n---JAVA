package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio04 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Señalar a categoria de un alumno
		//Declaracion de variables
		double promed;
		//Ingreso de datos
		System.out.print("Ingresa el promedio ponderado del alumno: ");
		promed=leer.nextDouble();
		//Proceso de datos
		// == igualdad
		//!= diferencia
		//<= menor igual
		//>= mayor igual
		//&& --> y
		//|| --> o
		//
		if (promed >= 17) {
			System.out.print("El alumno pertenece a la categoría A");
		} 
		else {
			if (promed >= 14) {
				System.out.print("El alumno pertenece a la categoría B");
			}
			else {
				if (promed >= 12) {
					System.out.print("El alumno pertenece a la categoría C");
				}
				else {
					System.out.print("El alumno pertenece a la categoría D");
				}
			}
		}

	}

}
