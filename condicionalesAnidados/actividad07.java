package condicionalesAnidados;

import java.util.Scanner;

public class actividad07 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		double juan, pedro, miguel, promedio;
		
		System.out.println("Calcular la ESTATURA");
		System.out.println("Ingresa la estatura Juan: ");
		juan=leer.nextDouble();
		System.out.println("Ingresa la estatura Pedro: ");
		pedro=leer.nextDouble();
		System.out.println("Ingresa la estatura Miguel: ");
		miguel=leer.nextDouble();
		
		promedio=(juan+miguel+pedro)/3;
		
		if (juan<promedio) {
			System.out.println("Juan tiene la estatura menor al promedio");
		}
		
		if (pedro<promedio) {
			System.out.println("Pedro tiene la estatura menor al promedio");
		}
		
		if (miguel<promedio) {
			System.out.println("Miguel tiene la estatura menor al promedio");
		}
		
		
		
		
		
	}

}
