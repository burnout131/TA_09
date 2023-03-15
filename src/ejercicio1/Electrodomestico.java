package ejercicio1;

import java.util.Hashtable;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Diccionario de datos (peso: precio)
	protected Hashtable<Double, Double> pesoPrecio = new Hashtable<Double, Double>();
	protected Hashtable<Character, Double> letraPrecios = new Hashtable<>();

	public Electrodomestico() {
		this(100, "blanco", 'F', 5);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, "blanco", 'F', peso);
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

		this.consumoEnergetico = consumoEnergetico;

	}

	protected static void comprobarConsumoEnergetico(char consumo) {

		String opcion = Character.toString(consumo).toUpperCase();
		switch (opcion) {
		case "A":
			consumo = 'A';
			break;
		case "B":
			consumo = 'B';
		case "C":
			consumo = 'C';
		case "D":
			consumo = 'D';
		case "E":
			consumo = 'E';
		case "F":
			consumo = 'F';
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
			System.out.println("El color introducido no es v�lido.");
			break;
		}
	}

	protected void crearLetraPrecios() {
		this.letraPrecios.put('A', 100.0);
		this.letraPrecios.put('B', 80.0);
		this.letraPrecios.put('C', 60.0);
		this.letraPrecios.put('D', 50.0);
		this.letraPrecios.put('E', 30.0);
		this.letraPrecios.put('F', 10.0);
	}

	protected void crearPesoPrecio() {
		this.pesoPrecio.put(19.0, 10.0);
		this.pesoPrecio.put(49.0, 50.0);
		this.pesoPrecio.put(79.0, 80.0);
		this.pesoPrecio.put(80.0, 100.0);

	}

	public double precioFinal() {
		double precioFinal = this.precioBase;

		crearLetraPrecios();

		switch (this.consumoEnergetico) {
		case 'A':
			precioFinal += letraPrecios.get('A');
			break;
		case 'B':
			precioFinal += letraPrecios.get('B');
			break;
		case 'C':
			precioFinal += letraPrecios.get('C');
			break;
		case 'D':
			precioFinal += letraPrecios.get('D');
			break;
		case 'E':
			precioFinal += letraPrecios.get('E');
			break;
		case 'F':
			precioFinal += letraPrecios.get('F');
			break;
		}

		// FALTARIA AUGMENTAR EL PRECIO FINAL SEGUN EL PESO/TAMAÑO

		return precioFinal;
	}
}
