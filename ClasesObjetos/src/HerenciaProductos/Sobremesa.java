package HerenciaProductos;

public class Sobremesa extends Producto{
	protected int tamanio;

	protected Sobremesa(String marca, String modelo, String memoria, int tamanio) {
		super(marca, modelo, memoria);
		this.tamanio = tamanio;
	}

	protected int getTamanio() {
		return tamanio;
	}

	protected void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
}
