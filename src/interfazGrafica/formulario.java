package interfazGrafica;


//Importa toda la paqueteria de swing al usar asterisco
//Importa los elementos
import javax.swing.*;
//Las acciones sobre un boton es un EVENTO
//Importa todos los eventos
import java.awt.event.*;


//JFrame es el contenedor de todos los elementos
//Formulario es la VENTANA
public class formulario extends JFrame implements ActionListener {

	private JTextField text, text1;
	private JTextArea area;
	private JScrollPane scroll;
	private JLabel Label1;
	private JButton Boton, boton1, boton2;
	
	//Constructor -> son las caracteristicas que tendra mi ventana
	public formulario() {
		//Nos permite ubicar el con cordenadas x,y
		setLayout(null);
		
		Label1 = new JLabel("La Geekipedia de Ernesto");
		//--------------> x,y, ancho, alto
		Label1.setBounds(10,20, 200, 50);
		
		add(Label1);
		
		
		Boton = new JButton("Cerrar");
		Boton.setBounds(200, 30, 100, 30);
		add(Boton);
		
		//Indico que el boton tendra una funcionalidad y que debemos esperar esa funcionalidad
		Boton.addActionListener(this);

		boton1 = new JButton ("1");
		boton1.setBounds(10, 70, 50, 20);
		add(boton1);
		
		boton1.addActionListener(this);
		
		text = new JTextField();
		text.setBounds(10,100, 300, 20);
		add(text);
		
		boton2 = new JButton ("Titulo");
		boton2.setBounds(10, 130, 150, 20);
		add(boton2);
		
		boton2.addActionListener(this);
		
		text1 = new JTextField();
		text1.setBounds(10,160, 300, 20);
		add(text1);
		
		//Permite escribir mutliples lineas de texto
		area = new JTextArea();
		//Son barras que me permite leer todos los datos dentro de la text area
		//Ahora, area esta dentro de scroll
		scroll = new JScrollPane(area);	
		//area.setBounds(10, 190, 300, 200);
		//add(area);
	
		scroll.setBounds(10, 190, 300, 200);
		add(scroll);
			
		
	}
	
	//Con esto voy a guardar en la memoria el evento en la variable E tipo de dato: ActionEvent
	public void actionPerformed(ActionEvent e){
		//--Recupera el evento
		// Este evento se origino en el boton
		if (e.getSource() == Boton) {
			
			//Al momento de precionar el boton hace que cierre el programa
			System.exit(0);
			
		}
		
		if (e.getSource() == boton1) {
			
			Label1.setText("Has presionado el botón");
		}
		
		if (e.getSource() == boton2 ){
			String texto = text.getText();
			//Ponemos titulo al programa es decir en la ventana
			setTitle(texto);
		}
		
	}
	
	
	
	
	public static void main(String args[]){
		
		formulario formulario1 = new formulario();
		
		//Son las dimensiones que le he dado a la ventana
		formulario1.setBounds(0,0,400,600);
		//Con este metodo lo hago visible o no 
		formulario1.setVisible(true);
		//Con esto aparece en el centro 
		formulario1.setLocationRelativeTo(null);
		//No se puede modificar el tamaño de la interfaz -> FALSE
		formulario1.setResizable(true);
		
	}
	
	
}

