package claseString;

public class claseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Java es mejor", cad1="Java es la mayor", cad2="Hola", cad3="java es mejor";
		String concatenar;
		int longitud, comparacion, posicion;
		char primerCaracter;
		boolean sino;
		
		//Metodos Básicoa
		//1. Cantidad de la cadena
		System.out.println("METODO LENGETH");
		System.out.println("Cadena=Java es mejor");
		longitud = cadena.length();
		System.out.println("Longitud: "+longitud);
		System.out.println("\n");
		//2.Retorna un caracter si se indica la posicion
		System.out.println("METODO charAT");
		System.out.println("Cadena=Java es mejor");
		primerCaracter = cadena.charAt(0);
		System.out.println("El caracter "+primerCaracter+" se halla en la posición 0 de la cadena");
		System.out.println("\n");
		//3. Retorna f o v si la cadena que invoca el metodo si coincide en caracteres con el parametro enviado
		System.out.println("METODO EQUALS");
		System.out.println("Cadena=Java es mejor");
		System.out.println("Cad1=Java es la mayor");
		sino = cadena.equals(cad1);
		if (sino) {
			System.out.println("Las dos cadenas son iguales");
		} else {
			System.out.println("Las dos cadenas no son iguales");
		}
		sino = cadena.equals(cadena);
		if (sino) {
			System.out.println("Las dos cadenas son iguales");
		} else {
			System.out.println("Las dos cadenas no son iguales");
		}
		System.out.println("\n");
		//4. Retorna un entero al comparar alfabeticamento dos cadenas en longitud 
		// 0-> las letras y la longitud iguales
		// 1 -> mayor o igual longitud o diferentes letras 
		// -1 -> menor
		System.out.println("METODO comparateTO");
		System.out.println("Cadena=Java es mejor");
		System.out.println("Cad1=Java es la mayor");
		System.out.println("Cad2=Hola");
		System.out.println("Cad3=java es mejor");
		comparacion = cadena.compareTo(cad1);
		System.out.println(comparacion+": La cad1 es mayor que la cadena");
		comparacion = cadena.compareTo(cadena);
		System.out.println(comparacion+": La cadena es igual que la cadena");
		comparacion = cadena.compareTo(cad2);
		System.out.println(comparacion+": La cadena es mayor que la cad2");
		comparacion=cadena.compareTo(cad3);
		System.out.println(comparacion+": La cadena es igual en longitud pero no letras a la cad3");
		System.out.println("\n");
		//5. Concatenacion 
		System.out.println("METODO CONCATENACION");
		concatenar = cadena+"-"+cad1+"-"+cad2;
		System.out.println(concatenar);
		System.out.println("\n");
		//6. Recorrer 
		System.out.println("METODO RECORRRER");
		// De izquierda derecha
		System.out.println("De izquierda a derecha");
		for (int i=0; i<cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
		}
		System.out.print("\n");
		System.out.println("De derecha a izquierda");
		// De derecha a izquierda
		for (int i=cadena.length()-1; i>=0; i--) {
			System.out.print(cadena.charAt(i));
		}
		System.out.print("\n");
		//7. Retorna v o f sin tener en cuenta las mayusculas y minusculas - compara caracteres
		System.out.println("METODO equalsIgnoreCase");
		System.out.println("Cadena=Java es mejor");
		System.out.println("Cad2=Hola");
		System.out.println("Cad3=java es mejor");
		sino = cadena.equalsIgnoreCase(cad3+": Cadena es igual a cad3");
		System.out.println(sino);
		sino = cadena.equalsIgnoreCase(cad2+": Cadena no es igual a cad2");
		System.out.println(sino);
		System.out.println("\n");
		//8. Retorna v o f si el comienzo(hasta el ESPACIO BLANCO) de la cadena coincide con el parametro
		System.out.println("METODO startsWith");
		System.out.println("Cadena=Java es mejor");
		System.out.println("Cad1=Java es la mayor");
		System.out.println("Cad2=Hola");
		sino = cadena.startsWith(cad1);
		System.out.println(sino);
		sino = cadena.startsWith(cad2);
		System.out.println(sino);
		sino = cadena.startsWith("Java");
		System.out.println(sino);
		System.out.println("\n");
		//9. Es el otro pero con el final
		System.out.println("METODO endsWith");
		System.out.println("Cadena=Java es mejor");
		System.out.println("Cad1=Java es la mayor");
		System.out.println("Cad2=Hola");
		sino = cadena.endsWith(cad1);
		System.out.println(sino);
		sino = cadena.endsWith(cad2);
		System.out.println(sino);
		sino = cadena.endsWith("mejor");
		System.out.println(sino);
		System.out.println("\n");
		//10. Devuelve la posicion que por primera vez aparece el caraceter
		//-1 -> no hay
		System.out.println("METODO indexOf");
		System.out.println("Cadena=Java es mejor");
		posicion = cadena.indexOf('J');
		System.out.println(posicion);
		System.out.println("\n");
		//11. Devuelve la posicion, pero indicando desde donde comienza a buscar
		System.out.println("METODO indexOf");
		System.out.println("Cadena=Java es mejor");
		posicion = cadena.indexOf('a',1);
		System.out.println(posicion);
		posicion = cadena.indexOf('a',2);
		System.out.println(posicion);
		System.out.println("\n");
		//12. Devuelve la posicion desde donde empieza la cadena
		System.out.println("METODO indexOf");
		System.out.println("Cadena=Java es mejor");
		posicion = cadena.indexOf("va");
		System.out.println(posicion);
		System.out.println("\n");
		//13. Lo mismo pero indicando desde que lugar de la cadena comienza a buscar
		System.out.println("METODO indexOf");
		System.out.println("Cadena=Java es mejor");
		posicion = cadena.indexOf("va",3);
		System.out.println(posicion);
		System.out.println("\n");
		//14. Devuelve la ultima posicion en que aparece un caracter -> tiene todas la propiedades
		// de indexOf();
		System.out.println("METODO lastIndexOf");
		System.out.println("Cadena=Java es mejor");
		posicion = cadena.lastIndexOf('a');
		System.out.println(posicion);
		System.out.println("\n");
		//15. Convierte a minuscula
		System.out.println("METODO toLowerCase");
		System.out.println("Cadena=Java es mejor");
		System.out.println(cadena.toLowerCase());
		System.out.println("\n");
		//16. Convierte a mayúscula
		System.out.println("METODO toUpperrCase");
		System.out.println("Cadena=Java es mejor");
		System.out.println(cadena.toUpperCase());
		System.out.println("\n");
		//17. Subcadenas
		System.out.println("METODO SUBSTRING");
		System.out.println("Cadena=Java es mejor");
		System.out.println(cadena.substring(1));
		System.out.println(cadena.substring(2, 12));
		System.out.println("\n");
		//18. Reemplazar caracter
		System.out.println("METODO REPLACE");
		System.out.println("Cadena=Java es mejor");
		System.out.println(cadena.replace('a', 'e'));
		System.out.println("\n");
		//19. Emplea un separador para trocear la cadena en subcadena y distribuirlos en un arreglo
		System.out.println("METODO ARREGLO STRING");
		String[] s;
		s=cadena.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println("\n");
		//20. Convierte una cadena en un arreglo de caracteres
		System.out.println("METODO CONVERTIR UNA CADENA EN UN ARREGLO DE CARACTERES");
		char[] arregloCaracteres=cadena.toCharArray();
		for(int j=0; j<cadena.length(); j++){
			System.out.print(arregloCaracteres[j]);
		}
		System.out.println("\n");
		//21. METODOS DE CONVERSION
		System.out.println("METODO valueOf");
		double numero=14.487;
		String numeroAcadena;
		
		numeroAcadena=String.valueOf(numero);
		
		System.out.println(numeroAcadena);
		
		
	}

	
}
