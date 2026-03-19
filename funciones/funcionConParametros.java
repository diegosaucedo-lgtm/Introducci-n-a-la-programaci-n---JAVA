package funciones;

import java.util.Scanner;

public class funcionConParametros {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double pagar;
		String juego;
		int bol;
		
		System.out.println("Calcular el PAGO");
		System.out.println("Los juegos son el Gusanito, el Trencito y el Pulpo");
		System.out.println("Ingresa el nombre del juego");
		juego = leer.nextLine();
		System.out.println("Ingresa la cantidad de boletos: ");
		bol = leer.nextInt();
		
		pagar=importePagar(juego, bol);
		
		System.out.println("El importe a pagar es "+pagar);
	}
	
	public static double importePagar(String juego, int bol) {
		
		double pagar=0;
		
		if (juego.equals("Gusanito")) {
			pagar=3.5*bol;
		} else {
			if (juego.equals("Trencito")) {
				pagar=5.0*bol;
			} else {
				if (juego.equals("Pulpo")) {
					pagar=2.5*bol;
					
				} else {
					System.out.println("Error ");
				}
				
			}
		}
		
		return pagar;
	}
}

	

