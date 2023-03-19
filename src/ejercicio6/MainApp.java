package ejercicio6;

public class MainApp {
	public static void main(String[] args) {
	
	Peliculas pelicula1 = new Peliculas("The Shawshank Redemption", 142, 12, "Frank Darabont");
	Peliculas pelicula2 = new Peliculas("The Godfather", 177, 16, "Ford Coppola");
	Peliculas pelicula3 = new Peliculas("The Dark Knight", 152, 12, "Christoper Nolan");
	
	
	Cine sala1 =new Cine(pelicula1,8);
	Cine sala3D = new Cine(pelicula2, 15);
	Cine sala3 = new Cine (pelicula3, 8);
	
	Espectador espectAleatorio = new Espectador();
	
	Espectador[] espectadores= new Espectador[80];
	for (int i=0;i<espectadores.length;i++) {
		espectadores [i]= espectAleatorio;
	}
	
	System.out.println("Abierta sala para película "+sala1.getPelicula() + "con los siguientes espectadores:\n" );
	
	for (int i=0;i<espectadores.length;i++) {
		
		if(sala1.AssignarAsiento(espectadores[i])) {
			espectadores [i]= espectAleatorio;
		}
			
		}
	
	
	
//	sala3D.AssignarAsiento(espectAleatorio);
//	sala3.AssignarAsiento(espectAleatorio);
	
	
	}

}
