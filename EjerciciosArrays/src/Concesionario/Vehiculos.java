package Concesionario;

public class Vehiculos {
	//Atributos o propiedades
	protected String bastidor, marca, modelo;
	protected double precio;
	
	//Constructores
	protected Vehiculos() {
		
	}

	protected Vehiculos(String bastidor, String marca, String modelo, double precio) {
		this.bastidor = bastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	protected String getBastidor() {
		return bastidor;
	}

	protected void setBastidor(String bastidor) {
		this.bastidor = bastidor;
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

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
