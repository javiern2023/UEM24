package HerenciaProductos;

public class Portatil extends Producto{
	protected String bateria;

	protected Portatil(String marca, String modelo, String memoria, String bateria) {
		super(marca, modelo, memoria);
		this.bateria = bateria;
	}

	protected String getBateria() {
		return bateria;
	}

	protected void setBateria(String bateria) {
		this.bateria = bateria;
	}
	
	
}
