package ejercicio5;

public class Estudiante extends Personas {

	private double nota;
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public Estudiante(String nombre, int edad, Genero genero, double nota) {
		super(nombre, edad, genero);
		this.nota = nota;
	}

	@Override
	public boolean disponibilidad() {
		boolean disponible = true;

		if((int) (Math.random() * 2) == 1) { // 50% probabilidad
			disponible = false;
		}
		
		return disponible;
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", toString()=" + super.toString() + "]";
	}

}

