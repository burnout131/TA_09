package ejercicio1;

public class Electrodomestico {
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	public Electrodomestico() {
		this (100, "blanco", 'F', 5);
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this (precioBase, "blanco", 'F', peso);
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
