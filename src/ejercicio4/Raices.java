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
<<<<<<< HEAD

	public boolean tieneRaiz(double discriminante) {
		if (discriminante == 0) {
=======
	
	public double getDiscriminante() {
		double discriminante = (Math.pow(b, 2) -4 * a*c);
		return discriminante;
	}
	
	public boolean tieneRaices(double discriminante) {
		if (discriminante >= 0) {
>>>>>>> d8f9a3a13ceb2139d94eaba256a28591de8c0d7f
			return true;
		} else {
			return false;
		}
	}
<<<<<<< HEAD

	public void calcular(double discriminante) {
		if (discriminante > 0) {
			System.out.println("La ecuación tiene 2 soluciones.");
		} else if (discriminante == 0) {
			System.out.println("La ecuación tiene 1 solución.");
		} else {
			System.out.println("La ecuación no tiene solución.");
		}

	}

=======
>>>>>>> d8f9a3a13ceb2139d94eaba256a28591de8c0d7f
}
