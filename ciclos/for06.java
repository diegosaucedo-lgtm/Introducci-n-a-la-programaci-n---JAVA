package ciclos;


public class for06 {

	public static void main(String[] args) {
		
		int aleatorio, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		
		for (int i=1; i<=100; i++) {
			
			aleatorio=(int) (1+Math.random()*200);
			System.out.println(i+"° valor: "+aleatorio);
			
			if (aleatorio>=150) {
				c4++;
			} else if (aleatorio>=100) {
				c3++;
			} else if (aleatorio>=50) {
				c2++;
			} else {
				c1++;
			}
				
		}
		
		
		System.out.println("Cantidad de productos menores de 50: "+c1);
		System.out.println("Cantidad de productos mayores de 50 y menores que 100: "+c2);
		System.out.println("Cantidad de productos mayores de 100 y menores que 150: "+c3);
		System.out.println("Cantidad de productos mayores o iguales a 150: "+c4);

	}

}
