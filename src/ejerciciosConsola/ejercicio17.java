package ejerciciosConsola;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leer2=new Scanner (System.in);
		// TODO Auto-generated method stub
		//Ordenamientos de arreglos
		//Método Burbuja

		int num, aux;
		int arrg[];
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de los elementos"));
		
		arrg = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print((i+1)+"Digite un número: ");
			arrg[i]=leer2.nextInt();
		}

		//Metodo burubuja
		for(int i=0; i<(num-1); i++){
			for (int j=0; j<(num-1); j++) {
				if (arrg[j]>arrg[j+1]) {
					aux=arrg[j];
					arrg[j]=arrg[j+1];
					arrg[j+1]=aux;
				}
			}
		}
			
		System.out.print("\nArreglos ordenados en metodo burbuja: ");	
		for (int k=0; k<num; k++) {
			System.out.print(arrg[k]+" - ");
		}
	}

}
