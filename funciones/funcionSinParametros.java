package funciones;

import java.util.Scanner;

public class funcionSinParametros {

	public static void main(String[] args) {
		
		double pagar; 
		
		pagar=importePagar();
		System.out.println("El total a pagar es s/. "+pagar);

		
	}
	
	public static double importePagar() {
		Scanner leer=new Scanner(System.in);
		
		
		int cant;
		String prod;
		
		System.out.println("Calcular PAGO");
		System.out.println("Los productos son p1, p2 y p3");
		System.out.println("Ingresa el nombre del producto: ");
		prod = leer.nextLine();
		System.out.println("Ingresa la cantidad: ");
		cant = leer.nextInt();
		
		
		double pagar=0;
		
		if (prod.equals("p1")) {
			pagar=15.0*cant;		
		} else if (prod.equals("p2")) {
			pagar=17.5*cant;		
		} else if (prod.equals("p3")) {
			pagar=20.0*cant;		
		}
		return pagar; 		
		
	}
	

}
