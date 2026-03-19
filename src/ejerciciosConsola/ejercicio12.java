package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio12 {
	private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodos que retornan un valor con argumentos o parametros (FUNCIONES)
		//Declarar variables
				int prod, cant;
				String regalos;
				double pagos;
		//Ingreso de datos
				System.out.print("Presiona el producto a comprar: "+"\n");
				System.out.print("1. P1 "+"\n");
				System.out.print("2. P2 "+"\n");
				System.out.print("3. P3 "+"\n");
				prod=leer.nextInt();
				System.out.print("Ingresa la cantidad de productos a adquirir: ");
				cant=leer.nextInt();
		//Salida de datos
				pagos=importePag(prod,cant);
				regalos=darRegalos(cant);
				
				System.out.print("El importe a pagar es de "+pagos+"\n");
				System.out.print("Estimado cliente, se lleva como regalos "+regalos);

	}
	private static double importePag(int prod, int cant) {
		// TODO Auto-generated method stub
		switch (prod) {
		case 1:
			return 15.0*cant;
			
			
		case 2: 
			return 17.5*cant;
			
			
		case 3:
			return 20.0*cant;
			
		
			default:
				System.out.print("Error");
				return 0;
			
		}
	}
	private static String darRegalos(int cant) {
		// TODO Auto-generated method stub
		if (cant>50) {
			return "una agenda";
		}
		else {
			if (cant>=26) {
				return "un cuaderno";
			}
			else {
				return "un lapicero";
			}
		}
	}

}
