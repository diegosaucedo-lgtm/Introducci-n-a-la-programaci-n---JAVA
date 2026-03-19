package introduccion;

import java.util.Scanner;

public class actividad06 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double areaLateral, areaTotal, areaBase, radio, altura;
		
		System.out.println("Calcular áreas de un CILINDRO");
		System.out.println("Ingresa el radio: ");
		radio = leer.nextDouble();
		System.out.println("Ingresa la altura: ");
		altura = leer.nextDouble();
		areaLateral=2*Math.PI*radio*altura;
		areaBase=Math.PI*Math.pow(radio, 2);
		areaTotal=2*areaBase+areaLateral;
		System.out.println("El área lateral es "+areaLateral);
		System.out.println("El área base es "+areaBase);
		System.out.println("El área total es "+areaTotal);
	}

}
