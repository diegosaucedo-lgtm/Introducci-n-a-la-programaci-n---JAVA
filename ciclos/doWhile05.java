package ciclos;

public class doWhile05 {

	public static void main(String[] args) {


		int max=70, min=20, edad, may = 0, men = 0;
		boolean cas=true;
		
		do {
			
			edad=(int) ((Math.random()*(max-min+1))+min);
			
			if ((edad>40 && edad<50)) {
				cas=false;
				
			} else {
				System.out.println(edad);
				
				if (edad>=18) {
					may++;
				} else {
					men++;
				}
			}
			
			
			
		} while (cas);
		
		System.out.println("Hay "+may+" personas mayores de edad");
		System.out.println("Hay "+men+" personas menores de edad");
	}

}
