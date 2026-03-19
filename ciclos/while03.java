package ciclos;

public class while03 {

	public static void main(String[] args) {
		
		int sum=0, cont, num;
		
		cont=1;
		num=5;
		while (cont<56){
			
			System.out.print(num+" ");
			sum+=num;
			num+=7;
			cont++;
			
		}
		
		System.out.print("\nLa suma es "+sum);

	}

}
