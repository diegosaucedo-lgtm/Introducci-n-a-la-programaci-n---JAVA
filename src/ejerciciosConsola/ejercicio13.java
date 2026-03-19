package ejerciciosConsola;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arreglos
		//Declaración de los arreglos
		
		int[] arreglo1=new int[4];
		
		arreglo1[0]=1;
		arreglo1[1]=2;
		arreglo1[2]=3;
		arreglo1[3]=4;
		
		System.out.println("ARREGLO 1");
		for(int i=0; i<=3; i++){
			System.out.println("El elemento del arreglo["+i+"] es "+arreglo1[i]);
		}
		
		double[] arreglo2=new double[4];
		
		arreglo2[0]=1.25;
		arreglo2[1]=2.35;
		arreglo2[2]=3.50;
		arreglo2[3]=4.78;
		
		System.out.println("ARREGLO 2");
		for(int i=0; i<4; i++) {
			System.out.println("El elemento del arreglo["+i+"] es "+arreglo2[i]);
		}
		
		String[] arreglo3=new String[4];
		
		arreglo3[0]="Hola";
		arreglo3[1]="Mariposa";
		arreglo3[2]="Gorda";
		arreglo3[3]="Marica";
		
		System.out.println("ARREGLO 3");
		for(int i=0; i<4; i++) {
			System.out.println("El elemento del arreglo["+i+"] es "+arreglo3[i]);
		}
		
	}

}
