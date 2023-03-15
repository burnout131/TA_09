package ejercicio5;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Estudiante> alum = new ArrayList<Estudiante>();;
		ArrayList<Profesor> prof = new ArrayList<Profesor>();
		
		Aula aula = new Aula(1, 30, Materia.MATEMATICAS);
		
		Estudiante student = new Estudiante("Roger", 28, Genero.MASCULINO, 10.0);
		Profesor prof1 = new Profesor("Jose", 35, Genero.MASCULINO, Materia.MATEMATICAS);
		
		alum.add(student);
		prof.add(prof1);
		
		aula.darClase(prof, alum);
		//System.out.println(aula.darClase(prof, alum));
	}

}
