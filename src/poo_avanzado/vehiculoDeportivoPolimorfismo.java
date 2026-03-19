package poo_avanzado;

public class vehiculoDeportivoPolimorfismo extends vehiculoClase {

	private int cilindrada;
	
	//Constructor
	public vehiculoDeportivoPolimorfismo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	public String mostrarDatos() {
		return "La matricula es "+matricula+"\n La marca es "+marca+"\n El modelo es "+modelo+"\n El número de la cilindrada es "+cilindrada;
	}
	
	
}
