package ciclos;

public class doWhile04 {

	public static void main(String[] args) {
		
		int  cant1=0, cant2=0, i=0;
		double promedio=0, sueldo=0, max=3500, min=2500, suma=0;
		boolean parar=true;
		
		do {
			
			
			sueldo=(int) ((Math.random()*(max-min+1))+min);
			
			if (sueldo==3500 || sueldo==2500){
				parar=false;
				
			} else {
				i++;
				System.out.println(i+"° edad: "+sueldo);
				suma+=sueldo;
				
				if (sueldo>=3000) {
					cant1++;
				} else {
					cant2++;
				}
				
			}
			
			
		} while (parar);
		
		promedio=suma/i;
		
		System.out.println("El promedio de los sueldo: "+promedio);
		System.out.println("Sueldo mayor o igual a 3000: "+cant1);
		System.out.println("Sueldo menor a 3000: "+cant2);
	}

}
