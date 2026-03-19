package claseArreglo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import claseArreglo.arregloEdades;

public class JFarregloEdades extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JTextField txtPos1;
	private JTextField txtPos2;
	private JButton btnAdicionar;
	private JButton btnEliminarAlFinal;
	private JButton btnEliminarTodo;
	private JButton btnIncrementarPrimeraEdadAdulta;
	private JButton btnRemplazarPrimeraEdadAdulta;
	private JButton btnUltimaEdad;
	private JButton btnPromedio;
	private JButton btnSuma;
	private JButton btnBuscaPosicionDe;
	private JButton btnBuscaadicionar;
	private JButton btnIntercambiarDeEdades;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	//Variable global -> creamos el objeto
	arregloEdades ae=new arregloEdades();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFarregloEdades frame = new JFarregloEdades();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFarregloEdades() {
		setTitle("Problema_6_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 10, 46, 23);
		contentPane.add(lblEdad);

		txtEdad = new JTextField();
		txtEdad.setBounds(66, 10, 86, 23);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("De");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(327, 367, 56, 16);
		contentPane.add(lblNewLabel);
		
		txtPos1 = new JTextField();
		txtPos1.setBounds(353, 364, 46, 22);
		contentPane.add(txtPos1);
		txtPos1.setColumns(10);
		
		JLabel lblA = new JLabel("a");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblA.setBounds(411, 367, 56, 16);
		contentPane.add(lblA);
		
		txtPos2 = new JTextField();
		txtPos2.setColumns(10);
		txtPos2.setBounds(433, 364, 46, 22);
		contentPane.add(txtPos2);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(300, 40, 225, 23);
		contentPane.add(btnAdicionar);

		btnEliminarAlFinal = new JButton("Eliminar al final");
		btnEliminarAlFinal.addActionListener(this);
		btnEliminarAlFinal.setBounds(300, 70, 225, 23);
		contentPane.add(btnEliminarAlFinal);

		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(300, 100, 225, 23);
		contentPane.add(btnEliminarTodo);
		
		btnIncrementarPrimeraEdadAdulta = new JButton("Incrementar primera edad adulta");
		btnIncrementarPrimeraEdadAdulta.addActionListener(this);
		btnIncrementarPrimeraEdadAdulta.setBounds(300, 130, 225, 23);
		contentPane.add(btnIncrementarPrimeraEdadAdulta);

		btnRemplazarPrimeraEdadAdulta = new JButton("Remplazar primera edad adulta");
		btnRemplazarPrimeraEdadAdulta.addActionListener(this);
		btnRemplazarPrimeraEdadAdulta.setBounds(300, 160, 225, 23);
		contentPane.add(btnRemplazarPrimeraEdadAdulta);
			
		btnUltimaEdad = new JButton("Ultima edad");
		btnUltimaEdad.addActionListener(this);
		btnUltimaEdad.setBounds(300, 189, 225, 23);
		contentPane.add(btnUltimaEdad);

		btnSuma = new JButton("Suma");
		btnSuma.addActionListener(this);
		btnSuma.setBounds(300, 216, 225, 23);
		contentPane.add(btnSuma);

		btnPromedio = new JButton("Promedio");
		btnPromedio.addActionListener(this);
		btnPromedio.setBounds(300, 245, 225, 23);
		contentPane.add(btnPromedio);
		
		btnBuscaPosicionDe = new JButton("Busca posicion de una edad");
		btnBuscaPosicionDe.addActionListener(this);
		btnBuscaPosicionDe.setBounds(300, 273, 225, 23);
		contentPane.add(btnBuscaPosicionDe);
		
		btnBuscaadicionar = new JButton("BuscarAdicionar");
		btnBuscaadicionar.addActionListener(this);
		btnBuscaadicionar.setBounds(300, 301, 225, 23);
		contentPane.add(btnBuscaadicionar);
		
		btnIntercambiarDeEdades = new JButton("Intercambio de Edades");
		btnIntercambiarDeEdades.addActionListener(this);
		btnIntercambiarDeEdades.setBounds(300, 328, 225, 23);
		contentPane.add(btnIntercambiarDeEdades);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 280, 412);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);	

	}

	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == btnIntercambiarDeEdades) {
			actionPerformedBtnIntercambiarDeEdades(arg0);
		}
		if (arg0.getSource() == btnBuscaadicionar) {
			actionPerformedBtnBuscaadicionar(arg0);
		}
		if (arg0.getSource() == btnBuscaPosicionDe) {
			actionPerformedBtnBuscaPosicionDe(arg0);
		}
		if (arg0.getSource() == btnPromedio) {
			actionPerformedBtnPromedio(arg0);
		}
		if (arg0.getSource() == btnSuma) {
			actionPerformedBtnSuma(arg0);
		}
		if (arg0.getSource() == btnUltimaEdad) {
			actionPerformedBtnUltimaEdad(arg0);
		}
		if (arg0.getSource() == btnRemplazarPrimeraEdadAdulta) {
			actionPerformedBtnRemplazarPrimeraEdadAdulta(arg0);
		}
		if (arg0.getSource() == btnIncrementarPrimeraEdadAdulta) {
			actionPerformedBtnIncrementarPrimeraEdadAdulta(arg0);
		}
		if (arg0.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(arg0);
		}
		if (arg0.getSource() == btnEliminarAlFinal) {
			actionPerformedBtnEliminarAlFinal(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		limpieza();
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		
		int  nuevaEdad;
		nuevaEdad=Integer.parseInt(txtEdad.getText());
		ae.adicionar(nuevaEdad);
		listar();
	}
	protected void actionPerformedBtnEliminarAlFinal(ActionEvent arg0) {
		
		if (ae.tamaño()>0){
			ae.eliminarAlFinal();
			listar();
		} else {
			mensaje("El arreglo está vacío");
		}
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent arg0) {
		
		if (ae.tamaño()>0){
			ae.eliminarTodo();
			listar();
		} else {
			mensaje("El arreglo está vacío");
		}
		
	}
	protected void actionPerformedBtnIncrementarPrimeraEdadAdulta(ActionEvent arg0) {
		
		if(ae.posPrimeraEdadAdulta()!=-1){
			ae.incremetarPrimeraEdadAdulta();
			listar();
		} else {
			mensaje("No hay edad adulta");
		}
	}
	protected void actionPerformedBtnRemplazarPrimeraEdadAdulta(ActionEvent arg0) {
		
		if(ae.posPrimeraEdadAdulta()!=-1){
			ae.reemplazarPrimeraEdadAdulta();
			listar();
		} else {
			mensaje("No hay edad adulta");
		}
		
	}
	
	protected void actionPerformedBtnUltimaEdad(ActionEvent arg0) {
		
		if(ae.tamaño()>0){
			txtS.setText("La ultima edad es "+ae.ultimaEdad());
		} else {
			mensaje("El arreglo está vacío");
		}
	}
	
	protected void actionPerformedBtnSuma(ActionEvent arg0) {
		
		if(ae.tamaño()>0){
			txtS.setText("La suma de las edades : "+ae.sumarEdades());
		} else {
			mensaje("El arreglo está vacío");
		}
	}
	
	protected void actionPerformedBtnPromedio(ActionEvent arg0){
		
		if(ae.tamaño()>0){
			txtS.setText("El promedio de las edades : "+ae.promedio());
		} else {
			mensaje("El arreglo está vacío");
		}
	}
	
	protected void actionPerformedBtnBuscaPosicionDe(ActionEvent arg0){
		
		if(ae.tamaño()>0){
			int edadBusc;
			edadBusc=Integer.parseInt(txtEdad.getText());
			txtS.setText("La edad "+edadBusc+" se encuentra en el arreglo["+ae.buscarPosicionEdad(edadBusc)+"]");
			
		} else {
			mensaje("El arreglo está vacío");
		}
	}
	
	protected void actionPerformedBtnBuscaadicionar(ActionEvent arg0){
		
		if(ae.tamaño()>0){
			int edadBusc;
			edadBusc=Integer.parseInt(txtEdad.getText());
			if (ae.buscarPosicionEdad(edadBusc)>=0){
				txtS.setText("La edad "+edadBusc+" se encuentra en el arreglo["+ae.buscarPosicionEdad(edadBusc)+"]");
			} else {
				ae.buscarAdicionar(edadBusc);
				listar();
			}
		} else {
			mensaje("El arreglo está vacío");
		}
	}

	protected void actionPerformedBtnIntercambiarDeEdades(ActionEvent arg0) {
		
		int pos1,pos2;
		
		pos1=Integer.parseInt(txtPos1.getText());
		pos2=Integer.parseInt(txtPos2.getText());
		
		ae.intercambiarPosicionEdades(pos1, pos2);
		listar();
	}
	
	
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtEdad.setText("");
		txtEdad.requestFocus();
	}
	void listar() {
		txtS.setText("");
		for(int i=0; i<ae.tamaño(); i++){
			imprimir("edad["+i+"] :"+ae.obtener(i));
		}

	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  Métodos que retornan valor (sin parámetros)
	int leerEdad()  {
		return Integer.parseInt(txtEdad.getText().trim());
	}
}