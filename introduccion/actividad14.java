package introduccion;

import java.util.Scanner;

public class actividad14 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int horas;
		double precio, sBruto, descuento, sNeto;
		
		System.out.println("CALCULAR EL PAGO");
		System.out.println("Ingresa el precio por hora: ");
		precio = leer.nextDouble();
		System.out.println("Ingresa la cantidad de horas trabajadas: ");
		horas = leer.nextInt();
		
		sBruto=precio*horas;
		descuento=sBruto*0.15;
		sNeto=sBruto-descuento;
		

		System.out.println("El sueldo bruto es "+sBruto);
		System.out.println("El descuento es "+descuento);
		System.out.println("El sueldo neto es es s/."+sNeto);
		

	}

}
