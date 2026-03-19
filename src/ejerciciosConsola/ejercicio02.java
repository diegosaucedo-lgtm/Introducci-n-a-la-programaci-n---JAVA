package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio02 {
	private static Scanner leer= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Determinador el ganador de un partido de futbol
		//Declaracion de variables
		int golesA, golesB;
		//Ingreso de datos
		System.out.print("Ingresa los goles anotados del equipo A: ");
		golesA=leer.nextInt();
		System.out.print("Ingresa los goles anotados del equipo B: ");
		golesB=leer.nextInt();
		//Proceso de datos
		if (golesA>golesB) {
			System.out.print("Gano el equipo A");
		}
		//El signo igual para los numeros es ==
		if (golesA == golesB) {
			System.out.print("Empate");
		}
		
		if (golesA<golesB) {
			System.out.print("Gano el equipo B");
		}

	}

}
