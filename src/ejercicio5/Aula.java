package ejercicio5;

import java.util.ArrayList;

public class Aula {
	private int idAula;
	private int maxEstudiantes;
	private Materia materia;

	public Aula(int idAula, int maxEstudiantes, Materia materia) {

		this.idAula = idAula;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
	}

	public Aula() {

	}

	public boolean darClase(ArrayList<Profesor> arrayProfesor, ArrayList<Estudiante> arrayEstudiante) {
		int contadorEstudiantes = 0;

		System.out.println("\n--------------------------------------------------------");
		for (Estudiante estudiante : arrayEstudiante) {
			if (estudiante.disponibilidad()) {
				contadorEstudiantes++;
			}
		}
		if (contadorEstudiantes > 0.5 * maxEstudiantes) {
			for (Profesor profesor : arrayProfesor) {
				if (profesor.getMateriaImpartida() == this.materia) {
					if (profesor.disponibilidad()) {
						System.out.println(profesor.toString());
						System.out.println(
								"Aula " + idAula + " abierta correctamente para la asigntatura de " + materia + ".");
						System.out.println("\nESTUDIANTES APROBADOS:\n" + mostrarAprobados(arrayEstudiante));
						System.out.println("--------------------------------------------------------\n");
						return true;
					} else {
						System.out.println("El profesor no esta disponible");
					}
				}
			}
		} else {
			System.out.println("No hay alumnos suficientes para abrir el aula "+idAula+" para la asignatura "+ materia+".");
		}

		System.out.println("No fue posible abrir el aula "+idAula+" para la materia "+materia+".");
		return false;

	}

	public String mostrarAprobados(ArrayList<Estudiante> arrayEstudiante) {

		ArrayList<Estudiante> arrayAprobados = new ArrayList<Estudiante>();

		for (Estudiante estudiante : arrayEstudiante) {
			if (estudiante.getNota() >= 5) {
				arrayAprobados.add(estudiante);
			}
		}

		return arrayAprobados.toString();
	}

}
