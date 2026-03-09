package ejerciciosConsola;

//import java.util.Scanner;

public class ejercicio08 {
	//private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contadores
			//++ -> a++ -> a=a+1
			//-- -> a-- -> a=a-1
		//Acumuladores
			//+= -> a+=b -> a=a+b
			//-= -> a-=b -> a=a-b
			//*= -> a*=b -> a=a*b
			///= -> a/=b -> a=a/b
		//Generar numeros aleatorios hasta que obtengamos un 6
		//Estructura de repeticion REPETIR, pero es distinta a Pseint -> si la condicion
		//es verdadera las acciones se siguen iterando
		int alea;
		int cont;
		//Proceso de datos
		cont=0;
		alea=0;
		do {
			//Formula para obtener numeros aleatorios entero (int) (Math. floor(Math. random()*(N-M+1)+M))
			 alea=(int) (Math. floor(Math. random()*(6-1+1)+1));
			cont++;
			System.out.print(" "+alea+" ");
		} while (alea != 6);
		
		System.out.print("El número de veces : "+cont);
	}

}

