package poo_avanzado;

//Hereda la clase estudiante los atributos de la clase persona

public class estudianteHereda extends personaClase {

	private int codigoEstudiante;
	private float notaFinal;
	
	public estudianteHereda(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
		super(nombre, apellido, edad);//Son atributos ya inicializados en la otra clase madre
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	
	public void mostrarDatos(){
		System.out.println("Nombre : "+nombre);
		System.out.println("Apellido : "+getApellido());
		System.out.println("Edad : "+getEdad());
		System.out.println("Codigo : "+codigoEstudiante);
		System.out.println("Nota final : "+notaFinal);
		
	}
	
}
