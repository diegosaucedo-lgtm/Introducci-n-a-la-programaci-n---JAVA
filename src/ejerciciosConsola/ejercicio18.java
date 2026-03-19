package ejerciciosConsola;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio18 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leer3=new Scanner (System.in);
		// TODO Auto-generated method stub
		//Ordenamiento por inserción
		int num, aux, pos;
		int arrg[];
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de los elementos"));
		
		arrg = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print((i+1)+"Digite un número: ");
			arrg[i]=leer3.nextInt();
		}
		
		//Ordenamiento por inserción
		for (int i=0; i<num; i++){
			pos=i;
			aux=arrg[i];
			
			while (pos>0 && arrg[pos-1]>aux) {
				arrg[pos] = arrg[pos-1];
				pos--;
			}
			
			arrg[pos]=aux;
			
		}
		
		System.out.print("\nArreglos ordenados con método inserción: ");	
		for (int k=0; k<num; k++) {
			System.out.print(arrg[k]+" - ");
		
		
		
	}

	}

}
