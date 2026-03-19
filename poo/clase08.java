package poo;

public class clase08 {
	
	//Atributos
	public double largo,  ancho, alto, peso;
	
	//Metodos
	
	public double volumenCaja() {
		
		return largo*ancho*alto;
		
	}
	
	 public double pesoVolumetrico() {
		
		return volumenCaja()/5000;
		
	}
	
	 public double pesoFacturable() {
		 
		 if (pesoVolumetrico()>peso) {
			 return pesoVolumetrico();
		 } else {
			 return peso;
		 }
	 }
	
	public void mostrarResultados() {
		
		System.out.println("CLASE CAJA");
		System.out.println("Volumen: "+volumenCaja());
		System.out.println("Peso volumetrico: "+pesoVolumetrico());
		System.out.println("Peso facturables: "+pesoFacturable());
		
		
	}

}
