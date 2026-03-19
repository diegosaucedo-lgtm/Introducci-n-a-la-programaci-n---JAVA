package poo;

public class constructorClase {
	//Clase PERSONA
	//Atributos
	String nombre;
	int edad;
	
	//Metodo constructor (aqui viene los datos del objeto para emplearlo en los metodos)
	public constructorClase (String nombre1, int edad1) {
		nombre = nombre1;
		edad = edad1;
		
		//Otra forma cuando las variables tiene el mismo nombre
				/*
				 * Public constructor01 (String nombre, int edad) {
				 * this.nombre=nombre;
				 * this.edad=edad;
				 * }
				 */	
	}
	
	//Metodo vacio para salida de datos
	public void mostrarDatos() {
		System.out.println("El nombres es "+nombre);
		System.out.println("La edad es "+edad);
	}
		

}
