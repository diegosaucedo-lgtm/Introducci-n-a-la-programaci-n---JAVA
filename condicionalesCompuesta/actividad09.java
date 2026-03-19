package condicionalesCompuesta;

import java.util.Scanner;

public class actividad09 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int nota1, nota2, nota3;
		double p1, p2, p3, total;
		
		System.out.println("Calcular PROPINA");
		System.out.println("Ingresa la nota del curso de Matemáticas: ");
		nota1=leer.nextInt();
		System.out.println("Ingresa la nota del curso de Física: ");
		nota2=leer.nextInt();
		System.out.println("Ingresa la nota del curso de Historia del Perú: ");
		nota3=leer.nextInt();
		
		if (nota1>=17) {
			p1=3*nota1;
		} else {
			p1=1*nota1;
		}
		
		if(nota2>=15) {
			p2=2*nota2;
		} else {
			p2=0.5*nota2;
		}
		
		if (nota3>=15) {
			p3=1.5*nota3;
		} else {
			p3=0.3*nota3;
		}
		
		total=p1+p2+p3;
		
		System.out.println("Propina: s/."+total);

	}

}
