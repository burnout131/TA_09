package ejercicio1;

public class mainApp {

	public static void main(String[] args) {
		int tamano = 10;
		Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[tamano];

		arrayElectrodomesticos[0] = new Electrodomestico(150, "azul", 'E', 5);
		arrayElectrodomesticos[1] = new Electrodomestico(250, "blanco", 'F', 84);
		arrayElectrodomesticos[2] = new Electrodomestico(50, "rojo", 'A', 2);
		arrayElectrodomesticos[3] = new Electrodomestico(900, "gris", 'C', 55);
		arrayElectrodomesticos[4] = new Lavadora(200, "gris", 'B', 12, 10.0);
		arrayElectrodomesticos[5] = new Lavadora(350, "rojo", 'D', 25, 20.0);
		arrayElectrodomesticos[6] = new Lavadora(550, "negro", 'A', 50, 35.0);
		arrayElectrodomesticos[7] = new Television(1200, "negro", 'D', 20.0, 25, false);
		arrayElectrodomesticos[8] = new Television(800, "gris", 'E', 18, 45.0, true);
		arrayElectrodomesticos[9] = new Television(1500, "blanco", 'F', 25, 55.0, true);

//		arrayElectrodomesticos[0] = new Electrodomestico(1, "azul", 'F', 5);
//		arrayElectrodomesticos[1] = new Electrodomestico(1, "blanco", 'F', 5);
//		arrayElectrodomesticos[2] = new Electrodomestico(1, "rojo", 'F', 2);
//		arrayElectrodomesticos[3] = new Electrodomestico(1, "gris", 'F', 5);
//		arrayElectrodomesticos[4] = new Lavadora(1, "gris", 'F', 5, 10.0);
//		arrayElectrodomesticos[5] = new Lavadora(1, "rojo", 'F', 5, 20.0);
//		arrayElectrodomesticos[6] = new Lavadora(1, "negro", 'F', 5, 35.0);
//		arrayElectrodomesticos[7] = new Television(1, "negro", 'F', 5, 25.0, false);
//		arrayElectrodomesticos[8] = new Television(1, "gris", 'F', 5, 45.0, false);
//		arrayElectrodomesticos[9] = new Television(1, "blanco", 'F', 5, 55.0, false);

		calcularPrecios(arrayElectrodomesticos);
	}

	public static void calcularPrecios(Electrodomestico arrayElectrodomesticos[]) {
		double precioElectrodomesticos = 0.0;
		double precioLavadoras = 0.0;
		double precioTelevisiones = 0.0;

		for (int i = 0; i < arrayElectrodomesticos.length; i++) {

			if (!(arrayElectrodomesticos[i] instanceof Lavadora)
					&& !(arrayElectrodomesticos[i] instanceof Television)) {
				precioElectrodomesticos += arrayElectrodomesticos[i]
						.precioFinal(arrayElectrodomesticos[i].getPrecioBase());
			}
			if (arrayElectrodomesticos[i] instanceof Lavadora) {
				precioLavadoras += arrayElectrodomesticos[i]
						.precioFinal(((Lavadora) arrayElectrodomesticos[i]).getCarga());
			}

			else if (arrayElectrodomesticos[i] instanceof Television) {
				precioTelevisiones += arrayElectrodomesticos[i]
						.precioFinal(((Television) arrayElectrodomesticos[i]).getResolucion());
			}
		}
		double precioTotal = precioElectrodomesticos + precioLavadoras + precioTelevisiones;

		System.out.println("Precio electrodomesticos: " + precioTotal + "€\nPrecio lavadoras: " + precioLavadoras
				+ "€\nPrecio televisiones: " + precioTelevisiones + "€");
	}
}
