package ciclos;

public class for04 {

	public static void main(String[] args) {
		
		int sueldo=0, max=3500, min=2500, cont1=0, cont2=0, suma=0;
		double promedio;
		
		for (int i=1; i<31; i++) {
			
			sueldo=(int) (Math.random()*(max-min+1))+min;
			
			System.out.println("Sueldo del "+i+"° empleado: "+sueldo);
			
			suma+=sueldo;
			
			if (sueldo>3000) {
				cont1++;
			} else {
				cont2++;
			}
			
			
		}
		
		promedio=suma/30;
		
		System.out.println("El promedio de los sueldos es "+promedio);
		System.out.println("Hay "+cont1+" empleados cuyo sueldo supera los 3000 soles");
		System.out.println("Hay "+cont2+" empleados cuyo sueldo es igual o menor a 3000 soles");
		
	}

}
