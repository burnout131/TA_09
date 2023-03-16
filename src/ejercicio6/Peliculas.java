package ejercicio6;

public class Peliculas {
	
	private String titulo;
	private int duracion;
	private int edadMin;
	private String director;
	
	
	public Peliculas(String titulo, int duracion, int edadMin, String director) {
		
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getEdadMin() {
		return edadMin;
	}


	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}


	@Override
	public String toString() {
		return  titulo + " (Duracion: "+ duracion + ", Edad minima: " + edadMin + ", Director: "
				+ director + ")";
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}
	
	

}
