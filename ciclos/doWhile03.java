package ciclos;

public class doWhile03 {

	public static void main(String[] args) {
		
		int max=800, min=200, num, suma=0, cant1=0, cant2=0, cant3=0, i=0;
		boolean parar=true;
		
		
		do {
			
			num=(int) ((Math.random()*(max-min+1))+min);
			
			if (num>500 && num%2!=0) {
				parar=false;
				
			} else {
				i++;
				System.out.println(i+"° edad: "+num);
				suma+=num;
				
				if (num>=200 && num<=400) {
					cant1++;
				}
				
				if (num>=401 && num<=600) {
					cant2++;
				}
				
				if (num>=601 && num<=800) {
					cant3++;
				}
				
			}
			
			
		} while (parar);
		
		
		System.out.println("La suma de los números generados: "+suma);
		System.out.println("La números entre 200 y 400: "+cant1);
		System.out.println("La números entre 401 y 600: "+cant2);
		System.out.println("La números entre 601 y 800: "+cant3);
		

	}

}
