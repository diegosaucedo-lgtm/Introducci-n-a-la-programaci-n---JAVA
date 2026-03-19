package ciclos;

public class for07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mult = 0;
		
		for (int i=100; i<=900; i++) {
			
			System.out.println(i);
			
			if (i%3 == 0) {
				mult++;
			}
		}
		
		System.out.println("Hay "+mult+" múltiplos de 3");
	}

}
