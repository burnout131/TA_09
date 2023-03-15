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
	                            	System.out.println(mostrarAprobados(arrayEstudiante));
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
		
		ArrayList<Estudiante> arrayAprobados = new ArrayList<Estudiante>();
		
		for (Estudiante[] estudiantes : arrayEstudiante) {
			for (Estudiante estudiante : estudiantes) {
				if(estudiante.getNota()>=5) {
					arrayAprobados.add(estudiante);
				}
			}
		}

		return arrayAprobados.toString();
	}

}
