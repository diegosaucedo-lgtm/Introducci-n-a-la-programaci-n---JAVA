package poo;

public class clase01 {
	
	//Atributos
	public int codigo, horas;
	public String nombre;
	public double tarifa, sBruto, descuento, sNeto;
	
	//Metodos vacios
	public void sueldoBruto(){
		sBruto= horas*tarifa;
	}
	
	
	public void descuento() {
		
		
		if (sBruto>=6500) {
			descuento=sBruto*0.16;
		} else {
			if (sBruto>=4500) {
				descuento=sBruto*0.14;
			} else {
				descuento=sBruto*0.12;
			}
		}
		
	}
	
	public void sueldoNeto() {
		
		 sNeto = sBruto-descuento;
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("CLASE TRABAJADOR");
		System.out.println("Código del trabajador: "+codigo);
		System.out.println("Nombre del trabajador: "+nombre);
		System.out.println("Sueldo bruto: s/."+sBruto);
		System.out.println("Descuento: "+descuento);
		System.out.println("Sueldo neto: s/."+sNeto);
		
		
	}
	
	

}
