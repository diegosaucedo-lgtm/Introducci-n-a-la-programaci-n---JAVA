package ejerciciosConsola;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada=new Scanner (System.in);
		int elem;
		
		elem=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de elementos del arreglo: "));
		
		char[] letr = new char[elem];
		
		System.out.println("Digite los elementos del arreglo: ");
		for (int i=0; i<elem; i++){
			System.out.println((i+1)+" Digite un caracter: ");
			letr[i] = entrada.next().charAt(0);
		}
		
		System.out.println("\nLos caracteres del arreglo son: ");
		for(int i=0; i<elem; i++) {
			System.out.println(letr[i]+" ");
		}
	}

}
