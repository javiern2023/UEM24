package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero {
    private static final String RUTA_ARCHIVO = "src/Ejercicio3/palabras.txt";

    public static void guardarPalabra(String palabra) {
        File archivo = new File(RUTA_ARCHIVO);
        try {
            // Crea el archivo si no existe
            archivo.getParentFile().mkdirs(); // Asegura que el directorio exista
            archivo.createNewFile();

            // Escribe en el archivo en modo append (añadir)
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
            writer.write(palabra);
            writer.newLine();
            writer.close();
            System.out.println("Palabra guardada correctamente.");

        } catch (IOException e) {
            System.err.println("Error al guardar la palabra: " + e.getMessage());
        }
    }
    
    public static void mostrarPalabras() {
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No hay palabras guardadas todavía.");
            return;
        }

        ArrayList<String> palabras = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    palabras.add(linea.trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        if (palabras.isEmpty()) {
            System.out.println("El archivo está vacío.");
            return;
        }

        //Selecciona el primer elemento de la lista.
        String masCorta = palabras.get(0);
        String masLarga = palabras.get(0);

        for (String palabra : palabras) {
            if (palabra.length() < masCorta.length()) {
                masCorta = palabra;
            }
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
        }

        System.out.println("Palabra más corta: " + masCorta);
        System.out.println("Palabra más larga: " + masLarga);
    }
}

