

public class Persona {
	// Propiedades
	String nombre, dni, apellidos, direccion;
	double saldo;

	// Constructores
	
	protected Persona() {
		
	}
	
	protected Persona(String nombre, String dni, String apellidos, String direccion) {
		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	protected Persona(String nombre, String dni, String apellidos) {
		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = apellidos;
	}

	// Métodos
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

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
