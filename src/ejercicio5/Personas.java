package ejercicio5;

//Creamos una clase padre abstracta para que profesor y estudiantes la extiendan y aplique el metodo disponibilidad
public abstract class Personas {
	protected String nombre;
	protected int edad;
	//establecemos genero como enum
	protected Genero genero;

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
		return  "Nombre: "+nombre +  "  ";
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
