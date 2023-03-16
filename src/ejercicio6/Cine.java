package ejercicio6;

public class Cine {
	private Peliculas pelicula;
	private double precio;
	
	public Cine(Peliculas pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
	}
	
	public Peliculas getPelicula() {
		return pelicula;
	}
	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + ", toString()=" + super.toString() + "]";
	}
	
}
