package poo;

public class encapsulamientoClase2 {
	
	//Atributos
	private final String nombre1;
	public int edad;
	
	//CONSTRUCTOR
	public encapsulamientoClase2(String nombre1, int edad) {
		this.nombre1 = nombre1;
		this.edad = edad;
	}
	
	//METODO GET/SET
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es "+nombre1);
		System.out.println("Su edad es "+edad);
	}
	

}
