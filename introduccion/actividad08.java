package introduccion;

import java.util.Scanner;

public class actividad08 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double area, volumen, radio;
		
		System.out.println("Calcular área y volumen de una ESFERA");
		System.out.println("Ingrese el radio: ");
		radio = leer.nextDouble();
		area=12.57*Math.pow(radio, 2);
		volumen=12.57*Math.pow(radio, 3)/3;
		System.out.println("El área es "+area);
		System.out.println("El volumen es "+volumen);

	}

}
