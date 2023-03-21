package utilidades;

import java.util.Random;

public class UtilidadesEspectador {

	public static String generaNombre() {
		String[] nombres = { "Andres", "Carla", "Silvia", "Tomas", "Iris", "Marc", "Roger", "Paula", "Laura", "Ruben" };

		Random random = new Random();
		int indiceRandom = random.nextInt(nombres.length);
		String nombreRandom = nombres[indiceRandom];

		return nombreRandom;
	}

	public static int generaEdad() {
		int min = 3;
		int max = 100;
		Random edadRandom = new Random();

		int edad = edadRandom.nextInt((max - min) + 1) + min;
		return edad;
	}

	public static double generaDinero() {
		double min = 0;
		double max = 20;

		double dineroRandom = Math.random() * (max - min + 1) + min;
		double dinero = Math.round(dineroRandom * 100.0) / 100.0;
		return dinero;
	}

}
