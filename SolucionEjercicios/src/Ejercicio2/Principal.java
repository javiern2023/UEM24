package Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        boolean codigoValido = false;

        while (!codigoValido) {
            System.out.print("Introduce el código postal: ");
            String codigoPostal = scanner.nextLine();

            try {
                CodigoPostal.validar(codigoPostal);
                System.out.println("Código postal válido: " + codigoPostal);
                System.out.println(" Hasta pronto");
                codigoValido = true; // Sale del bucle
            } catch (CodigoPostalInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Por favor, intenta nuevamente.\n");
            }
        }

    }
}

