package poo_avanzado;


public class vehiculoPrincipal {

	public static void main(String[] args) {
		// Construyo unn arreglo con los atributos de la clase vehiculo
		vehiculoClase carros[] = new vehiculoClase[4];
		
		carros[0]=new vehiculoClase("GH67","Ferrari","A89");
		carros[1]=new vehiculoDeportivoPolimorfismo("KUI","Audi","A90",4);
		carros[2]=new vehiculoFurgonetaPolimorfismo("SOI","Toyota","AS5",800);
		carros[3]=new vehiculoTurismoPolimorfismo("JUI","Mercedes","IO4",900);

		for (vehiculoClase vehiculoClase : carros) {
			System.out.println (vehiculoClase.mostrarDatos());
			System.out.println("");
			}
	}

}
