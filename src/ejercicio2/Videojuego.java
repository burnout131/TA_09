package ejercicio2;

public class Videojuego implements Entregable{
	protected String titulo;
	protected double horasEstimadas = 10;
	protected boolean entregado = false;
	protected String genero;
	protected String compañia;
	
	
	public Videojuego() {
		
	}

//prueba
	public Videojuego(String titulo, double horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}


	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
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


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	@Override
	public String toString() {
		return "Videojuego [getTitulo()=" + getTitulo() + ", getHorasEstimadas()=" + getHorasEstimadas()
				+ ", getGenero()=" + getGenero() + ", getCompañia()=" + getCompañia() + "]";
	}


	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
