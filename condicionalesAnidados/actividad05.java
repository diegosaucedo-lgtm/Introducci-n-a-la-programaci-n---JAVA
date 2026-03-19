package condicionalesAnidados;

import java.util.Scanner;

public class actividad05 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int temp;
		
		System.out.println("Calcula el CLIMA");
		System.out.println("Ingresa la temperatura climática: ");
		temp=leer.nextInt();
		
		if (temp>30) {
			System.out.println("Clima: Trópico");
		} else {
			if (temp>20) {
				System.out.println("Clima: Caluroso");
			} else {
				if (temp>10) {
					System.out.println("Clima: Nublado");
				} else {
					System.out.println("Clima: Frío");
				}
			}
		}

	}

}
