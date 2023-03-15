package ejercicio5;

public abstract class Personas {
	public String nombre;
	public int edad;
	public Genero genero;

	public Personas(String nombre, int edad, Genero genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public abstract boolean disponibilidad();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", toString()="
				+ super.toString() + "]";
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
