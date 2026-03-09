package ejerciciosConsola;

//import java.util.Scanner;

public class ejercicio07 {
	//private static Scanner leer=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contadores
				//++ -> a++ -> a=a+1
				//-- -> a-- -> a=a-1
				// y = a++ se asigna a la variable y pero no incrementa
				// y = ++a se incrementa y luego se agina la variable a la variable y
				// a++ = primero evalua el numero y luego incrementa
				//++a = primero incrementa y luego evalua el numero
		//Acumuladores
				//+= -> a+=b -> a=a+b
				//-= -> a-=b -> a=a-b
				//*= -> a*=b -> a=a*b
				///= -> a/=b -> a=a/b
		//Diseñe un programa de 50 terminos y su suma
		//Estrucura de repeticion PARA
		//Declaracion de variables
		int suma, cont, y, w;
		
		suma=3;
		cont=3;
			//(inicialización, condicion, incremento o decremento
		for (int i=1; i<=50; i++) {
			if (i==1) {
				System.out.print(cont);
			}
			else {
				cont += 7;
				System.out.print(" + "+cont);
				suma=suma+cont;
				
			}
			
		}
		System.out.print(" = "+suma);
		
		y=++cont;
		System.out.print("\nY=++cont= "+y);
		w=cont++;
		System.out.print("\nW=cont++= "+w);
		
	}

}
