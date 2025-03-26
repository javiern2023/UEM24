package Solucion3;
public class Administradores extends Usuarios{
	
	protected int numeroEmpleado;

	public Administradores() {
		super();
	}

	public Administradores(String nombre, String dni, int numeroEmpleado) {
		super(nombre, dni);
		this.numeroEmpleado = numeroEmpleado;
	}
	
	protected int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	protected void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

}
