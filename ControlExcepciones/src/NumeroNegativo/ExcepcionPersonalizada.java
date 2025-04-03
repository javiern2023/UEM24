package NumeroNegativo;

public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        try {
            verificarNumero(-5); // Pasamos un número negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }

    public static void verificarNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        System.out.println("Número válido: " + numero);
    }
}

