package introduccion;

import java.util.Scanner;

public class actividad15 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		

		double venta, sBruto, descuento, sNeto;
		
		System.out.println("CALCULAR EL PAGO");
		System.out.println("Ingresa el total vendido: ");
		venta = leer.nextDouble();

		
		sBruto=(venta*0.05)+350.75;
		descuento=sBruto*0.15;
		sNeto=sBruto-descuento;
		
		System.out.println("El sueldo básico es s/.350.75");
		System.out.println("El sueldo bruto es "+sBruto);
		System.out.println("El descuento es "+descuento);
		System.out.println("El sueldo neto es s/."+sNeto);
	}

}
