package LeerEscribir;

import java.io.*;
import java.nio.file.Paths;

public class Mayusculas {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader(Paths.get("src/ejercicio5/entrada.txt").toFile()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.get("src/ejercicio5/mayusculas.txt").toFile()))
        ) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea.toUpperCase());
                writer.newLine();
            }
            System.out.println("Archivo generado en mayúsculas correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

