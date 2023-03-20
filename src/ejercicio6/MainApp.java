package ejercicio6;

import java.util.ArrayList;

public class MainApp {

	public static ArrayList<Espectador> generadorEspectadores(int n) {
		ArrayList<Espectador> espectadores = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			espectadores.add(new Espectador());
		}
		return espectadores;
	}

	public static void main(String[] args) {

		Peliculas pelicula1 = new Peliculas("The Shawshank Redemption", 142, 12, "Frank Darabont");
		Peliculas pelicula2 = new Peliculas("The Godfather", 177, 16, "Ford Coppola");
		Peliculas pelicula3 = new Peliculas("The Dark Knight", 152, 12, "Christoper Nolan");

		Cine sala1 = new Cine(pelicula1, 8);
		Cine sala3D = new Cine(pelicula2, 15);
		Cine sala3 = new Cine(pelicula3, 8);

		// Rellenamos array de espectadores aleatorios
		// Espectador[] espectadores = new Espectador[80];
		ArrayList<Espectador> espectadores = generadorEspectadores(10);

		for (int i = 0; i < espectadores.size(); i++) {
			sala1.AssignarAsiento(espectadores.get(i));
		}

		System.out.println("\nAbierta sala (precio entrada: " + sala1.getPrecio() + " euros) para pelicula "
				+ sala1.getPelicula() + " con los siguientes espectadores:\n");

		sala1.imprimirSala();
	}
}
