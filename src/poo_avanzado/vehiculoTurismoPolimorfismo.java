package poo_avanzado;

public class vehiculoTurismoPolimorfismo extends vehiculoClase {

	private int npuertas;

	//Constructor
	public vehiculoTurismoPolimorfismo(String matricula, String marca, String modelo, int npuertas) {
		super(matricula, marca, modelo);
		this.npuertas = npuertas;
	}

	public int getNpuertas() {
		return npuertas;
	}

	public void setNpuertas(int npuertas) {
		this.npuertas = npuertas;
	}
	
	
	public String mostrarDatos(){
		return "La matricula es "+matricula+"\n La marca es "+marca+"\n El modelo es "+modelo+"\n El número de puertas es "+npuertas;
	}
	
}
