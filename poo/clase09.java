package poo;

public class clase09 {
	
	//Atributos
	public int codigo;
	public String marca, color;
	public double precio;
	
	//Cosntructor
	public clase09(int codigo, String marca, String color, double precio) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	//Metodos
	public double precioSoles() {
		
		return precio*3.38;
	}

	public double precioEuros() {
		
		return precio/1.20;
	}
	
	public void mostrarResultados() {
		
		System.out.println("CLASE EQUIPO");
		System.out.println("Código: "+codigo);
		System.out.println("Marca: "+marca);
		System.out.println("Color: "+color);
		System.out.println("Precio en dólares: s/."+precio);
		System.out.println("Precio en soles: s/."+precioSoles());
		System.out.println("Precio en euros: s/."+precioEuros());
		
	}
	
}
