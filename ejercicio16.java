package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ingresar un numero en el arreglo de forma que no rompa el orden de los 
		 * elementos del mismo arreglo.
		 */
		@SuppressWarnings("resource")
		Scanner leer=new Scanner (System.in);
		
		int arreglo1[] = new int[10];
		boolean creciente=true;
		int or, sit=0, j=0;
		
		System.out.println("Llenar el arreglo ");
		do{
			//lenando el arreglo
			for(int i=0; i<5; i++){
				System.out.print((i+1)+". Digite el número: ");
				arreglo1[i] = leer.nextInt();
			}
			
			//Comprobar que el arreglo está ordenado de forma creciente
			
			for(int i=0; i<4; i++) {
				if (arreglo1[i]<arreglo1[i+1]) { //Creciente
					creciente=true;
				}
				
				if (arreglo1[i]>arreglo1[i+1]) { //Decreciente
					creciente=false;
					break; //Señala la salida del bucle
				}
				
				
			}
			
			if (creciente == false ) {
				System.out.println("\nElarreglo no está ordenada de forma creciente, vuelve a digitar.");
			}
			
			
		} while (creciente == false);
		
	
		System.out.print("\nDigite un número: ");
		or = leer.nextInt();
		
		//Estos es para buscar la posición en la que va el número
		while (arreglo1[j]<or && j<5) {
			sit++;
			j++;
		}
		
		//Cambiar a un nuevo orden 
		for (int i=4; i>=sit; i--){
			arreglo1[i+1] = arreglo1[i];
		}
		
		//Insertamos el numero que el usuaro puso
		arreglo1[sit] = or;
		
		System.out.println("El arreglo: ");
		for (int i=0; i<6; i++) {
			System.out.print(arreglo1[i]+" - ");
		}
		
		System.out.println();
	}

}
