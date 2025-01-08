package Herencia;

public class ClaseNieto extends ClaseHijo{
	protected boolean menor;

	protected ClaseNieto(String nombre, String dni, double edad, boolean menor) {
		super(nombre, dni, edad);
		this.menor = menor;
	}

	protected boolean isMenor() {
		return menor;
	}

	protected void setMenor(boolean menor) {
		this.menor = menor;
	}
	
}
