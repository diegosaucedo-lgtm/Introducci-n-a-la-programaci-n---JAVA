package poo;

import javax.swing.JOptionPane;


public class operacionObjetoRetorno {
	
	public static void main (String [] args) {
		int n01=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer número: "));
		int n02=Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo número: "));
		
		operacionClaseRetorno oper = new operacionClaseRetorno();
		
		int sumar1 = oper.sumar(n01, n02);
		int restar1 = oper.restar(n01, n02);
		int multiplicacion = oper.multiplicar(n01, n02);
		int división = oper.dividir(n01, n02);
		
		oper.mostrarResultados(sumar1, restar1, multiplicacion, división);
		
		//Imprimir sin variable auxiliar
		/*
		 * System.out.println("La suma es "+oper.sumar(n01,02));
		 */
		
	}
	
	

}
