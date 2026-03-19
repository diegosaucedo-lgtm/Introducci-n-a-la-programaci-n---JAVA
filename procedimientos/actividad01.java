package procedimientos;

import java.util.Scanner;

public class actividad01 {
	
	public static void main(String[] args) {
		
		
		importePagar();

	}
	
	public static void importePagar(){
		Scanner leer=new Scanner(System.in);
		
		double pagar=0;
		int cant;
		String prod;
		
		System.out.println("Calcular PAGO");
		System.out.println("Los productos son p1, p2 y p3");
		System.out.println("Ingresa el nombre del producto: ");
		prod = leer.nextLine();
		System.out.println("Ingresa la cantidad: ");
		cant = leer.nextInt();
		
		if (prod.equals("p1")) {
			pagar=15.0*cant;
		} else if (prod.equals("p2")) {
			pagar=17.5*cant;
		} else if (prod.equals("p3")) {
			pagar=20.0*cant;
		} else {
			System.out.println("Error");
		}
		
		if (cant>50) {
			System.out.println("El total a pagar es s/. "+pagar);
			System.out.println("Se regala por la compra una agenda");
		} else if (cant>=26){
			System.out.println("El total a pagar es s/. "+pagar);
			System.out.println("Se regala por la compra un cuaderno");
		} else if (cant>0) {
			System.out.println("El total a pagar es s/. "+pagar);
			System.out.println("Se regala por la compra un lapicero");
		} else {
			System.out.println("Error");
		}
		
		
	}

}
