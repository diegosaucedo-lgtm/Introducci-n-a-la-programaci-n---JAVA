package ejerciciosConsola;

import javax.swing.JOptionPane;

public class ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Buscqueda secuencial de un datos
		int arrg[] = {4,8,1,0,11,6,100};
		int bus;
		boolean band=false;
		
		bus=Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));
		
		//Busqueda secuencial
		int i=0;
		
		while (i<6 && band==false) {
			if (arrg[i] == bus ){
				band=true;
			}
			i++;	
		}
		
		if (band == false){
			JOptionPane.showMessageDialog(null,"El número no se encuentra en el arreglo");
		} else {
			JOptionPane.showMessageDialog(null,"El número sí se encuentra en el arreglo y en la posición "+(i-1));
		}

	}

}
