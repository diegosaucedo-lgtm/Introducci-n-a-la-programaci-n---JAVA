package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio20 {
	private static Scanner uj=new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int matriz02[][]=new int[3][3];
		
		for(int k=0; k<3; k++) {
			for(int l=0; l<3; l++){
				System.out.println("Ingresa el valor de la matriz["+k+","+l+"] : ");
				matriz02[k][l]=uj.nextInt();
			}
			System.out.println("");
		}
		
		int matriz01[] []={{1,2,3},{4,5,6},{7,8,9}}; 
		
		for (int i=0; i<3; i++){//número de fila
			for (int j=0; j<3; j++){//número de columna
				System.out.print(matriz01[i] [j]);
			}
			System.out.println("");
		}
	}

}
