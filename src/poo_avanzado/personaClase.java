package poo_avanzado;

//HERENCIA

public class personaClase {

	//De private a protected para que accedan los hijos 
	protected String nombre;
	private String apellido;
	private int edad;
	
	//Constructor
	public personaClase(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//Metodo GET/SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
		
	
	
}
