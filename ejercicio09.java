package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio09 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodos vacios sin parametros o argumentos (PROCEDIMIENTOS)
		
		importePagar();
		
	}
	private static void importePagar() {
		// TODO Auto-generated method stub
		int juego, bol;
		double p;
		
		//Entrada de datos
		System.out.print("Selecciona el juego que desear jugar: "+"\n");
		System.out.print("1. El gusanito "+"\n");
		System.out.print("2. El trencito "+"\n");
		System.out.print("3. El pulpo "+"\n");
		juego=leer.nextInt();
		System.out.print("Indica la cantidad de boletos que desea adquirir: "+"\n");
		bol=leer.nextInt();
		
		//Proceso de datos
		switch (juego) {
		case 1:
			p=3.5*bol;
			System.out.print("El importe a pagar es "+p);
			break;
			
		case 2:
			p=5.0*bol;
			System.out.print("El importe a pagar es "+p);
			break;
			
		case 3:
			p=2.5*bol;
			System.out.print("El importe a pagar es "+p);
			break;
			
		default:
			System.out.print("Error");
		}
		
		
	}
	

}
