package ejercicio6;

import java.util.ArrayList;
import java.util.Random;

public class Cine {
	private final int FILAS = 8;
	private final int COLUMNAS = 9;

	private Peliculas pelicula;
	private double precio;
	// Array de FILAS y COLUMNAS que simulan los asientos, se le asignan
	// espectadores
	private Espectador[][] espectadoresSala = new Espectador[FILAS][COLUMNAS];

	public Cine(Peliculas pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		VaciarAsientos();
	}

	// Asigna todos los asientos vacios (null)
	public void VaciarAsientos() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				espectadoresSala[i][j] = null;
			}
		}
	}

	// Indica si el asiento tiene un Espectador asignado o si esta vacio (null)
	public boolean AsientoOcupado(int fila, int columna) {
		return espectadoresSala[fila][columna] != null;
	}

	// Asigna un asiento vacio a Espectador
	public void AssignarAsiento(Espectador espectador) {
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
			if (espectador.getDinero() > this.precio && espectador.getEdad() >= pelicula.getEdadMin()) {
				// Asigna el asiento al Espectador
				espectadoresSala[posicion / COLUMNAS][posicion % COLUMNAS] = espectador;
			} else {
				// Muestra porque al Espectador no se le puede asignar un asiento
				System.out.print("El espectador " + espectador + " no puede entrar en la sala porque");
				if (espectador.getDinero() < this.precio) {
					System.out.println(" no tiene dinero suficiente.");
				} else if (espectador.getEdad() < pelicula.getEdadMin()) {
					System.out.println(" no cumple los requisitos de edad minima.");
				}
			}
		} else {
			System.out.println("La sala ya esta completa");
		}
	}

	public void imprimirSala() {
		System.out.printf("%2S", "");
		for (int i = 0; i < espectadoresSala[0].length; i++) {
			System.out.printf("%9c", (char) (i + 65));
		}
		System.out.println();
		// Recorrer cada fila del arreglo
		for (int i = 0; i < espectadoresSala.length; i++) {
			// Recorrer cada columna de la fila actual
			System.out.print(espectadoresSala.length - i + " ");
			for (int j = 0; j < espectadoresSala[i].length; j++) {
				if (espectadoresSala[i][j] != null) {
					// Imprimir el valor del elemento actual
					System.out.printf("%9S",espectadoresSala[i][j].getNombre());
				} else {
					System.out.printf("%9S","O");
				}
			}
			// Salto de linea al final de cada fila
			System.out.println();
		}
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

	public Espectador[][] getEspectadoresSala() {
		return espectadoresSala;
	}

	public void setEspectadoresSala(Espectador[][] espectadoresSala) {
		this.espectadoresSala = espectadoresSala;
	}
}
