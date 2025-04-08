package Solucion3;
public abstract class Articulos {
	
	protected String numeroArticulo, nombre;

	public Articulos() {
		
	}

	public Articulos(String numeroArticulo, String nombre) {
		this.numeroArticulo = numeroArticulo;
		this.nombre = nombre;
	}

	protected String getNumeroArticulo() {
		return numeroArticulo;
	}

	protected void setNumeroArticulo(String numeroArticulo) {
		this.numeroArticulo = numeroArticulo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
