package Escribir;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscrituraArchivo {
    public static void main(String[] args) {
       
    	Path path = Paths.get("src", "Escribir", "salida.txt");
    	    	
    	try {
            
    		// Verificamos si el archivo existe, si no, lo creamos
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Archivo creado: " + path.toString());
            } else {
                System.out.println("El archivo ya existe: " + path.toString());
            }
    		
    		FileWriter writer = new FileWriter(Paths.get("src/Escribir/salida.txt").toFile());
            /* Paths.get() es un método estático de la clase Paths 
             * (que forma parte del paquete java.nio.file) y sirve para 
             * crear una instancia de la clase Path, que representa la 
             * ruta de un archivo o directorio en el sistema de archivos.
				Es decir, en vez de pasar directamente una String al 
				FileReader, FileWriter, etc., puedes usar Paths.get() 
				para construir una ruta de forma más robusta y portable.
             * */
            
            writer.write("Primera línea de texto.\n");
            writer.write("Segunda línea de texto.\n");
            writer.write("Tercera línea de texto.\n");
            writer.close();
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    
