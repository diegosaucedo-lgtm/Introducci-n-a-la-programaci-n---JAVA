package condicionales;

import java.util.Scanner;

public class actividad06 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int notaQuimica, notaFisica, notaMatematica;
		double propina;
		
		System.out.println("Calcular PROPINA");
		System.out.println("Ingresa la nota del examen de Química: ");
		notaQuimica = leer.nextInt();
		System.out.println("Ingresa la nota del examen de Física: ");
		notaFisica = leer.nextInt();
		System.out.println("Ingresa la nota del examen de Matemática: ");
		notaMatematica = leer.nextInt();
		
		if (notaQuimica>10 && notaFisica>10 && notaMatematica>10) {
			propina=30;
			System.out.println("La propina es s/. "+propina);
		}
		
		if ((notaQuimica>10 && notaFisica>10 && notaMatematica<=10) || (notaQuimica>10 && notaFisica<=10 && notaMatematica>10) || (notaQuimica<=10 && notaFisica>10 && notaMatematica>10)) {
			propina=20;
			System.out.println("La propina es s/. "+propina);
		}
		
		if (notaQuimica>10 || notaFisica>10 || notaMatematica>10) {
			propina=10;
			System.out.println("La propina es s/. "+propina);
		}
		
		
		if (notaQuimica<=10 && notaFisica<=10 && notaMatematica<=10) {
			propina=0;
			System.out.println("La propina es s/. "+propina);
		}
		
		
	}

}
