package Solucion3;
public class Libros extends Articulos {

	protected String autor, editorial;

	public Libros() {
		super();
	}

	public Libros(String numeroArticulo, String nombre, String autor, String editorial) {
		super(numeroArticulo, nombre);
		this.autor = autor;
		this.editorial = editorial;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getEditorial() {
		return editorial;
	}

	protected void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
}
