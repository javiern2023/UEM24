package ClasesObjetos;

public class Persona {
	protected String dni, nombre;

	protected Persona() {
		
	}

	protected Persona(String dni) {
		this.dni = dni;
	}

	protected Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
