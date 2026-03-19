package poo;

public class encapsulamientoObjeto1 {

	public static void main (String [] args) {
		
	encapsulamientoClase1 objeto=new encapsulamientoClase1();
	
	objeto.setAtributo1(40);
	objeto.atributo2=45;
	objeto.setEdad(80);
	
	System.out.println("Atributo 1: "+objeto.getAtributo1());
	System.out.println("Atributo 2: "+objeto.atributo2);
	System.out.println("Atributo 3: "+objeto.getEdad());
	
	}
}
