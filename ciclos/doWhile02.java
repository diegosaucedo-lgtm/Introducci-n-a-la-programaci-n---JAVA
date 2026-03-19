package ciclos;

public class doWhile02 {

	public static void main(String[] args) {
	
		int num, max=90, min=10, cont, sum=0;
		int int1=0, int2=0, int3=0, int4=0;
		
		cont=0;
		do {
			cont++;
			num =(int) (Math.random()*(max-min+1))+1;
			System.out.println(cont+"° número: "+num);
			sum+=num;
			
			if (num>=10 && num<=30) {
				int1++;
			} else {
				if (num>=31 && num<=50) {
					int2++;
				} else {
					if (num>=51 && num<=70) {
						int3++;
					} else {
						int4++;
					}
				}
			}
			
			
		} while(!(num%2 == 0 && num<55 && num>45));

		System.out.println("Se generaron "+cont+" números");
		System.out.println("La suma de todos los números es "+sum);
		System.out.println("Los números generados entre 10 y 30 son "+int1);
		System.out.println("Los números generados entre 31 y 50 son "+int2);
		System.out.println("Los números generados entre 51 y 70 son "+int3);
		System.out.println("Los números generados entre 71 y 90 son "+int4);
		
		
	}

}
