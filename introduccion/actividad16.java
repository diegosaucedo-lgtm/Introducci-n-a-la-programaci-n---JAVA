package introduccion;

import java.util.Scanner;

public class actividad16 {

	public static void main(String[] args) {

		Scanner leer=new Scanner(System.in);
		
		double angulo, c, r;
		
		System.out.println("Cálculo de ANGULOS");
		System.out.println("Ingresa el ángulo: ");
		angulo = leer.nextDouble();
		
		c=(200*angulo)/180;
		r=(Math.PI*angulo)/180;
		
		System.out.println("Su equivalente en grados centesimales: "+c);
		System.out.println("Su equivalente en radianes: "+r);
		
		
	}

}
