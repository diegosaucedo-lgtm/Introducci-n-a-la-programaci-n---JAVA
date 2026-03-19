package condicionalesCompuesta;

import java.util.Scanner;

public class actividad06 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int polo;
		double bruto, basico=300.0, ventas, neto, descuento, comision;
		
		System.out.println("Calcular el SUELDO NETO");
		System.out.println("Ingresa el monto total vendido: ");
		ventas = leer.nextDouble();
		
		bruto=basico+(ventas*0.15);
		comision=ventas*0.15;
		
		if (bruto>1800.0) {
			descuento=0.15*bruto;
		} else {
			descuento=0.11*bruto;
		}
		
		if (ventas>1500.0) {
			polo=5;
		} else {
			polo=2;
		}
		
		neto=bruto-descuento;
		
		System.out.println("El sueldo básico es s/."+basico);
		System.out.println("El monto de ventas es s/."+ventas);
		System.out.println("El coimisión en ventas es s/."+comision);
		System.out.println("El sueldo bruto es s/."+bruto);
		System.out.println("El descuento es s/."+descuento);
		System.out.println("El sueldo neto es s/."+neto);
		System.out.println("Te llevas de regalo "+polo+" polos");
		
		
	} 

}
