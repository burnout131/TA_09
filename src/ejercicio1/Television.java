package ejercicio1;

public class Television extends Electrodomestico {
	private double resolucion;
	private boolean sintonizadorTDT;
	private final double RESOLUCION_DEFAULT = 20;
	
	public Television() {
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = false;
	}
	
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public double precioFinal(Double resolucion) {
		if(resolucion > 40) {
			precioBase += precioBase + (0.3 * 100);
		}
		
		if(sintonizadorTDT) {
			precioBase += 50;
		}
		return super.precioFinal(precioBase);
	}
}
