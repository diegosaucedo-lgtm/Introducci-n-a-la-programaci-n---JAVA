package ciclos;


public class while01 {

	public static void main(String[] args) {
		
		
		int cont, sum, par;
		
		cont=1;
		sum=0;
		while (cont<51) {
			
			par=cont*2;
			System.out.print(par+" ");
			sum+=par;
			cont++;
			
		}
		
		System.out.println("\nLa suma es "+sum);

	}

}
