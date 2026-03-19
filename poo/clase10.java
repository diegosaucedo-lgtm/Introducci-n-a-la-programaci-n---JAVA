package poo;

public class clase10 {

	//Atributos
	private int num, seg;
	private String usuario;
	private double precio;
	
	//Constructor
	public clase10(int num, int seg, String usuario, double precio) {
		super();
		this.num = num;
		this.seg = seg;
		this.usuario = usuario;
		this.precio = precio;
	}

	//Metodos de acceso
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodos
	
	public double costoConsumo() {
		return precio*seg;
	}
	
	public double impuestoIGV() {
		return 0.18*costoConsumo();
	}
	
	
	public double totalPagar() {
		return costoConsumo()+impuestoIGV();
	}
	
	public void mostrarResultados() {
		
		System.out.println("CLASE CELULAR");
		System.out.println("Usuario: "+usuario);
		System.out.println("Número: "+num);
		System.out.println("Segundos: "+seg);
		System.out.println("Precio: s/."+precio);
		System.out.println("Costo consumo: s/."+costoConsumo());
		System.out.println("Impueso IGV: "+impuestoIGV());
		System.out.println("Importe a pagar: "+totalPagar());
		
	}
	
}
