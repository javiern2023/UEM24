package ExcepcionesVariosCatch;

public class ManejoExpciones {

	public static void main(String[] args) {
		try {
            int[] numeros = {1, 2, 3};
            int resultado = 10 / 1; // Esto lanza ArithmeticException
            
            System.out.println(numeros[2]); // Esto lanzaría ArrayIndexOutOfBoundsException si se ejecutara

        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero -> " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites -> " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error general -> " + e.getMessage());
        
        } finally {
            System.out.println("Bloque finally ejecutado.");
        }

	}

}
