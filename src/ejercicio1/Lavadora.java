package ejercicio1;

public class Lavadora extends Electrodomestico {

	private final int CARGA_DEFECTO = 5;

	private double carga = CARGA_DEFECTO;

	public Lavadora(double carga) {
		super();
		this.carga = carga;
	}

	public Lavadora() {
		super();
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal(Double carga) {
		// TODO Auto-generated method stub

		if (carga > 30) {
			precioBase += 50;
		}
		return super.precioFinal(precioBase);
	}

}
