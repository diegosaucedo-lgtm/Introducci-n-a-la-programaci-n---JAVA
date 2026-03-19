package introduccion;

import java.util.Scanner;

public class actividad05 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double area, volumen, lado;
		
		System.out.println("Hallar el área y el volumen de un cubo: ");
		System.out.println("Ingresa el lado: ");
		lado = leer.nextDouble();
		area=6*(Math.pow(lado, 2));
		volumen=Math.pow(lado, 3);
		System.out.println("El área del cubo: "+area);
		System.out.println("El volumen del cubo: "+volumen);

	}

}
