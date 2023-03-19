package ejercicio6;

import java.util.ArrayList;
import java.util.Random;

public class Cine {
	private final int FILAS = 8;
	private final int COLUMNAS = 9;

	private Peliculas pelicula;
	private double precio;
	// Array de FILAS y COLUMNAS que simulan los asientos, se le asignaran espectadores
	private Espectador[][] EspectadoresSala = new Espectador[FILAS][COLUMNAS];

	public Cine(Peliculas pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		VaciarAsientos();
	}

	// Asigna todos los asientos vacios (null)
	public void VaciarAsientos() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				EspectadoresSala[i][j] = null;
			}
		}
	}

	// Indica si el asiento tiene un Espectador asignado o si esta vacio (null)
	public boolean AsientoOcupado(int fila, int columna) {
		return EspectadoresSala[fila][columna] != null;
	}

	/*
	 * Asigna un asiento vacio a Espectador. Devuelve un boolean indicando si se ha
	 * podido asignar un asiento
	 */
	public boolean AssignarAsiento(Espectador espectador) {
		boolean asientoAsignado = false;
		Random rand = new Random();
		ArrayList<Integer> asientosVacios = new ArrayList<Integer>();

		// Añade los asientos vacios a una lista
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (!AsientoOcupado(i, j)) {
					asientosVacios.add(i * COLUMNAS + j);
				}
			}
		}
		
		// Comprueba si hay asientos vacios
		if (!asientosVacios.isEmpty()) {
			// Selecciona un asiento aleatorio
			int posicion = rand.nextInt(asientosVacios.size());
			if(espectador.getDinero()>this.precio && espectador.getEdad()>=pelicula.getEdadMin()) {

			// Asigna el asiento al Espectador
			EspectadoresSala[posicion / COLUMNAS][posicion % COLUMNAS] = espectador;
			asientoAsignado = true;
			System.out.println(espectador.getNombre());
			}else {
				System.out.println("El espectacor "+espectador.getNombre()+ " no puede entrar en la sala porque");
				if(espectador.getDinero()<this.precio) {
					System.out.println(" no tiene dinero suficiente.");
				}else if(espectador.getEdad()<pelicula.getEdadMin()) {
					System.out.println(" no cumple los requisitos de edad mínima.");
				}
			}
		}
		
		return asientoAsignado;
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
