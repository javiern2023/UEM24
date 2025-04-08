package Contar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class ContarPalabras {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(Paths.get("src/Leer/entrada.txt").toFile()))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                contador += palabras.length;
            }
            System.out.println("Número total de palabras: " + contador);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

