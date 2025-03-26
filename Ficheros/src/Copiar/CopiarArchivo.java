package Copiar;

import java.io.*;
import java.nio.file.Paths;

public class CopiarArchivo {
    public static void main(String[] args) {
        String nombre;
        int nota;
    	try (
            BufferedReader reader = new BufferedReader(new FileReader(Paths.get("src/ejercicio4/entrada.txt").toFile()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.get("src/ejercicio4/copia.txt").toFile()))
        ) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Archivo copiado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

