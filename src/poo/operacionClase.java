package poo;

import javax.swing.JOptionPane;

public class operacionClase {
	
	//Atributos
	int numero1, numero2, suma, resta, mult, div;
	
	//Metodos
	
	//Metodo para pedir los numeros a los usuarios
		public void leerNumeros() {
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer número: "));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo número: "));
		}
		
	//Metodo para sumar
	public void sumar() {
		suma=numero1+numero2;
	}
	
	//Metodo para sumar
		public void restar() {
			resta=numero1-numero2;
		}
	
	//Metodo para sumar
		public void multiplicar() {
			mult=numero1*numero2;
		}
	
	
	//Metodo para sumar
		public void dividir() {
			div=numero1/numero2;
		}
	
	public void mostrarResultados() {
		System.out.println("La suma es "+suma);
		System.out.println("La resta es "+resta);
		System.out.println("La multiplicación es "+mult);
		System.out.println("La división es "+div);
		
	}

}
