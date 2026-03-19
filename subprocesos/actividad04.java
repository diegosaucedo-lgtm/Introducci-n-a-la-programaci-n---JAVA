package subprocesos;

import java.util.Scanner;

public class actividad04 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		String categoria;
		double ventas;
		
		System.out.println("Calcular el SUELDO");
		System.out.println("Ingresa la categoría del trabajador: ");
		categoria=leer.nextLine();
		System.out.println("Ingresa el importe de ventas: ");
		ventas=leer.nextDouble();	
		
		importePagar(categoria, ventas);

	}
	
	public static void importePagar(String categoria, double ventas) {
		
		double sBruto, sNeto, sBasico = 0, comision, descuento;
		
		switch (categoria) {
		
		case "E1":
			sBasico=2500;
			break;
			
		case "E2":
			sBasico=2250;
			break;
			
		case "E3":
			sBasico=2000;
			break;
		
		default:
			System.out.println("Error en ingresar la categoría");
			
		}
		
		if (ventas>=9000) {
			comision=ventas*0.11;
		} else if (ventas>=6000) {
			comision=ventas*0.09;
		} else if (ventas>=3000) {
			comision=ventas*0.07;
		} else {
			comision=ventas*0.05;
		}
		
		
		sBruto=sBasico+comision;
		
		descuento=sBruto*0.15;
		
		sNeto=sBruto-descuento;
		
		System.out.println("Sueldo básico: s/."+sBasico);
		System.out.println("Comisión: s/."+comision);
		System.out.println("Sueldo bruto: s/."+sBruto);
		System.out.println("Descuento: s/."+descuento);
		System.out.println("Sueldo neto: s/."+sNeto);
		
		
		
		
	}	
		
	
}
