package poo;

public class clase05 {
	
	//Atributos
	int codigo, horas;
	String nombre;
	double tarifa;
	
	//Metodos
	double sueldoBruto() {
		return horas*tarifa;
	}
	
	double descuentoAFP() {
		return 0.10*sueldoBruto();
	}
	
	
	double descuentoEPS() {
		return 0.05*sueldoBruto();
	}
	
	double sueldoNeto() {
		return sueldoBruto()-descuentoAFP()-descuentoEPS();
	}
	
	void mostrarResultados() {
		
		System.out.println("CLASE EXPOSITOR");
		System.out.println("Código: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Horas trabajadas: "+horas);
		System.out.println("Tarifa x horas: "+tarifa);
		System.out.println("Sueldo bruto: s/."+sueldoBruto());
		System.out.println("Descuento AFP: s/."+descuentoAFP());
		System.out.println("Descuento EPS: s/."+descuentoEPS());
		System.out.println("Sueldo neto: s/."+sueldoNeto());
		
		
	}
	
	

}
