package ejercicio5;

public class Profesor extends Personas {
	
	enum Materia {
		MATEMATICAS,
		FILOSOFIA,
		FISICA
	}
	
	private Materia materiaImpartida;
	
	@Override
	public boolean disponibilidad() {
		boolean disponible = true;

		if((int) (Math.random() * 5) >= 4) { // 20% probabilidad
			disponible = false;
		}
		
		return disponible;
	}
}
