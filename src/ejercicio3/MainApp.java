package ejercicio3;

public class MainApp {

	public static void main(String[] args) {

		Libro libro1 = new Libro("9780544003415", "El Señor de los Anillos", "J.R.R. Tolkien", 1170);
		Libro libro2 = new Libro("8497945336", "Don Quijote de la Mancha", "Miguel de Cervantes", 704);

		System.out.println(libro1);
		System.out.println(libro2);

		libro1.librosMasPaginas(libro2);
	}
}