package poo;

public class clase11 {

	//Atributos
	private int codigo;
	private String marca, color;
	private double precioDolares;
	
	//Constructor
	public clase11(int codigo, String marca, String color, double precioDolares) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.precioDolares = precioDolares;
	}

	//Metodos de acceso
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioDolares() {
		return precioDolares;
	}

	public void setPrecioDolares(double precioDolares) {
		this.precioDolares = precioDolares;
	}
	
	//Metodos
	public double precioSoles(){
		return precioDolares*3.25;
	}
	
	public double precioEuro() {
		return precioDolares/1.20;
	}
	
	public void mostrarDatos() {
		
		System.out.println("CLASE COMPUTADORA");
		System.out.println("Codigo: "+codigo);
		System.out.println("Marca: "+marca);
		System.out.println("Color: "+color);
		System.out.println("Precio en dólares: $."+precioDolares);
		System.out.println("Precio en soles: s/."+precioSoles());
		System.out.println("Precio en euros: "+precioEuro());
		
		
		
	}
	
	
}
