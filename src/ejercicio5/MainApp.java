package ejercicio5;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		//Creamos Listas de Estudiantes y de profesores
		ArrayList<Estudiante> alum = new ArrayList<Estudiante>();;
		ArrayList<Profesor> prof = new ArrayList<Profesor>();
		
		//Creamos aulas
		Aula aula = new Aula(1, 5, Materia.MATEMATICAS);
		Aula aula2 = new Aula(2, 5, Materia.FISICA);
		Aula aula3 = new Aula(3, 5, Materia.FILOSOFIA);
		
		//Creamos estudiantes
		Estudiante student = new Estudiante("Roger", 28, Genero.MASCULINO, 10.0);
		Estudiante student2 = new Estudiante("Antonio", 18, Genero.MASCULINO, 4.0);
		Estudiante student3 = new Estudiante("Maria", 23, Genero.FEMENINO, 7.0);
		Estudiante student4 = new Estudiante("Anna", 28, Genero.FEMENINO, 10.0);
		Estudiante student5 = new Estudiante("Andreu", 30, Genero.MASCULINO, 5.0);
		
		//Creamos profesores
		Profesor prof1 = new Profesor("Jose", 35, Genero.MASCULINO, Materia.MATEMATICAS);
		Profesor prof2 = new Profesor("Paula", 38, Genero.FEMENINO, Materia.FISICA);
		Profesor prof3 = new Profesor("Jordi", 30, Genero.MASCULINO, Materia.FILOSOFIA);
		Profesor prof4 = new Profesor("Sira", 39, Genero.FEMENINO, Materia.MATEMATICAS);
		Profesor prof5 = new Profesor("Carles", 30, Genero.MASCULINO, Materia.FISICA);
		Profesor prof6 = new Profesor("Maria", 38, Genero.FEMENINO, Materia.FISICA);
		
		//Añadimos estudiantes a la lista de estudiantes
		alum.add(student);
		alum.add(student2);
		alum.add(student3);
		alum.add(student4);
		alum.add(student5);
		
		//Añadimos profesores a la lista de profesores
		prof.add(prof1);
		prof.add(prof2);
		prof.add(prof3);
		prof.add(prof4);
		prof.add(prof5);
		prof.add(prof6);
		
		
		//Llamamos al metodo darClase 
		aula.darClase(prof, alum);
		aula2.darClase(prof, alum);
		aula3.darClase(prof, alum);
		
	}

}
