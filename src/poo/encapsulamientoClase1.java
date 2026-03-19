package poo;

public class encapsulamientoClase1 {

	//Atributos de tipo privado
	//Este atributo se encuentra encapsulado y para acceder a él para formar objetos debemos
	//usa el metodo set/get
	private int atributo1, atributo3;
	public int atributo2;

	//METODO SET/GET -> es una especie de constructor para las variables privadas
	//Retornar
	public int getAtributo1() {
		return atributo1;
	}

	//Estabelcer
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	//Retornar
	public int getEdad() {
		return atributo3;
	}
	//Establecer
	public void setEdad(int edad) {
		this.atributo3 = edad;
	}
	
	
	
	
	
	
}
