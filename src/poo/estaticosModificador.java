package poo;

public class estaticosModificador {
		
		//Modificador Static
		//Es una variable que existe cuando se ejecuta el programa, existe por la clase y cuyo valor
		// asignado puede ser accedido sin necesidad de que exista un objeto de clase
		// Se usa para contadores y acumuladores
		private static String frase="Hola amigos";
		private static String cadena="Mulas";
		
		
		
		public static String getFrase() {
			return frase;
		}

		public static void setFrase(String frase) {
			estaticosModificador.frase = frase;
		}


		public static void main (String [] args) {
			
			estaticosModificador objeto1=new estaticosModificador();
			estaticosModificador objeto2=new estaticosModificador();
			
			System.out.println(objeto1.getFrase());
			System.out.println(objeto2.getFrase());
			
			objeto1.cadena="Jota";
			
			System.out.println(objeto1.cadena);
			
		}
		
		
}
