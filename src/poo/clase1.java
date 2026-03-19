package poo;

public class clase1 {
	// Clase coche o carro
	//Atributos
	String color;
	String marca;
	int km;
	
	//Metodo para imprimir e ingresar datos
	public static void main (String [] args) {
		
		//Creación de objetos
		clase1 coche1=new clase1();
		
		//Dar valores a los atributos 
		coche1.color="Verde";
		coche1.marca="Audi";
		coche1.km=000;
		
		System.out.println("El color del coche es "+coche1.color);
		System.out.println("La marca del coche es "+coche1.marca);
		System.out.println("Los kilómetros del cohes es "+coche1.km);
		
		
	}

	
	
	

}
