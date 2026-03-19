package interfazGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener{
 
  private JMenuBar menubar;
  private JMenu menu1;
  private JMenuItem menuitem1, menuitem2, menuitem3;

  public menu(){
    setLayout(null);
    //Menu bar es la barra de los demas menus
    menubar = new JMenuBar();
    //Se añade el menu bar
    setJMenuBar(menubar);

    //Menu como tal
    menu1 = new JMenu("Opciones");
    //añade el menu 
    menubar.add(menu1);

    //La lista de los menus
    menuitem1 = new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("Verde");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Azul");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);
  }

  public void actionPerformed(ActionEvent e){
	 //Contenedor y su nombre y debe adecuarse a la interfaz grafica cuando esta cambie
	 // Es decir, es un lienzo que se pone encima de nuestra interdas
    Container fondo = this.getContentPane();
    
    //Color y tonalidad
    if(e.getSource() == menuitem1){
       fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem2){
       fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem3){
       fondo.setBackground(new Color(0,0,255));
    }
  }  

  public static void main(String args[]){
   menu formulario1 = new menu();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
  }
}
