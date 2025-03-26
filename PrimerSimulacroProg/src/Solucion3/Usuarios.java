package Solucion3;
public abstract class Usuarios {
	
	protected String nombre, dni;

	public Usuarios() {
		
	}

	public Usuarios(String nombre, String dni) {
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
