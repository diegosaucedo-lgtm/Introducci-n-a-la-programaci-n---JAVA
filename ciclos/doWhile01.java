package ciclos;

public class doWhile01 {

	public static void main(String[] args) {

		int dado;
		do {
			
			
			dado=(int) (Math.random()*6)+1;
			System.out.println(dado);
			
		} while (dado != 6);
		
		
	}

}
