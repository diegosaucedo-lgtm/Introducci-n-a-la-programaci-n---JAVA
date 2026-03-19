package gui;

import poo.alumnoClase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class alumnoObjetoJF extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3848598636661979133L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alumnoObjetoJF frame = new alumnoObjetoJF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public alumnoObjetoJF() {
		
		setTitle("ALUMNO OBJETO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlumno = new JLabel("Alumno");
		lblAlumno.setBounds(34, 13, 273, 30);
		lblAlumno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
		contentPane.add(lblAlumno);
		
		JTextArea txtAr = new JTextArea();
		txtAr.setBounds(34, 104, 463, 238);
		contentPane.add(txtAr);
		
		JButton btnProcesar = new JButton("Mostrar");
		btnProcesar.setBounds(191, 56, 97, 25);
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(arg0.getSource() == btnProcesar) {
					actionPerformedBtnMostrar(arg0);
				}
				
			}

			private void actionPerformedBtnMostrar(ActionEvent arg0) {
				
				 alumnoClase a = new alumnoClase();
				
				a.codigo = 123456;
				a.nombre = "Diego";
				a.apellido = "Saucedo Ayola";
				a.nota1 = 15;
				a.nota2 = 20;
				
			txtAr.setText("Los datos del ALUMNO "+a.codigo+"\n");
			txtAr.append("Nombres : "+a.nombre+"\n");
			txtAr.append("Apellidos : "+a.apellido+"\n");
			txtAr.append("1° Nota : "+a.nota1+"\n");
			txtAr.append("2° Nota : "+a.nota2+"\n");
			txtAr.append("Promedio : "+a.promedio());
			
				
			}
		});
		btnProcesar.setFont(new Font("Tahoma", Font.ITALIC, 16));
		contentPane.add(btnProcesar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtAr.setText("");
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnBorrar.setBounds(315, 57, 97, 25);
		contentPane.add(btnBorrar);
		

	}
}
