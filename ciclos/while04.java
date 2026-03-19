package ciclos;

public class while04 {

	public static void main(String[] args) {
		
		int cont, suma=0, num1, num2;
		double fraccion;
		
		cont=1;
		num1=3;
		num2=2;
		while (cont<101) {
			
			System.out.print(num1+"/"+num2+" ");
			fraccion=num1/num2;
			suma+=fraccion;
			num1+=4;
			num2+=3;
			
			cont++;
			
		}

		System.out.print("\n La suma es "+suma);
	}

}
