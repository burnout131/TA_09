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

	@Override
	public String toString() {
		return "Aula [idAula=" + idAula + ", maxEstudiantes=" + maxEstudiantes + ", materia=" + materia
				+ ", toString()=" + super.toString() + "]";
	}

	public boolean darClase(ArrayList<Profesor> arrayProfesor, ArrayList<Estudiante> arrayEstudiante) {

		System.out.println("\n--------------------------------------------------------");
		for (Estudiante estudiante : arrayEstudiante) {
			if (estudiante.disponibilidad()) {
				for (Profesor profesor : arrayProfesor) {
					if (profesor.getMateriaImpartida() == this.materia) {
						if (profesor.disponibilidad()) {
							System.out.println(profesor.toString());
							System.out.println("Aula "+ idAula+" abierta correctamente.");
							System.out.println("\nESTUDIANTES APROBADOS:\n"+mostrarAprobados(arrayEstudiante));
							System.out.println("--------------------------------------------------------\n");
							return true;
						}
					}
				}
			}
		}
		System.out.println("No fue posible abrir el aula.");
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
