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
		double discriminante = (Math.pow(b, 2) -4 * a*c);
		return discriminante;
	}
	
	public boolean tieneRaices(double discriminante) {
		if (discriminante >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
