package Herencia;

public class ClaseHijo extends ClasePadre{
	
	protected double edad;

	protected ClaseHijo(String nombre, String dni, double edad) {
		super(nombre, dni); //Utiliza el constructor del padre
		this.edad = edad;
	}

	protected double getEdad() {
		return edad;
	}

	protected void setEdad(double edad) {
		this.edad = edad;
	}
	
	
	
}
