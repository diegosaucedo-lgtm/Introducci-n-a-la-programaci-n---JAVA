package introduccion;

import java.util.Scanner;

public class actividad09 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double salud, comedor, biblioteca1, escuela, biblioteca2, asilo, donacion;
		
		System.out.println("Calcular donaciones");
		System.out.println("Ingresa el monto de la donación: ");
		donacion = leer.nextDouble();
		salud=0.25*donacion;
		escuela=0.35*donacion;
		comedor=0.45*escuela;
		biblioteca1=0.17*(comedor+escuela);
		biblioteca2=0.40*salud;
		asilo=donacion-(salud+escuela+biblioteca1+comedor+biblioteca2);
		System.out.println("Centro de salud: "+salud);
		System.out.println("Escuela: "+escuela);
		System.out.println("Comedor: "+comedor);
		System.out.println("Biblioteca 1: "+biblioteca1);
		System.out.println("Biblioteca 2: "+biblioteca2);
		System.out.println("Asilo: "+asilo);
	}

}
