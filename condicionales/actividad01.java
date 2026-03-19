package condicionales;

import java.util.Scanner;

public class actividad01 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int golesA, golesB;
		
		System.out.println("Resultado de un PARTIDO");
		System.out.println("Ingresa los goles del equipo A: ");
		golesA = leer.nextInt();
		System.out.println("Ingresa los goles del equipo B: ");
		golesB = leer.nextInt();
		
		if (golesA>golesB) {
			System.out.println("Gana el equipo A");
		}
		
		if (golesB>golesA) {
			System.out.println("Gana el equipo B");
		}

		if (golesA == golesB){
			System.out.println("Empate");
		}
	}

}
