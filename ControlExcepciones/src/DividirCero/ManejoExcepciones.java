package DividirCero;

public class ManejoExcepciones {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 1); // Intento de dividir por 0
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } 
        
    }

    public static int dividir(int a, int b) {
        return a / b; // Puede lanzar ArithmeticException
    }
}

