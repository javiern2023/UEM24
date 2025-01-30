package ClasesObjetos;

public class Alumno {
	protected String dni, nombre, expediente;
	protected int movil;
	protected boolean matriculado;
	
	protected Alumno() {
		
	}

	protected Alumno(String dni, String nombre, String expediente) {
		this.dni = dni;
		this.nombre = nombre;
		this.expediente = expediente;
	}

	protected Alumno(String dni, String nombre, String expediente, int movil, boolean matriculado) {
		this.dni = dni;
		this.nombre = nombre;
		this.expediente = expediente;
		this.movil = movil;
		this.matriculado = matriculado;
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

	protected String getExpediente() {
		return expediente;
	}

	protected void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	protected int getMovil() {
		return movil;
	}

	protected void setMovil(int movil) {
		this.movil = movil;
	}

	protected boolean isMatriculado() {
		return matriculado;
	}

	protected void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	
	
	
	
}
