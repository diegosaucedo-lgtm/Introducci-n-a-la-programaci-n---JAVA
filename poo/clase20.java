package poo;

public class clase20 {
	
	//Atributos
	private int codigo, categoria, numCelular;
	private String nombre;
	private static int contador;
	private static double sumaSueldosNetos;
	public static final double descuento;
	
	//Bloque de inicializacion
	static {
		
		contador=0;
		sumaSueldosNetos=0.0;
		descuento=0.15;
		
		
	}
	//Constructor
	public clase20(int codigo, int categoria, int numCelular, String nombre) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.numCelular = numCelular;
		this.nombre = nombre;
		contador++;
		
	}
	
	//Constructor
	public clase20(int codigo, String nombre) {

		this(codigo, 2, 999999, nombre);
	}

	//Constructor
	public clase20() {
		
		this(44444,0,0,"Ninguno");
	}

	//Metodo de acceso 
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(int numCelular) {
		this.numCelular = numCelular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		clase20.contador = contador;
	}

	public static double getSumaSueldosNetos() {
		return sumaSueldosNetos;
	}

	public static void setSumaSueldosNetos(double sumaSueldosNetos) {
		clase20.sumaSueldosNetos = sumaSueldosNetos;
	}

	public static double getDescuento() {
		return descuento;
	}
	
	
	//Metodo
	
	public double sueldoBruto() {
		switch (categoria) {
		case 0:
			return 7200;
			
		case 1:
			return 6300;
			
		case 2:
			return 5100;
			
		default:
			return 0.0;
		}
	}
	
	public double descuento() {
		return descuento;
	}

	public double sueldoNeto() {
		return sueldoBruto()-descuento();
	}
	
	public double sumaSueldosNetos(){
		sumaSueldosNetos+=sueldoNeto();
		return sumaSueldosNetos;
	}
	
	public void mostrarResultados() {
		
		System.out.println("CLASE TRABAJADOR "+contador+"°");
		System.out.println("Codigo: "+codigo);
		System.out.println("Categoría: "+categoria);
		System.out.println("Número celular: "+numCelular);
		System.out.println("Nombre: "+nombre);
		System.out.println("Codigo: "+codigo);
		System.out.println("Sueldo bruto: s/."+sueldoBruto());
		System.out.println("Descuento: "+descuento());
		System.out.println("Sueldo neto: s/."+sueldoNeto());
		System.out.println("Acumulado de los sueldos netos: s/."+sumaSueldosNetos());
		
	}
	
	
	
	
	
}
