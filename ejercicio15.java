package ejerciciosConsola;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bucle FOR EACH
		String nom12[]= {"Alejandro","Luis","Diego","Abraham"};
		
		//El .length cuenta la cantidad de elementos del arreglo cuando no sabemos dicha información
		for (int i=0; i<nom12.length; i++){
			System.out.println(nom12[i]);
		}
		
		//FOR EACH
		for (String i: nom12){
			System.out.println("Nombres "+i);
		}
		
		
	}

}
