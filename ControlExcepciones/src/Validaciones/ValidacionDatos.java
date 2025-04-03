package Validaciones;

import java.util.regex.Pattern;

public class ValidacionDatos {
    public static void main(String[] args) {
        try {
            validarMovil("654123456");   // Móvil válido
            validarDNI("12345678Z");     // DNI válido
            validarCorreo("correo@ejemplo.com"); // Correo válido

            System.out.println("Todos los datos son válidos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Validar número de móvil español (9 dígitos, empieza con 6 o 7)
    public static void validarMovil(String movil) {
        if (!Pattern.matches("^[67]\\d{8}$", movil)) {
            throw new IllegalArgumentException("Número de móvil inválido.");
        }
    }

    // Validar DNI español (8 números + 1 letra)
    public static void validarDNI(String dni) {
        if (!Pattern.matches("^[0-9]{8}[A-Z]$", dni)) {
            throw new IllegalArgumentException("DNI inválido.");
        }
    }

    // Validar correo electrónico con formato correcto
    public static void validarCorreo(String correo) {
        if (!Pattern.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$", correo)) {
            throw new IllegalArgumentException("Correo electrónico inválido.");
        }
    }
}

