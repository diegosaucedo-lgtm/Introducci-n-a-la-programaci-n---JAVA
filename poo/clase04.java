package poo;

public class clase04 {
	
	//Atributos
	public int codigo, categoria, numeroCelular;
	public String nombre;
	public double sueldo;
	
	//Metodo
	public void calcularSueldo() {
		
		switch (categoria) {
			case 0:
				sueldo=8500.0;
			break;
			
			case 1: 
				sueldo=6850.0;
			break;
			
			case 2: 
				sueldo=5500.0;
			break;
		}
		
		
		System.out.println("Sueldo: "+sueldo);
		
		
	}
	
	public void mostrarDatos(){
		
		System.out.println("CLASE COORDINADOR");
		System.out.println("Código: "+codigo);
		System.out.println("Categoría: "+categoria);
		System.out.println("Nombre: "+nombre);
		System.out.println("Número de celular: "+numeroCelular);
		calcularSueldo();
		
	}
	

}
