package ExcepcionesPropias;

public class Validador {
	
	protected Validador() {
		
	}
	// Valida número de teléfono (solo números y longitud exacta de 10 dígitos)
    protected void validarTelefono(String telefono) throws TelefonoInvalidoException {
        if (!telefono.matches("\\d{10}")) {
            throw new TelefonoInvalidoException("Número de teléfono inválido: " + telefono);
        }
    }

    // Valida correo electrónico con una expresión regular
    protected void validarCorreo(String correo) throws CorreoInvalidoException {
        if (!correo.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$")) {
            throw new CorreoInvalidoException("Correo electrónico inválido: " + correo);
        }
    }
}
