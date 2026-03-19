package condicionalesCompuesta;

import java.util.Scanner;

public class actividad02 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double  tarifa, descuento, bruto, neto;
		int horas;

		System.out.println("Calcular el PAGO A LOS EMPLEADOS");
		System.out.println("Ingresa la tarifa por horas: ");
		tarifa = leer.nextDouble();
		System.out.println("Ingresa las horas trabajadas: ");
		horas = leer.nextInt();
		
		bruto=tarifa*horas;
		
		if (bruto>3500) {
			descuento=bruto*0.15;
			neto=bruto-descuento;
			System.out.println("El sueldo bruto es s/."+bruto);
			System.out.println("El descuento es s/."+descuento);
			System.out.println("El sueldo neto es s/."+neto);
		}
		else {
			descuento=bruto*0.11;
			neto=bruto-descuento;
			System.out.println("El sueldo bruto es s/."+bruto);
			System.out.println("El descuento es s/."+descuento);
			System.out.println("El sueldo a pagar es "+neto);
		}
	}

}
