package ejercicio2;

public class Videojuego implements Entregable {
	protected String titulo;
	protected double horasEstimadas = 10;
	protected boolean entregado = false;
	protected String genero;
	protected String compania;

	public Videojuego() {

	}


	public Videojuego(String titulo, double horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego(String titulo, double horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Título:" + getTitulo() + ";\nHoras estimadas de juego: " + getHorasEstimadas()
				+ ";\nGenero: " + getGenero() + ";\nCompañia:" + getCompania() + ".";
	}

	@Override
	public void entregar() {
		entregado = true;
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
		if (this.horasEstimadas < ((Videojuego)a).horasEstimadas)
			return -1;
		else if (this.horasEstimadas > ((Videojuego)a).horasEstimadas)
			return 1;
		else
			return 0;
	}
}
