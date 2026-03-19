package poo;

public class clase02 {


		//Atributos
		public int codigo;
		public String duracionMinutos, titulo;
		public double precioSoles, precioDolares;

		//Metodos
		
		public void calcularPrecioDolares() {
			
			precioDolares=precioSoles/3.38;
		}

		public void mostraDatos() {
			
			System.out.println("CLASE FILMACION");
			System.out.println("Código: "+codigo);
			System.out.println("Título: "+titulo);
			System.out.println("Duración en minutos: "+duracionMinutos);
			System.out.println("Precio en soles: s/."+precioSoles);
			System.out.println("Precio en dolares: s/."+precioDolares);
		}

}
