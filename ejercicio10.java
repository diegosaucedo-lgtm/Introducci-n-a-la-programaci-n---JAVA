package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio10 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodo con parametros o argumentos (PROCESOS)
		//Declarar variables
		int prod, cant;
		//Ingreso de datos
		System.out.print("Presiona el producto a comprar: "+"\n");
		System.out.print("1. P1 "+"\n");
		System.out.print("2. P2 "+"\n");
		System.out.print("3. P3 "+"\n");
		prod=leer.nextInt();
		System.out.print("Ingresa la cantidad de productos a adquirir: ");
		cant=leer.nextInt();
		//Salida de datos
		darRegalos(cant);
		importPag(prod, cant);
		
		
	}
	private static void darRegalos(int cant) {
		// TODO Auto-generated method stub
		if (cant>50) {
			System.out.print("Estimado cliente, su regalo es una agenda."+"\n");
		}
		else {
			if (cant>=26) {
				System.out.print("Estimado cliente, su regalo es un cuaderno."+"\n");
			}
			else {
				System.out.print("Estimado cliente, su regalo es un lapicero."+"\n");
			}
		}
		
	}
	private static void importPag(int prod, int cant) {
		// TODO Auto-generated method stub
		double pag;
		switch (prod) {
		case 1:
			pag=15.0*cant;
			System.out.print("El importe a pagar es "+pag);
			break;
			
		case 2: 
			pag=17.5*cant;
			System.out.print("El importe a pagar es "+pag);
			break;
			
		case 3:
			pag=20.0*cant;
			System.out.print("El importe a pagar es "+pag);
			break;
		
			default:
				System.out.print("Error");
			
		}
	}

}
