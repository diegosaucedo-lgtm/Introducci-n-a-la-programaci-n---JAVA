package claseArraylist;

import java.util.ArrayList;

public class arraylistAlumno {

	//Coleccionista de objetos distintos
	//ArrayList lista=new ArrayList();
	
	//Coleccionista de objetos iguales
	//ArrayList <claseAlumnos>  alumno;
	//ArrayList <claseAlumnos> alumnos=new ArrayList <claseAlumnos> (); 
	//private ArrayList <claseAlumnos> alu=new ArrayList <claseAlumnos> (); 
	
	//Atributo privado
	private ArrayList<claseAlumnos> alu;

	//Constructor
	public arraylistAlumno() {
		alu = new ArrayList <claseAlumnos> ();
		adicionar(new claseAlumnos(123,19,15,"Ana"));
		adicionar(new claseAlumnos(124,18,15,"Anastacio"));
		adicionar(new claseAlumnos(125,11,15,"Anagrama"));
		adicionar(new claseAlumnos(126,17,13,"Ana Bolena"));
	}
	
	//Operaciones públicas básicas
	
	public void adicionar(claseAlumnos x){
		alu.add(x);
	}
	
	public int tamaño() {
		return alu.size();
	}
	
	public void eliminarAlFinal() {
		alu.remove(tamaño()-1);
	}
	
	public void eliminarTodo() {
		alu.clear();
	}
	
	public claseAlumnos obtener(int i) {
		return alu.get(i);
	}
	
	
	//Operaciones públicas complementarias
	public int cantAprobados(){
		int aprobados=0;
		for (int i=0; i<tamaño(); i++) {
			if(obtener(i).promedio() >= 13){
				aprobados++;
			}
		}
		return aprobados;
	}
	
	
	public int cantdesAprobados(){
		int desaprobados=0;
		for (int i=0; i<tamaño(); i++) {
			if(obtener(i).promedio() < 13){
				desaprobados++;
			}
		}
		return desaprobados;
	}
	
	public String nombrePrimerDesaprobado() {
		for (int i=0; i<tamaño(); i++){
			if (obtener(i).promedio() < 13) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}
	
	public String nombreUltimoAprobado() {
		for (int i=tamaño()-1; i>=0; i--){
			if (obtener(i).promedio() >= 13) {
				return obtener(i).getNombre();
			}
		}
		return null;
	}
	
	public double promedioGeneral() {
		double suma=0.0;
		for (int i=0; i<tamaño(); i++) {
			suma += obtener(i).promedio();
		}
		return suma/tamaño();
	}
	
}
