package poo_avanzado;

public class vehiculoClase {
	
	//Atributos
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	//Constructor
	public vehiculoClase(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	
	//Metodo GET/SET
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Metodos
	public String mostrarDatos() {
		return "La matricula es "+matricula+"\n La marca es "+marca+"\n El modelo es "+modelo;
	}

	
	
	
}
