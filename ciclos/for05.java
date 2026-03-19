package ciclos;

public class for05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=70, min=20, suma = 0, cantMay = 0, cantMen = 0, edad;
		double promedio;
		
		for (int i=1; i<=45; i++) {
			
			edad=(int) ((Math.random()*(max-min+1))+min);
			
			System.out.println("Edad "+i+"°: "+edad);
			
			if (edad>=20 && edad<30) {
				cantMen++;
			} else {
				cantMay++;
			}
			
			suma+=edad;
			
		}
		
		promedio=suma/45;
		
		System.out.println("El promedio de las edades es "+promedio);
		System.out.println("Hay "+cantMen+" personas menores de edad");
		System.out.println("Hay "+cantMay+" personas mayores de edad");
	}

}
