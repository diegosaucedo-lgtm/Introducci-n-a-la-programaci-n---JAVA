package poo;

public class operacionClaseRetorno {
	
	//Metodos
	
	//Metodo para sumar
	public int sumar(int numero1, int numero2) {
		int suma;
		suma=numero1+numero2;
		return suma;
	}
	
	//Metodo para sumar
		public int restar(int numero1, int numero2) {
			int resta;
			resta=numero1-numero2;
			return resta;
		}
	
	//Metodo para sumar
		public int multiplicar(int numero1, int numero2) {
			int mult;
			mult=numero1*numero2;
			return mult;
		}
	
	
	//Metodo para sumar
		public int dividir(int numero1, int numero2) {
			int div;
			div=numero1/numero2;
			return div;
		}
	
	public void mostrarResultados(int suma, int resta, int mult, int div) {
		System.out.println("La suma es "+suma);
		System.out.println("La resta es "+resta);
		System.out.println("La multiplicación es "+mult);
		System.out.println("La división es "+div);
		
	}
	


}
