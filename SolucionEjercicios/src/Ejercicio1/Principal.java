package Ejercicio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Barco> listaBarcos = new ArrayList<>();

        try {
            BarcoPasajeros bp1 = new BarcoPasajeros(1, "Ferry Ibiza", 40, 60, 5);
            BarcoCarga bc1 = new BarcoCarga(2, "Carguero MSC", 30, 20, 400);

            listaBarcos.add(bp1);
            listaBarcos.add(bc1);

            System.out.println("=== INFORMACIÓN DE LOS BARCOS ===");
            for (Barco b : listaBarcos) {
                b.mostrarInformacion();
            }

        } catch (BarcoInvalidoException e) {
            System.err.println("Error al crear un barco: " + e.getMessage());
        }
    }
}

