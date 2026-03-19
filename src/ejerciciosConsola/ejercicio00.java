package ejerciciosConsola;

public class ejercicio00 {
	//Los comentarios pueden ser de una línea
	/*
	 * Los comentarios pueden ser de varias líneas
	 * 
	 */
	public static void main(String[] args) {
		//Imprimir datos
				System.out.println("Los tipos de variables en JAVA ");
		//println ---> indica saltos de linea hacia bajo tomando como referencia la primera línea
		//print ----> indica saltos en la misma línea
				
		//Datos primitivos
		System.out.println("Tipos enteros");
		//Datos de tipo entero
		//Nombres: long, int, short y bye
		long a; //Tamaño: 64 bits    Rango: -9223372036854775808 a 9223372854775807
		
		a=1245;
		
		System.out.println("Long: "+a+" ");
		
		int b;	//Tamaño: 32 bits    Rango:  -2147483648 a 2147483647
		
		b=124;
		
		System.out.println("Int: "+b+" ");
		
		short c; //Tamaño: 16 bits   Rango: -32768 a 32767
		
		c=12;
		
		System.out.println("Short: "+c+" ");
				
		byte d;	//Tamaño: 8 bits     Rango: -128 a 127
		
		d=1;
		
		System.out.println("Byte: "+d+" ");
		
		//Datos de tipo decimal 
		System.out.println("Tipos decimales");
		//Nombres: double, float
		double e; //Tamaño: 64 bits   Rango: 4,9e-324 a 1,8e+308
		
		e=14.58;
		
		System.out.println("Double: "+e+" ");
		
		float f; //Tamaño: 32 bits    Rango: 1,4e-045 a 3,4e+038b  -> Ocupa menos espacio en la memoria
		
		f=1.45f;
		
		System.out.println("Float: "+f+" ");
		
		//Datos de tipo letra
		System.out.println("Tipos caracteres");
		//Nombres: char, string
		
		char h; //Un solo caracter 
		
		h='A';
		
		System.out.println("Caracter: "+h);
		
		String palabr;//Una cadena 
		
		palabr = "Hola";
		
		System.out.println("Cadena : "+palabr);
		
		
		//Datos de tipo lógico
		System.out.println("Tipos lógicos");
		//Nombres: boolean
		boolean log1;
		boolean log2;
		
		log1=true;
		log2=false;
		
		System.out.println("Booleanos: "+log1+" y "+log2);
		
		//Datos no primintivos
		System.out.println("Otros");
		//Nombres
		//Integer -> permite almacenar null, enteros y tiene metodos
		//Null -> vacio (no almacena nada)
		
		Integer num;
		 
		num = null;
		
		System.out.println("Dato null: "+num);

		//Constante -> variable que no cambia el valor
		
		final int numero;
		
		numero = 15;
		
		System.out.println("La constante es "+numero);

		
	}

}
