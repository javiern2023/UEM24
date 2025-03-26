package Leer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class lectura {
    public static void main(String[] args) {
    	 Path path = Paths.get("src", "Leer", "entrada.txt");

         if (Files.exists(path)) {
             System.out.println("Leyendo archivo: " + path.toString());
             try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
                 String linea;
                 while ((linea = reader.readLine()) != null) {
                     System.out.println(linea);
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
         } else {
             System.out.println("El archivo no existe: " + path.toString());
         }
    }
}


