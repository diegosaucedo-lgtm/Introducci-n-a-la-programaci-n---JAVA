package poo;

public class clase19 {
	
	//Atributos
	private String ruc, empresa;
	private int unidades;
	private double precioUnitario;
	private static int contador;
	private static double sumaImportes;
	public static final String kj;
	
	//Bloque de inicializacion 
	static {
		kj="Sunat";
		contador=0;
		sumaImportes=0.0;
	}
	
	//Constructor
	public clase19(String ruc, String empresa, int unidades, double precioUnitario) {
		super();
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
		contador++;
		sumaImportes+=(precioUnitario*unidades);
		
	}

	//Constructor
	public clase19(String ruc, String empresa) {
		
		this(ruc, empresa, 10, 50.0);
	}


	//Constructor
	public clase19() {
	
		this("1111111111","MN-Global SRL");
	}

	//Metodos de acceso para los atributos
	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	
	//Metodo de acceso para los atributos de clase
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		clase19.contador = contador;
	}

	public static double getSumaImportes() {
		return sumaImportes;
	}

	public static void setSumaImportes(double sumaImportes) {
		clase19.sumaImportes = sumaImportes;
	}

	public static String getKj() {
		return kj;
	}
	
	//Metodos
	
	public double importeFacturar() {
		
		return unidades*precioUnitario;
	}
	
	
	public void mostrarResultado() {
		
		System.out.println("CLASE FACTURA "+contador+"° ");
		System.out.println("RUC: "+ruc);
		System.out.println("Empresa: "+empresa);
		System.out.println("Unidades: "+unidades);
		System.out.println("Precio unitario: "+precioUnitario);
		System.out.println("Importe a pagar: "+importeFacturar());
		System.out.println("Importe acumulado: "+sumaImportes);

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
