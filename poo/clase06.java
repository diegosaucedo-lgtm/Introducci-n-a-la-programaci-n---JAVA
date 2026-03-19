package poo;

public class clase06 {
	
	//Atributos
	int codigo, horas;
	String nombre;
	double tarifa;
	
	//Metodos
	double sueldo() {
		return horas*tarifa;
	}
	
	void mostrarDatos() {
		System.out.println("CLASE PROFESOR");
		System.out.println("Código: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Horas trabajadas: "+horas);
		System.out.println("Tarifa x hora: "+tarifa);
		System.out.println("Sueldo: "+sueldo());
	}
	
	
}
