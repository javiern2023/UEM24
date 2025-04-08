package Clases;

public class usuario {
	protected String dni, pass;

	protected usuario(String dni, String pass) {
		this.dni = dni;
		this.pass = pass;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getPass() {
		return pass;
	}

	protected void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "usuario [dni=" + dni + ", pass=" + pass + "]";
	}
	
}
