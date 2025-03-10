package ExcepcionesPropias;

//Excepción personalizada para teléfono inválido
public class TelefonoInvalidoException extends Exception {
 
	public TelefonoInvalidoException(String mensaje) {
		super(mensaje);
	}
}
