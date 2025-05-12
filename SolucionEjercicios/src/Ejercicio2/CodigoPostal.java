package Ejercicio2;

public class CodigoPostal {
	public static void validar(String codigoPostal) throws CodigoPostalInvalidoException {
                
		// Verifica si tiene exactamente 5 dígitos numéricos
        if (codigoPostal == null || !codigoPostal.matches("\\d{5}")) {
            throw new CodigoPostalInvalidoException("Código postal inválido. Debe tener exactamente 5 dígitos numéricos.");
        }

        // Convierte a número y verifica el rango permitido
        int cp = Integer.parseInt(codigoPostal);
        if (cp < 13000 || cp > 13999) {
            throw new CodigoPostalInvalidoException("Código postal fuera del rango permitido (13000 a 13999).");
        }
    }
	
	
}
