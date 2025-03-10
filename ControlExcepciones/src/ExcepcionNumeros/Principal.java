package ExcepcionNumeros;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            String entrada = sc.next(); // Captura la entrada como texto

            try {
                // Intentamos convertir la entrada a un número entero
                numero = Integer.parseInt(entrada);
                System.out.println("Número válido: " + numero);
                break; // Salimos del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                System.err.println("Error: Entrada inválida. Debe ingresar solo números sin espacios ni letras.");
            }
        }

        System.out.println("\n Programa finalizado correctamente.");

	}

}
