package ejerciciosConsola;

import javax.swing.JOptionPane;//Guarda todo en un String. Es una ventana de dialogo

public class ejercicioEntradaJPane{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String frase1;
		int n;
		char le1;
		double d1;
		
		//Ventana de entrada
		frase1 = JOptionPane.showInputDialog("Escribe la frase: ");
		n=Integer.parseInt(JOptionPane.showInputDialog("Digita el número entero: "));
		le1=JOptionPane.showInputDialog("Escibe una letra: ").charAt(0);
		d1=Double.parseDouble(JOptionPane.showInputDialog("Escribe una decimal: "));//Usa punto en el decimal
		
		//Ventana de salida
		JOptionPane.showMessageDialog(null, "La cadena es "+frase1);
		JOptionPane.showMessageDialog(null, "La número entero es "+n);
		JOptionPane.showMessageDialog(null, "La letra es "+le1);
		JOptionPane.showMessageDialog(null, "El decimal es "+d1);
	}

}
