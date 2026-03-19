package claseArreglo;

public class arregloEdades {

	private int[] edad;
	private int indice;
	
	//Constructor
	public arregloEdades() {
		edad = new int[10];
		indice = 0;
	}

	//Metodos  PUBLICOS
	public int tamaño(){
		return indice;
	}
	
	public int obtener(int posicion){
		return edad[posicion];
	}
	
	public void ampliarArreglo() {
		int[] aux=edad;
		edad = new int[indice+10];
		
		for (int i=0; i<indice; i++){
			edad[i]=aux[i];
		}
	}
	
	public void adicionar(int nuevaEdad){
		if(indice == edad.length){
			ampliarArreglo();
		}
			else{edad[indice]=nuevaEdad;
		indice++;
		}
	}
	
	public void eliminarAlFinal(){
		indice--;
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	public int edadMayor() {
		int edadMayor=edad[0];
		for(int i=0; i<indice; i++){
			if(edad[i]>edadMayor){
				edadMayor=edad[i];
			}
		}
		return edadMayor;
	}
	
	public int posPrimeraEdadAdulta() {
		for(int i=0; i<indice; i++){
			if(edad[i]>=20 && edad[i]<=52){
				return i;
			}
		}
		return -1;
	}
	
	public void incremetarPrimeraEdadAdulta(){
		int pos=posPrimeraEdadAdulta();
		
		if(pos!=-1){
			edad[pos]=edad[pos]+5;
		}
	}
	
	public void reemplazarPrimeraEdadAdulta() {
		int pos=posPrimeraEdadAdulta();
			
		if (pos!=-1){
			edad[pos]=edadMayor();
		}
		
	}
	
	public int ultimaEdad(){
		return edad[indice-1];
	}
	
	public int sumarEdades() {
		int suma=0;
		for(int i=0; i<indice; i++){
			suma+=edad[i];
		}
		return suma;
	}
	
	public double promedio(){
		return (sumarEdades()*1.0)/indice;
	}
	
	public void buscarAdicionar(int numero){
		int pos=buscarPosicionEdad(numero);
		if (pos == -1) {
			adicionar(numero);
		}
	}
	
	//Metodos PRIVADOS
	//Los pongo en metodo publicos
	
	public int buscarPosicionEdad(int numero) {
		for(int i=0; i<indice; i++){
			if(edad[i] == numero){
				return i;
			}
		}
		return -1;
	}
	
	public void intercambiarPosicionEdades(int pos1, int pos2){
		int aux=edad[pos1];
		edad[pos1] = edad[pos2];
		edad[pos2] = aux;
	}
	
	
}
