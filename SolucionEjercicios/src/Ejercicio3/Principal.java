package Ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Mostrar palabras (más corta y más larga)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Debe ingresar un número válido.");
                scanner.next(); // limpiar entrada inválida
                System.out.print("Seleccione una opción: ");
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una palabra: ");
                    String palabra = scanner.nextLine();
                    Fichero.guardarPalabra(palabra);
                    break;
                case 2:
                    Fichero.mostrarPalabras();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
