package ejercicio1;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
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

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {

		String opcion = Character.toString(consumoEnergetico).toUpperCase();
		switch (opcion) {
		case "A":
			this.consumoEnergetico = 'A';
			break;
		case "B":
			this.consumoEnergetico = 'B';
		case "C":
			this.consumoEnergetico = 'C';
		case "D":
			this.consumoEnergetico = 'D';
		case "E":
			this.consumoEnergetico = 'E';
		case "F":
			this.consumoEnergetico = 'F';
		default:
			System.out.println("El caracter introducido no es correcto.");
		}

	}
	
	public void comprobarColor(String color) {
		switch (color.toLowerCase()) {
		case "blanco":
			this.color = "blanco";
			break;
		case "negro":
			this.color = "negro";
			break;
		case "rojo":
			this.color = "rojo";
			break;
		case "azul":
			this.color = "azul";
			break;
		case "gris":
			this.color = "gris";
			break;
		default:
			System.out.println("El color introducido no es válido.");
			break;
		}
	}
	
}
