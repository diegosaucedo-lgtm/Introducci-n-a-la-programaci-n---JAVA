package poo;

import javax.swing.JOptionPane;


public class operacionObjetoArgumento {
	
	public static void main (String [] args) {
		
		int n01=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer número: "));
		int n02=Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo número: "));
		
		operacionClaseArgumento oper = new operacionClaseArgumento();
		
		oper.sumar(n01, n02);
		oper.restar(n01, n02);
		oper.multiplicar(n01, n02);
		oper.dividir(n01, n02);
		
		oper.mostrarResultados();
		
		
	}
	
	

}
