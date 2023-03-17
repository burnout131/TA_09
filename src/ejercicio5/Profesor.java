package ejercicio5;

public class Profesor extends Personas {
		
	//Establecemos materia como enum
	protected Materia materiaImpartida;

	public Profesor(String nombre, int edad, Genero genero, Materia materia) {
		super(nombre, edad, genero);
		this.materiaImpartida = materia;
	}

	//Desarrollamos el metodo disponibilidad de la clase padre con los requisitos de profesor
	@Override
	public boolean disponibilidad() {
		boolean disponible = true;

		if((int) (Math.random() * 5) >= 4) { // 20% probabilidad
			disponible = false;
		}
		
		return disponible;
	}

	
	@Override
	public String toString() {
		return "Nombre profesor: "+nombre+ " Materia Impartida: " + getMateriaImpartida()
				+ ";";
	}

	public Materia getMateriaImpartida() {
		return materiaImpartida;
	}

	public void setMateriaImpartida(Materia materiaImpartida) {
		this.materiaImpartida = materiaImpartida;
	}
	
	
}
