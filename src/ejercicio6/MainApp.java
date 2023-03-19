package ejercicio6;

import java.util.ArrayList;

public class MainApp {

	public static ArrayList<Espectador> generadorEspectadores(int n) {
		ArrayList<Espectador> espectadores = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Espectador espectador = new Espectador();
			espectadores.add(espectador);
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

		Espectador espectAleatorio = new Espectador();

		// rellenamos array de espectadores aleatorios
		// Espectador[] espectadores = new Espectador[80];
		ArrayList<Espectador> espectadores = generadorEspectadores(10);

		/*
		 for (int i = 0; i < espectadores.size(); i++) { espectadores[i] =
		 espectAleatorio;
		 
		 }
		 */
		
		
		for (int i = 0; i < espectadores.size(); i++) {
			if (sala1.AssignarAsiento(espectadores.get(i))) {
				sala1.AssignarAsiento(espectadores.get(i));

			}

		}

		System.out.println("Abierta sala para película " + sala1.getPelicula() + "con los siguientes espectadores:\n");

//	sala3D.AssignarAsiento(espectAleatorio);
//	sala3.AssignarAsiento(espectAleatorio);

	}

}
