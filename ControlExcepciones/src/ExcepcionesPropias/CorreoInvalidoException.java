package ExcepcionesPropias;

//Excepción personalizada para correo inválido
public class CorreoInvalidoException extends Exception {
	
	public CorreoInvalidoException(String mensaje) {
		super(mensaje);
	}
}
