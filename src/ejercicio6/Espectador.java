package ejercicio6;

import java.util.Random;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;

	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return nombre + " (Edad: " + edad + ", Dinero: " + dinero + ")";
	}

	private String generaNombre() {
		String[] nombres = { "Andres", "Carla", "Silvia", "Tomas", "Iris", "Marc", "Roger", "Paula", "Laura", "Ruben" };

		Random random = new Random();
		int indiceRandom = random.nextInt(nombres.length);
		String nombreRandom = nombres[indiceRandom];

		return nombreRandom;
	}

	private int generaEdad() {
		int min = 3;
		int max = 100;
		Random edadRandom = new Random();

		int edad = edadRandom.nextInt((max - min) + 1) + min;
		return edad;
	}

	private double generaDinero() {
		double min = 0;
		double max = 20;

		double dineroRandom = Math.random() * (max - min + 1) + min;
		double dinero = Math.round(dineroRandom * 100.0) / 100.0;
		return dinero;
	}

}
