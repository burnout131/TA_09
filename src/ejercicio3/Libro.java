package ejercicio3;

public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public Libro() {
		this.ISBN = "";
		this.titulo = "";
		this.autor = "";
		this.numeroPaginas = 0;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Libro con ISBN=" + ISBN + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + ", toString()="
				+ super.toString() + "]";
	}
	
	public void librosMasPaginas(Libro a, Libro b) {
		if(a.numeroPaginas>b.numeroPaginas) {
			System.out.println("El libro "+ a.toString()+" tiene más paginas que el libro "+b.toString()+".");
		}else if(a.numeroPaginas<b.numeroPaginas) {
			System.out.println("El libro "+ b.toString()+" tiene más paginas que el libro "+a.toString()+".");
		}else {
			System.out.println("El libro "+ a.toString()+" tiene la misma cantidad de páginas que el libro "+b.toString()+".");
		}
		
	}
	
	
}
