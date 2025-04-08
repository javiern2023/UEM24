package Solucion3;
public class Revistas extends Articulos {

	protected String autor, empresa;

	public Revistas() {
		super();
	}

	public Revistas(String numeroArticulo, String nombre, String autor, String empresa) {
		super(numeroArticulo, nombre);
		this.autor = autor;
		this.empresa = empresa;
	}

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}

	protected String getEmpresa() {
		return empresa;
	}

	protected void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
