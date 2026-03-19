package ejerciciosConsola;

//import java.util.Scanner;

public class ejercicio06 {
	//private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contadores
		//INCREMENTO -> a++ -> a=a+1
		//DECREMENTO -> a-- -> a=a-1
		//Acumuladores
		//+= -> a+=b -> a=a+b
		//-= -> a-=b -> a=a-b
		//*= -> a*=b -> a=a*b
		///= -> a/=b -> a=a/b
		//Diseñe un algoritmo que imprima los numeros pares entre 2 y 100 y la suma de estos
		//Estructura de repeticion MIENTRAS
		//Declaracion de variables
		int suma, cont;
		//Proceso de datos
		cont=0;
		suma=0;
		while (cont<=49) {
			cont++;
			suma=suma+cont*2;
			if (cont*2 == 100) {
				System.out.print(cont*2+" = ");
					
				}
			else {
				System.out.print(cont*2+" + ");
			}
			
		}
		System.out.print(suma);
		
	}

}
