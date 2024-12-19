package ConcesionarioCoches;

public class Vehiculo {
	//Atributos o propiedades
	protected String matricula, marca, modelo, color;
	protected double precio;
	
	//Constructores
	protected Vehiculo() {
		
	}

	protected Vehiculo(String matricula, String marca, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.precio = precio;
	}

	protected Vehiculo(String matricula, String marca, String modelo, String color, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	//Métodos
	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
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

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
