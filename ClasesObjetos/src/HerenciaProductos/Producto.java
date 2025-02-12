package HerenciaProductos;

public class Producto {
	protected String marca, modelo, memoria;

	protected Producto(String marca, String modelo, String memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getMemoria() {
		return memoria;
	}

	protected void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	
}
