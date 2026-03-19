package poo;

public class operacionObjeto {
	
	public static void main (String [] args) {
		operacionClase op1 = new operacionClase();
		
		op1.leerNumeros();
		op1.sumar();
		op1.restar();
		op1.multiplicar();
		op1.dividir();
		op1.mostrarResultados();
	//Esto corre desde el clase
	//Puede estar en la mismo modulo de la clase
		
	}

}
