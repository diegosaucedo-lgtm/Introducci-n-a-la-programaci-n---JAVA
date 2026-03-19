package ciclos;

import java.util.Scanner;

public class while05 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int n, cont=1;
		double sum = 0, fraccion = 0, num1=2, num2=3;
		
		System.out.println("Calcular TERMINOS y SUMA de una SERIE");
		System.out.println("Ingrese el número de términos: ");
		n = leer.nextInt();
		
		while (cont<=n) {
			

			System.out.print(Math.round(num1)+"/"+Math.round(num2)+" ");
			fraccion=num1/num2;
			sum+=fraccion;
			num1+=3;
			num2+=2;
			
			cont+=1;
			
		}
		
		System.out.print("\nLa suma es "+sum);

	}

}
