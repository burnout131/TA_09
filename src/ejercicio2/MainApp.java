package ejercicio2;

public class MainApp {

	public static void main(String[] args) {

		Serie arraySerie[] = new Serie[5];

		arraySerie[0] = new Serie();
		arraySerie[1] = new Serie("La casa de papel", "Álex Pina");
		arraySerie[2] = new Serie("The Last of us", 1, "ficcion", "Craig Mazin");
		arraySerie[3] = new Serie("You", 4, "suspense", "Greg Berlanti");
		arraySerie[4] = new Serie("Friends", 10, "comedia", "Marta Kauffamn");

		Videojuego arrayVideojuego[] = new Videojuego[5];

		arrayVideojuego[0] = new Videojuego();
		arrayVideojuego[1] = new Videojuego("The last of Us", 23.0);
		arrayVideojuego[2] = new Videojuego("Mario kart", 6.0, "carreras", "Nintendo");
		arrayVideojuego[3] = new Videojuego("Grand theft Auto", 100, "mundo abierto", "ACS Games");
		arrayVideojuego[4] = new Videojuego("Call of Duty", 7.0, "disparos en primera persona", "Activision");

		// Entrega de Series y Videojuegos con metodo entregar()

		arraySerie[1].entregar();
		arraySerie[2].entregar();
		arraySerie[3].entregar();

		arrayVideojuego[1].entregar();
		arrayVideojuego[3].entregar();
		arrayVideojuego[4].entregar();

		// Contar cuantas Series y Videojuegos hay entregados y devolverlos

		contadorSerie(arraySerie);
		contadorVideojuego(arrayVideojuego);

		masHoras(arrayVideojuego);
		masTemporadas(arraySerie);

	}

	public static void contadorSerie(Serie[] serieArray) {
		int contadorSerie = 0;
		for (int i = 0; i < serieArray.length; i++) {
			if ((serieArray[i].entregado) == true) {
				contadorSerie++;
				serieArray[i].devolver();
			}
		}
		System.out.println("Hay " + contadorSerie + " series entregadas.");
	}

	public static void contadorVideojuego(Videojuego[] juegoArray) {
		int contadorJuego = 0;
		for (int i = 0; i < juegoArray.length; i++) {
			if ((juegoArray[i].entregado) == true) {
				contadorJuego++;
				juegoArray[i].devolver();
			}
		}
		System.out.println("Hay " + contadorJuego + " videojuegos entregados.");
	}

	public static void masHoras(Videojuego[] juegoArray) {
		Videojuego masHoras = juegoArray[0];
		for (int i = 0; i < juegoArray.length; i++) {
			if (juegoArray[i].compareTo(masHoras) > 0) {
				masHoras = juegoArray[i];
			}
		}
		System.out.println("\nEl videojugo con más horas de juego es:\n\n" + masHoras.toString());
	}

	public static void masTemporadas(Serie[] serieArray) {
		Serie masTemporadas = serieArray[0];
		for (int i = 0; i < serieArray.length; i++) {
			if (serieArray[i].compareTo(masTemporadas) > 0) {
				masTemporadas = serieArray[i];
			}
		}

		System.out.println("\nLa série con más temporadas es:\n\n" + masTemporadas.toString());
	}

}
