package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio11 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodos que retornan un valor sin argumentos o parametros (FUNCIONES)
		//La FUNCION tambien puede actuar como un metodo vacio
		//Declaraciion de variables
		double pago;
		
		pago=importePago();
		//Salida de datos
		System.out.print("El importe a pagar es "+pago);
		
		
	}
	
	private static double importePago () {
		// TODO Auto-generated method stub
		int juego, bol;
		
		System.out.print("Selecciona el juego que desear jugar: "+"\n");
		System.out.print("1. El gusanito "+"\n");
		System.out.print("2. El trencito "+"\n");
		System.out.print("3. El pulpo "+"\n");
		juego=leer.nextInt();
		System.out.print("Indica la cantidad de boletos que desea adquirir: "+"\n");
		bol=leer.nextInt();
		
		switch (juego) {
		case 1:
			return 3.5*bol;
		
			
		case 2:
			return 5.0*bol;
			
			
		case 3:
			return 2.5*bol;
			
			
		default:
			System.out.print("Error");
			return 0;
		}
		
		
	}

}
