package condicionalesCompuesta;

import java.util.Scanner;

public class actividad07 {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		int horas;
		double sBruto, sNeto, recargo = 0, descuento, tarifa;
		
		System.out.println("Calcular el SUELDO");
		System.out.println("Ingresa la tarifa normal: ");
		tarifa=leer.nextDouble();
		System.out.println("Ingresa las horas trabajadas: ");
		horas=leer.nextInt();
		
		if (horas>48) {
			recargo=tarifa*0.15;
			tarifa=tarifa+recargo;
			
		} 
		
		sBruto=tarifa*horas;
		
		if (sBruto>3500) {
			descuento=sBruto*0.15;
			
		} else {
			descuento=sBruto*0.11;
		}
		
		sNeto=sBruto-descuento;
		
		System.out.println("Tarifa normal: s/."+tarifa);
		System.out.println("Horas trabajadas: "+horas);
		System.out.println("Recargo: s/."+recargo);
		System.out.println("Sueldo bruto: s/. "+sBruto);
		System.out.println("Descuento: s/. "+descuento);
		System.out.println("Sueldo neto: s/. "+sNeto);
	}

}
