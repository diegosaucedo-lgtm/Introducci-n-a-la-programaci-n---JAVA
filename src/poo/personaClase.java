package poo;

public class personaClase {

	//SOBRECARGA
		//Cuando los metodos y el contructor repiten nombres de variables y tipos de datos 
		//y el nombre del metodo (importante esto)
		//Los diferencia por tipos de datos o cantidad de parametros aunque tenga el mismo nombre
	
		//Atributos
		String  nombre;
		int edad;
		String dni;
		
		//Metodo de constructor 
		public personaClase(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}
		//Metodo de constructor 
		public personaClase(String dni) {
			this.dni = dni;
		}
		
		//Metodo presentacion
		
		public void pres() {
			System.out.println("Soy "+nombre+", tengo "+edad+" años");
			
		}
		
		public void pres(int km) {
			System.out.println("He reccorido "+km+" kilometros en la carrera");
		}
	
}
