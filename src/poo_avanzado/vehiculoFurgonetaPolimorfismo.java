package poo_avanzado;

public class vehiculoFurgonetaPolimorfismo extends vehiculoClase {

	private int carga;
	
	//Constructor
	public vehiculoFurgonetaPolimorfismo(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	public String mostrarDatos(){
		return "La matricula es "+matricula+"\n La marca es "+marca+"\n El modelo es "+modelo+"\n La carga es "+carga;
	}
	
}
