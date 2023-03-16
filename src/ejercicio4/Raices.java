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
	public boolean tieneRaices(double discriminante) {
		if (discriminante >= 0) {
			return true;
		} else {
			return false;
		}
	}

	
	public double getDiscriminante() {
		double discriminante = (Math.pow(b, 2) -4 * a*c);
		return discriminante;
	}
	
	
	
	
	public boolean tieneRaiz(double discriminante) {
		if (discriminante == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void calcular(double discriminante) {
		if (discriminante > 0) {
			System.out.println("La ecuación tiene 2 soluciones.");
		} else if (discriminante == 0) {
			System.out.println("La ecuación tiene 1 solución.");
		} else {
			System.out.println("La ecuación no tiene solución.");
		}

	}

}
