package ejercicio2;

public class MainApp {

	public static void main(String args) {

		Serie arraySerie[] = new Serie[5];

		arraySerie[0] = new Serie();
		arraySerie[1] = new Serie("La casa de papel", "Álex Pina");
		arraySerie[2] = new Serie("The Last of us", 1, "ficcion", "Craig Mazin");
		arraySerie[3] = new Serie("You", 4, "suspense", "Greg Berlanti");
		arraySerie[4] = new Serie("Friends", 10, "comedia", "Marta Kauffamn");

		Videojuego arrayVideojuego[] = new Videojuego[5];

		arrayVideojuego[0] = new Videojuego();
		arrayVideojuego[1] = new Videojuego("The last of Us", 23.0);
		arrayVideojuego[2] = new Videojuego("Mario kart",6.0, "carreras","Nintendo");
		arrayVideojuego[3] = new Videojuego("Grand theft Auto", 100, "mundo abierto", "ACS Games");
		arrayVideojuego[4] = new Videojuego("Call of Duty",7.0, "disparos en primera persona", "Activision");
		
		
		arraySerie[1].entregar();
		arraySerie[2].entregar();
		arraySerie[3].entregar();
		
		arrayVideojuego[1].entregar();
		arrayVideojuego[3].entregar();
		arrayVideojuego[4].entregar();
				
		
	}

	
	
}
