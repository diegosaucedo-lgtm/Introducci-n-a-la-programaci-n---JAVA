package ciclos;

public class while07 {

	public static void main(String[] args) {
		
		int cont, i, sum;
		
		cont=1;
		i=5;
		sum=0;
		
		while (cont<=50) {
			
			System.out.println(i+" ");
			sum+=i;
			i+=3;
			cont++;
			
		}

		System.out.println("------");
		System.out.println(sum);
		
	}

}
