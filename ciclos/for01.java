package ciclos;

public class for01 {

	public static void main(String[] args) {
		
		int num=3, suma=0;
		
		for (int i=1; i<51; i++) {
			
			System.out.print(num+" ");
			suma+=num;
			num+=7;
		}

		System.out.print("\nLa suma es "+suma);
	}

}
