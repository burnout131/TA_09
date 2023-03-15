package ejercicio5;

import java.util.ArrayList;

public class Aula {
	private int idAula;
	private int maxEstudiantes;
	Materia materia;

	public boolean darClase(ArrayList<Profesor[]> arrayProfesor, ArrayList<Estudiante[]> arrayEstudiante) {

		for (Estudiante[] estudiantes : arrayEstudiante) {
	        for (Estudiante estudiante : estudiantes) {
	            if (disponibilidad(estudiante)) {
	                for (Profesor[] profesores : arrayProfesor) {
	                    for (Profesor profesor : profesores) {
	                        if (profesor.materia == this.materia) {
	                            if (disponibilidad(profesor)) {
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

	public String mostrarAprobados(Estudiante[] arrayEstudiantes) {

		return arrayEstudiantes[1].toString();
	}

}
