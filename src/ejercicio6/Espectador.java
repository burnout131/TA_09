package ejercicio6;

import java.util.Random;

import utilidades.UtilidadesEspectador;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	private boolean estaSentado;
	private int[] asientoAsignado;

	public Espectador() {
		this.nombre = UtilidadesEspectador.generaNombre();
		this.edad = UtilidadesEspectador.generaEdad();
		this.dinero = UtilidadesEspectador.generaDinero();
		this.estaSentado = false;
		this.asientoAsignado = new int[] { 0, 0 };
	}

	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.estaSentado = false;
		this.asientoAsignado = new int[] { 0, 0 };
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

	public boolean isEstaSentado() {
		return estaSentado;
	}

	public void setEstaSentado(boolean estaSentado) {
		this.estaSentado = estaSentado;
	}

	public int[] getAsientoAsignado() {
		return asientoAsignado;
	}

	public void setAsientoAsignado(int[] asientoAsignado) {
		this.asientoAsignado = asientoAsignado;
	}

	@Override
	public String toString() {
		return nombre + " (Edad: " + edad + ", Dinero: " + dinero + ")";
	}
}
