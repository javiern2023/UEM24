package Solucion3;
public class Peliculas extends Articulos {
	
	protected String director, genero;

	public Peliculas() {
		super();
	}

	public Peliculas(String numeroArticulo, String nombre, String director, String genero) {
		super(numeroArticulo, nombre);
		this.director = director;
		this.genero = genero;
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

}
