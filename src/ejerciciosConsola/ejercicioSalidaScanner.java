package ejerciciosConsola;

import java.util.Scanner;

public class ejercicioSalidaScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entr = new Scanner (System.in);

		//Guardar numeros
		int n;
		
		System.out.print("Digita un mumero: ");
		n=entr.nextInt();
		
		System.out.println("El numero es "+n);
		
		float n1;
		
		System.out.print("Digita un decimal: ");
		n1=entr.nextFloat(); //Utiliza la coma en vez del punto
		
		System.out.println("El numero es "+n1);
		
		double n2; 
		
		System.out.print("Digita un decimal: ");
		n2=entr.nextDouble();//Utiliza la coma en vez del punto
		
		System.out.println("El numero es "+n2);
		
		
		//Guardar caracteres
		String cad1,cad2;
		
		System.out.print("Escribe una frase 1 : ");
		cad1=entr.next();//Guarda los caracteres hasta que aparezca un espacio en blanco
		System.out.println("La cadena es: "+cad1);
		
		entr.nextLine();
		//Problema: Cuando lees la segunda cadena con cad2=entr.nextLine();, estás utilizando el 
		//método nextLine(), que captura toda la línea completa, incluyendo el salto de línea (Enter) 
		//que presionas después de ingresar la primera cadena. Esto significa que cad2 también incluirá ese 
		//salto de línea, lo que puede causar resultados inesperados.
		//Solución: Para evitar esto, puedes agregar una línea adicional para consumir el salto de línea 
		//antes de leer la segunda cadena. Puedes hacerlo llamando a entr.nextLine() después de leer la 
		//primera cadena. De esta manera, se descartará el salto de línea y podrás leer la segunda cadena 
		//correctamente.
		
		System.out.print("Escribe una frase 2 : ");
		cad2=entr.nextLine();//Guarda todos los carateres y lo espacios en blanco 
		System.out.println("La cadena es: "+cad2);
		
		char l;
		
		System.out.print("Escribe una letra : ");
		l=entr.next().charAt(0);//Guarda la primera letra 
		
		System.out.println("El caracter es "+l);
	}

}
