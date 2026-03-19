package poo;

public class clase03 {

	//Atributos
	public String nombre, apellido;
	public int edad;
	public double estatura, peso;
	
	//Metodo
	public void menorMayor() {
		
		if (edad>=18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
	}
	
	public void indiceMasaCorporal() {
		
		System.out.println("El índice de masa corporal: "+peso/Math.pow(estatura, 2));
	
	}
	
	public void mostrarDato() {
		
		System.out.println("CLASE PERSONA");
		System.out.println("Nombres: "+nombre);
		System.out.println("Apellidos: "+apellido);
		System.out.println("Edad: "+edad);
		System.out.println("Estatura: "+estatura);
		indiceMasaCorporal();
		menorMayor();
		
		
	}
	
	
}
