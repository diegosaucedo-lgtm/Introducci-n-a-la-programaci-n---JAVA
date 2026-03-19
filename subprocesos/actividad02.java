package subprocesos;

import java.util.Scanner;

public class actividad02 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		
		String juego;
		int bol;
		
		System.out.println("Calcular el PAGO");
		System.out.println("Los juegos son el Gusanito, el Trencito y el Pulpo");
		System.out.println("Ingresa el nombre del juego");
		juego = leer.nextLine();
		System.out.println("Ingresa la cantidad de boletos: ");
		bol = leer.nextInt();
		
		importePagar(juego, bol);

	}
	
	public static void importePagar(String juego, int bol) {
		
		double pagar;
		
		if (juego.equals("Gusanito")) {
			pagar=3.5*bol;
			System.out.println("El importe a pagar es "+pagar);
		} else {
			if (juego.equals("Trencito")) {
				pagar=5.0*bol;
				System.out.println("El importe a pagar es "+pagar);
			} else {
				if (juego.equals("Pulpo")) {
					pagar=2.5*bol;
					System.out.println("El importe a pagar es "+pagar);
				} else {
					System.out.println("Error ");
				}
			}
		}
		
	}
	
	

}
