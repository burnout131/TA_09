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

	//Metodo darClase para averiguar si cumplen los requisitos para abrir un Aula y dar clase
	public boolean darClase(ArrayList<Profesor> arrayProfesor, ArrayList<Estudiante> arrayEstudiante) {
		//Creamos un contador para comprobar el requisito de estudiantes minimos para abrir aula
		int contadorEstudiantes = 0;

		System.out.println("\n--------------------------------------------------------");
		for (Estudiante estudiante : arrayEstudiante) {
			
			if (estudiante.disponibilidad()) {
				contadorEstudiantes++;
			}
		}
		//Verificamos si hay estudiantes suficientes llamando al metodo disponibilidad
		if (contadorEstudiantes > 0.5 * maxEstudiantes) {
			for (Profesor profesor : arrayProfesor) {
				//Comprobamos si hay profesor que imparte la materia disponible
				if (profesor.getMateriaImpartida() == this.materia) {
					if (profesor.disponibilidad()) {
						System.out.println(profesor.toString());
						System.out.println(
								"Aula " + idAula + " abierta correctamente para la asigntatura de " + materia + ".");
						//Imprimimos los estudiantes aprobados
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
	
	//Creamos un metodo para imprimir los estudiantes aprobados y su nota
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
