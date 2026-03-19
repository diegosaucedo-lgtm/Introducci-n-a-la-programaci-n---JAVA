package poo;

public class clase07 {
	
	//Atributos
	public int num1, num2, num3, menor, mayor, medio;
	
	//Metodos;
	public void numeroMenor() {
		
		 
		if (num1<num2 && num1<num3) {
			menor = num1;
		} else if (num2<num1 && num2<num3) {
			menor = num2;
		} else {
			menor = num3;
		}
	}
	
	public void numeroMayor() {
		
		
		if (num1>num2 && num1>num3) {
			mayor = num1;
		} else if (num2>num1 && num2>num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		
		
	}
	
	
	public void numeroMedio() {
		
	
		
		if ((mayor == num1 && menor == num2) || (mayor == num2 && menor == num1) ) {
			medio=num3;
		} else if ((mayor == num3 && menor == num1) || (mayor == num1 && menor == num3)) {
			medio=num2;
		} else {
			medio=num1;
		}
		
		
		
	}
	
	public void mostrarResultados() {
		
		
		System.out.println("CLASE NUMERO");
		System.out.println("El número mayor es "+mayor);
		System.out.println("El número menor es "+menor);
		System.out.println("El número del medio es "+medio);
		
	}
	
	
	

}
