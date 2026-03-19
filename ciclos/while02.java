package ciclos;

public class while02 {

	public static void main(String[] args) {
		
		int suma=0, cont;
		
		
		cont=3;
		while (cont<204) {
			
			System.out.print(cont+" ");
			suma+=cont;
			cont+=4;
			
			
		}
		
		System.out.print("\nLa suma es "+suma);
		

	}

}
