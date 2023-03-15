package ejercicio2;

public class Serie implements Entregable{

	protected String titulo;
	protected int numeroTemporadas = 3;
	protected boolean entregado = false;
	protected String genero;
	protected String creador;

	public Serie() {

	}

	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {

		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [getTitulo()=" + getTitulo() + ", getNumeroTemporadas()=" + getNumeroTemporadas()
				+ ", getGenero()=" + getGenero() + ", getCreador()=" + getCreador() + "]";
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		if (this.numeroTemporadas < ((Serie)a).numeroTemporadas) {
			return -1;
		} else if (this.numeroTemporadas > ((Serie)a).numeroTemporadas) {
			return 1;
		} else {
			return 2;
		}
	}
}

