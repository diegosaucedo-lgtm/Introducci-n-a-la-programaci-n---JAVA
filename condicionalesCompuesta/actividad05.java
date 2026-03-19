package condicionalesCompuesta;

import java.util.Scanner;

public class actividad05 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double ingreso, precio, cuotaInicial, cuotaMensual;
		
		System.out.println("Calcular la CUOTA INICIAL y la CUOTA MENSUAL");
		System.out.println("Ingreso mensual del comprador: ");
		ingreso = leer.nextDouble();
		System.out.println("Ingresa el precio de la casa: ");
		precio = leer.nextDouble();
		
		if (ingreso>=1250.0) {
			cuotaInicial=0.3*precio;
			cuotaMensual=(precio-cuotaInicial)/75;
		} else {
			cuotaInicial=0.15*precio;
			cuotaMensual=(precio-cuotaInicial)/120;
		}
		
		System.out.println("El ingreso mensual del comprador es s/."+ingreso);
		System.out.println("El precio de la casa es s/."+precio);
		System.out.println("La cuota incial es s/."+cuotaInicial);
		System.out.println("La cuota mensual es s/."+cuotaMensual);
		

	}

}
