package interfazGrafica;

import javax.swing.*;
import java.awt.event.*;

public class combinar extends JFrame implements ActionListener {

	private JTextField text;
	private JTextArea area;
	private JScrollPane scroll;
	private JButton boton1;
	
	String texto="";
	
	public combinar(){
		
		setLayout(null);
		
		text = new JTextField();
		text.setBounds(10, 10, 200, 20);
		add(text);
		
		boton1 = new JButton("Agregar");
		boton1.setBounds(220, 10, 80, 20);
		add(boton1);
		
		boton1.addActionListener(this);
		
		area = new JTextArea();
		scroll = new JScrollPane(area);
		scroll.setBounds(10, 40, 400, 300);
		add(scroll);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource() == boton1) {
			
			texto+=text.getText()+"\n";
			area.setText(texto);
			text.setText("");
			
		}
	}
	
	
	
	
	public static void main (String args[]) {
		
		combinar combinar1 = new combinar();
		
		combinar1.setBounds(0, 0, 400, 400);
		combinar1.setVisible(true);
		combinar1.setResizable(true);
		
	}
	
	
	
}


