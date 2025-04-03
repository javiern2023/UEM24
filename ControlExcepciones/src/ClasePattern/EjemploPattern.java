package ClasePattern;

import java.util.regex.Pattern;
/*La clase Pattern en Java pertenece al paquete java.util.regex y se usa para 
 * trabajar con expresiones regulares de manera eficiente. Se encarga de 
 * compilar patrones de búsqueda que luego pueden ser utilizados para 
 * realizar coincidencias en cadenas de texto.*/
public class EjemploPattern {
    public static void main(String[] args) {
        String regex = "\\d{3}-\\d{2}-\\d{4}"; // Formato: 123-45-6789
        String texto = "123-45-6789";

        boolean esValido = Pattern.matches(regex, texto);
        System.out.println("¿Coincide? " + esValido);
    }
}

