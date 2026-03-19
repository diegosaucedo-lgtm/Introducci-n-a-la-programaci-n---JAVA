package claseArreglo;

public class arregloEjemplo {

		//Declaracion e inicializacion
		public static int[] arreglo1={1,2,3,4};
		public static int arreglo2[]={5,6,7,8};
		
		private static int[] arreglo3={10,20,30,40};
		
		//Constuctor desde la clase de un arreglo
		public arregloEjemplo() {}
	
		//Metodos publicos
		
		public static int tamaño() {
			return arreglo3.length;
		}
		
		public static int obtenerValor(int i){
			return arreglo3[i];
		}
		
		public static int sumaNumeros() {
			int suma=0;
			for(int i=0; i<tamaño(); i++){
				suma+=arreglo3[i];
			}
			return suma;
		}
		
		public static int posMenor25(){
			int pos = 0;
			for(int i=0; i<tamaño(); i++){
				if (arreglo3[i]<25){
					pos=i;
					i=tamaño();
				}	
			}
			return pos;
		}
		
		
		
		public static void main (String [] args) {
			
			System.out.println("Los valores del arreglo 1 de izquierda a derecha ");
			for (int i=0; i<arreglo1.length; i++) {
				System.out.println("El valor del arreglo["+i+"] es "+arreglo1[i]);
				
			}
			
			System.out.println("Los valores del arreglo 2 de derecha a izquierda ");
			for (int i=arreglo2.length-1; i>=0; i--) {
				System.out.println("El valor del arreglo["+i+"] es "+arreglo2[i]);
				
			}
			
			
			System.out.println("Los valores del arreglo 3");
			
			for(int i=0; i<tamaño(); i++){
				System.out.println("El valor del arreglo["+i+"] es "+obtenerValor(i));
			}
			
			System.out.println("La suma del arreglo es "+sumaNumeros());
			System.out.println("La posicion con el primer numero menor de 25 es "+posMenor25());
			
			
		}
		
}


	

