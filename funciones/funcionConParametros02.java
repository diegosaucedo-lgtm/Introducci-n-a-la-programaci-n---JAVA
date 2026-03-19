package funciones;

import java.util.Scanner;

public class funcionConParametros02 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String categoria;
		int gorros, horas;
		double sBruto;
		
		System.out.println("Calcular PAGO Y GORROS");
		System.out.println("Ingresa la categoría del trabajador: ");
		categoria=leer.nextLine();
		System.out.println("Ingresa las horas trabajadas: ");
		horas=leer.nextInt();
		
		sBruto=sueldoBruto(categoria, horas);
		gorros=cantGorros(horas);
		
		System.out.println("El sueldo bruto es s/."+sBruto);
		System.out.println("Se regala "+gorros+" gorros");
		
		
	}

	public static double sueldoBruto(String categoria, int horas) {
		
		double sBruto = 0;
		
		switch (categoria) {
		
		case "A":
			sBruto=horas*21.0;
			break;
		
		case "B":
			sBruto=horas*19.5;
			break;
		
		case "C":
			sBruto=horas*17.0;
			break;
		
		case "D":
			sBruto=horas*15.5;
			break;
			
		
		}
		
		return sBruto;
		
	}
	
	
	public static int cantGorros(int horas) {
		
		int gorros;
		
		if (horas>=160) {
			gorros=11;
		} else if (horas>=140) {
			gorros=7;
		} else if (horas>=120) {
			gorros=4;
		} else {
			gorros=2;
		}
		
		return gorros;
		
		
	}
	
	
	
	
	
}
