package condicionalesAnidados;

import java.util.Scanner;

public class actividad04 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		double peso, estatura, imc;
		
		System.out.println("Calcular el INDICE DE MASA CORPORAL(IMC)");
		System.out.println("Ingresa el peso: ");
		peso = leer.nextDouble();
		System.out.println("Ingresa la estatura: ");
		estatura = leer.nextDouble();
		
		imc=peso/Math.pow(estatura, 2);
		
		if (imc>=27) {
			System.out.println("El índice de masa corporal es "+imc);
			System.out.println("El grado de obesidad: OBESIDAD");
		} else {
			if (imc>=25) {
				System.out.println("El índice de masa corporal es "+imc);
				System.out.println("El grado de obesidad: SOBREPESO");
			} else {
				if (imc>=20) {
					System.out.println("El índice de masa corporal es "+imc);
					System.out.println("El grado de obesidad: NORMAL");
				} else {
					System.out.println("El índice de masa corporal es "+imc);
					System.out.println("El grado de obesidad: DELGADO");
				}
			}
		}

	}

}
