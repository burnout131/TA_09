package ejercicio5;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Estudiante> alum = new ArrayList<Estudiante>();;
		ArrayList<Profesor> prof = new ArrayList<Profesor>();
		
		Aula aula = new Aula(1, 30, Materia.MATEMATICAS);
		Aula aula2 = new Aula(2, 30, Materia.FISICA);
		Aula aula3 = new Aula(3, 30, Materia.FILOSOFIA);
		
		Estudiante student = new Estudiante("Roger", 28, Genero.MASCULINO, 10.0);
		Estudiante student2 = new Estudiante("Antonio", 18, Genero.MASCULINO, 4.0);
		Estudiante student3 = new Estudiante("Maria", 23, Genero.FEMENINO, 7.0);
		Estudiante student4 = new Estudiante("Anna", 28, Genero.FEMENINO, 10.0);
		Estudiante student5 = new Estudiante("Andreu", 30, Genero.MASCULINO, 5.0);
		
		
		Profesor prof1 = new Profesor("Jose", 35, Genero.MASCULINO, Materia.MATEMATICAS);
		Profesor prof2 = new Profesor("Paula", 38, Genero.FEMENINO, Materia.FISICA);
		Profesor prof3 = new Profesor("Jordi", 30, Genero.MASCULINO, Materia.FILOSOFIA);
		Profesor prof4 = new Profesor("Sira", 39, Genero.FEMENINO, Materia.MATEMATICAS);
		Profesor prof5 = new Profesor("Carles", 30, Genero.MASCULINO, Materia.FISICA);
		Profesor prof6 = new Profesor("Maria", 38, Genero.FEMENINO, Materia.FISICA);
		
		alum.add(student);
		alum.add(student2);
		alum.add(student3);
		alum.add(student4);
		alum.add(student5);
		
		
		prof.add(prof1);
		prof.add(prof2);
		prof.add(prof3);
		prof.add(prof4);
		prof.add(prof5);
		prof.add(prof6);
		
		
		prof.add(prof1);
		
		aula.darClase(prof, alum);
		aula2.darClase(prof, alum);
		aula3.darClase(prof, alum);
		//System.out.println(aula.darClase(prof, alum));
	}

}
