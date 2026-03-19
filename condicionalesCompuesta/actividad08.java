package condicionalesCompuesta;

import java.util.Scanner;

public class actividad08 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int hijos;
		double sBruto, bonificacion;
		
		System.out.println("Calcular BONIFICACION");
		System.out.println("Ingresa el número de hijos: ");
		hijos=leer.nextInt();
		System.out.println("Ingresa el sueldo bruto: ");
		sBruto=leer.nextDouble();
		
		if (hijos>2) {
			bonificacion=(sBruto*0.125)+(30*hijos);
		} else {
			bonificacion=(sBruto*0.125)+(40*hijos);
		}

		System.out.print("La bonificación es s/."+bonificacion);
		
	}

}
