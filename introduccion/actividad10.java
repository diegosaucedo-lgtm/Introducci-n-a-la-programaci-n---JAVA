package introduccion;

import java.util.Scanner;

public class actividad10 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double produccion, contabilidad, marketing, soporte, rrhh, donacion;
		
		System.out.println("Calcular donaciones");
		System.out.println("Ingresa el monto de la donación: ");
		donacion = leer.nextDouble();
		produccion=0.25*donacion;
		soporte=0.20*donacion;
		marketing=0.15*(produccion+soporte);
		contabilidad=0.40*(marketing+soporte);
		rrhh=donacion-(produccion+soporte+marketing+contabilidad);
		System.out.println("Producción: "+produccion);
		System.out.println("Soporte: "+soporte);
		System.out.println("Marketing: "+marketing);
		System.out.println("Contabilidad: "+contabilidad);
		System.out.println("Recursos humanos: "+rrhh);

	}

}
