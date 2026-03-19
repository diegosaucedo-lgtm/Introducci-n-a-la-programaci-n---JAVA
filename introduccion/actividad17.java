package introduccion;

import java.util.Scanner;

public class actividad17 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		double c, f, k, r;
		
		System.out.println("Conversor de TEMPERATURA");
		System.out.println("Ingresa la temperatura en grados Centígrados: ");
		c = leer.nextDouble();
		
		f=((9*c)/5)+32;
		r=c+460;
		k=r-187;
		
		System.out.println("Grados Centígrados: "+c);
		System.out.println("A grados Fahrenheit: "+f);
		System.out.println("A grados Kelvin: "+k);
		System.out.println("A grados Rankine: "+r);

	}

}
