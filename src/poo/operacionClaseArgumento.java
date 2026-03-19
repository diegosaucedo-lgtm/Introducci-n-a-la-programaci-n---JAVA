package poo;

public class operacionClaseArgumento {

	//Atributos
			int suma, resta, mult, div;
			
			//Metodos
				
			//Metodo para sumar
			public void sumar(int numero1, int numero2) {
				suma=numero1+numero2;
			}
			
			//Metodo para sumar
				public void restar(int numero1, int numero2) {
					resta=numero1-numero2;
				}
			
			//Metodo para sumar
				public void multiplicar(int numero1, int numero2) {
					mult=numero1*numero2;
				}
			
			
			//Metodo para sumar
				public void dividir(int numero1, int numero2) {
					div=numero1/numero2;
				}
			
				
			public void mostrarResultados() {
				System.out.println("La suma es "+suma);
				System.out.println("La resta es "+resta);
				System.out.println("La multiplicación es "+mult);
				System.out.println("La división es "+div);
				
			}
}
