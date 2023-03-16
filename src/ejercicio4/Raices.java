package ejercicio4;

public class Raices {

	private double a;
	private double b;
	private double c;

	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		double discriminante = (Math.pow(b, 2) - 4 * a * c);
		return discriminante;
	}

	public boolean tieneRaices(double discriminante) {
		if (discriminante >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean tieneRaiz(double discriminante) {
		if (discriminante == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void calcular() {
		double discriminante = getDiscriminante();
		if (discriminante > 0) {
			System.out.println("La ecuación tiene 2 soluciones:\n");
			obtenerRaices();
		} else if (discriminante == 0) {
			System.out.println("La ecuación tiene 1 solución");
			obtenerRaiz();
		} else {
			System.out.println("La ecuación no tiene solución.");
		}
	}

	public void obtenerRaices() {
		double sol1 = 0.0;
		double sol2 = 0.0;

		sol1 = -b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a;
		sol2 = -b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a;

		System.out.println("Las soluciones de la ecuacion son: " + sol1 + " y " + sol2);
	}

	public void obtenerRaiz() {
		double sol1 = 0.0;
		double sol2 = 0.0;

		sol1 = -b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a;
		sol2 = -b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / 2 * a;

		if (sol1 == 0) {
			System.out.println("La solucion de la ecuacion es: " + sol1);
		} else {
			System.out.println("La solucion de la ecuacion es: " + sol2);
		}
	}

}
