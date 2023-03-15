package ejercicio1;

import java.util.Iterator;

public class mainApp {

	public static void main(String[] args) {
		int tamaño = 10;
		Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[tamaño];

		arrayElectrodomesticos[0] = new Electrodomestico(150, "azul", 'E', 5);
		arrayElectrodomesticos[1] = new Electrodomestico(250, "blanco", 'F', 84);
		arrayElectrodomesticos[2] = new Electrodomestico(50, "rojo", 'A', 2);
		arrayElectrodomesticos[3] = new Electrodomestico(900, "gris", 'C', 55);
		arrayElectrodomesticos[4] = new Lavadora(200, "gris", 'B', 12, 10);
		arrayElectrodomesticos[5] = new Lavadora(350, "rojo", 'D', 25, 20);
		arrayElectrodomesticos[6] = new Lavadora(550, "negro", 'A', 50, 35);
//		arrayElectrodomesticos[7] = new Television(1200, "negro", 'D', 20, 25, false);
//		arrayElectrodomesticos[8] = new Television(800, "gris", 'E', 18, 45, true);
//		arrayElectrodomesticos[9] = new Television(1500, "blanco", 'F', 25, 55, true);

		calcularPrecios(arrayElectrodomesticos);
	}

	public static void calcularPrecios(Electrodomestico arrayElectrodomesticos[]) {
		double precioElectrodomesticos = 0.0;
		double precioLavadoras = 0.0;
		double precioTelevisiones = 0.0;

		for (int i = 0; i < arrayElectrodomesticos.length; i++) {
			precioElectrodomesticos += arrayElectrodomesticos[i].precioFinal(arrayElectrodomesticos[i].getPrecioBase());

			if (arrayElectrodomesticos[i] instanceof Lavadora) {
				precioLavadoras += arrayElectrodomesticos[i].precioFinal(arrayElectrodomesticos[i].getPrecioBase());
			}
//			
//			elseif(arrayElectrodomesticos[i] instanceof Television) {
//				precioTelevisiones += arrayElectrodomesticos[i].precioFinal(arrayElectrodomesticos[i].getPrecioBase());
//			}
		}

		System.out.println("Precio electrodomesticos: " + precioElectrodomesticos + "\nPrecio lavadoras: "
				+ precioLavadoras + "\nPrecio televisiones: " + precioTelevisiones);
	}

}
