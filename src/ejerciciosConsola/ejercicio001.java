package ejerciciosConsola;

import java.util.Scanner;

public class ejercicio001 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leer = new Scanner (System.in);
		//Metodos de tipo matemático
		double raizc, poten, num1, aleat, raizcu, floor, cecil, round, abs, num, c, b, min, max;
		long redon;
		int az;
		
		System.out.print("Digita un numero decimal: ");
		num1=leer.nextDouble();
		
		raizc=Math.sqrt(num1);//Raiz cuadrada
		raizcu=Math.cbrt(num1);//Raiz cubica
		poten= Math.pow(num1, 2);//Potencia
		floor=Math.floor(num1);//Puedo hallar la parte entera del decimal -> HACIA ABAJO
		cecil=Math.ceil(num1);//Puedo hallar la parte entera del decimal -> HACIA ARRIBA
		round=Math.round(num1);//Redondeo estándar
		// variables de tipo entero = (int) Math.pow(base, exponente) de tipo double -> transforma el resultado en entero
		redon=Math.round(raizc);// Redondea un decimal a entero -> Float/Int y Double/Long
		aleat=Math.random();//Aleatorio de 0 a 1(float)
		az=(int) Math.random()*100;
		
		System.out.println("La raiz cuadrada es "+raizc);
		System.out.println("La raíz cúbica es "+raizcu);
		System.out.println("El floor es "+floor);
		System.out.println("El ceil es "+cecil);
		System.out.println("El round es "+round);
		System.out.println("Al cuadrado es "+poten);
		System.out.println("Redondear la raiz "+redon);
		System.out.println("Un número aleatorio "+aleat);
		System.out.println("El número al azar es "+az);
		
		System.out.println("Ingresa un número: ");
		num=leer.nextInt();
		
		abs=Math.abs(num);
		
		System.out.println("El número absoluto es "+abs);
		
		System.out.println("Ingresa dos números: ");
		c=leer.nextDouble();
		b=leer.nextDouble();
		
		max=Math.max(c, b);
		min=Math.min(c, b);
		
		System.out.println("Mínimo: "+min);
		System.out.println("Máximo: "+max);
		
		//Metodos de tipo char
		char a;
		boolean f;
		
		System.out.println("Digita una letra: ");
		a=leer.next().charAt(0);
		
		f=Character.isUpperCase(a);//comprueba si la letra es mayúscula (verdadero/falso)
		
		System.out.println("¿La letra "+a+" es mayúscula?");
		System.out.println(f);
		System.out.println("           ");
		
		
		//Metodos de tipo String
		String mensaje="Hola mama Dina";
		System.out.println(mensaje);
		//.length -> entero , devuelve la longitud de la cadena
		System.out.println("La longitud de la cadena es "+mensaje.length());
		//charAt -> ubica un caracter mediante el número de su posición
		//indexOf -> ubica al número de posición de un caracter dentro de la cadena
		//Cuenta de izquierda a derecha
		//lastIndeOf -> cuenta de derecha a izquierda
		//Recuerda que los subindices comienzan en cero
		System.out.println("El caracter "+mensaje.charAt(2)+" está en la posición "+mensaje.indexOf('l'));
		//Subcadenas
		//String.SubString(indiceInicial)-> i+1 ..... final
		System.out.println("La subcadena 1: "+mensaje.substring(9));
		//String.SubString(indiceInicial,Indice final)-> i+1.......f
		System.out.println("La subcadena 1: "+mensaje.substring(9,11));
		

	}

}
