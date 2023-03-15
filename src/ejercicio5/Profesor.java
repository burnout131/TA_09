package ejercicio5;

public class Profesor extends Personas {

	private Materia materiaImpartida;

	public Profesor(Materia materia) {
		super();
		this.materiaImpartida = materia;
	}

	@Override
	public boolean disponibilidad() {
		boolean disponible = true;

		if ((int) (Math.random() * 5) >= 4) { // 20% probabilidad
			disponible = false;
		}

		return disponible;
	}

	public Materia getMateriaImpartida() {
		return materiaImpartida;
	}

	public void setMateriaImpartida(Materia materiaImpartida) {
		this.materiaImpartida = materiaImpartida;
	}

}
