package ejercicio5;

import java.util.ArrayList;

public class Aula {
	private int idAula;
	private int maxEstudiantes;
	Materia materia;
	
	

	public Aula(int idAula, int maxEstudiantes, Materia materia) {
		
		this.idAula = idAula;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
	}
	
	

	public Aula() {
		
	}



	public boolean darClase(ArrayList<Profesor[]> arrayProfesor, ArrayList<Estudiante[]> arrayEstudiante) {

		for (Estudiante[] estudiantes : arrayEstudiante) {
	        for (Estudiante estudiante : estudiantes) {
	            if (estudiante.disponibilidad()) {
	                for (Profesor[] profesores : arrayProfesor) {
	                    for (Profesor profesor : profesores) {
	                        if (profesor.getMateriaImpartida() == this.materia) {
	                            if (profesor.disponibilidad()) {
	                            	System.out.println(mostrarAprobados(estudiantes));
	                            	return true;
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
	    return false;

	}

	public String mostrarAprobados(ArrayList<Estudiante[]> arrayEstudiante) {
		for (Estudiante[] estudiantes : arrayEstudiante) {
			for (Estudiante estudiante : estudiantes) {
				
			}
		}

		return arrayEstudiantes[1].toString();
	}

}
