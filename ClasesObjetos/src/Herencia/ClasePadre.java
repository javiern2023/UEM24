package Herencia;

public class ClasePadre {
	protected String nombre, dni;

	protected ClasePadre(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
