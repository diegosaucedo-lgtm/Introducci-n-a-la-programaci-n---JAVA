package introduccion;

import java.util.Scanner;

public class actividad07 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double areaBase, perimetro, areaLateral, radio, generatriz;
		
		System.out.println("Calcular áreas de un CONO");
		System.out.println("Ingrese el radio de su base: ");
		radio = leer.nextDouble();
		System.out.println("Ingrese la generatriz: ");
		generatriz = leer.nextDouble();
		areaBase=Math.PI*Math.pow(radio, 2);
		perimetro=6.28*radio;
		areaLateral=perimetro*generatriz/2;
		System.out.println("El perímetro es "+perimetro);
		System.out.println("El área base es "+areaBase);
		System.out.println("El área lateral es "+areaLateral);

	}

}
