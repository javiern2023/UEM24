package Ejercicio1;

public class BarcoPasajeros extends Barco implements Capacidad {
    private int numCamarotes;
    private int pasajerosPorCamarote;

    public BarcoPasajeros(int id, String nombre, double velocidadMaxima, int numCamarotes, int pasajerosPorCamarote)
            throws BarcoInvalidoException {
        super(id, nombre, velocidadMaxima);
        if (numCamarotes < 0 || pasajerosPorCamarote < 0) {
            throw new BarcoInvalidoException("Valores inválidos para BarcoPasajeros.");
        }
        this.numCamarotes = numCamarotes;
        this.pasajerosPorCamarote = pasajerosPorCamarote;
    }

    @Override
    public int calcularCapacidad() {
        return numCamarotes * pasajerosPorCamarote;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Barco de Pasajeros: " + nombre + ", ID: " + id + ", Velocidad Máxima: " + velocidadMaxima
                + " nudos, Capacidad de pasajeros: " + calcularCapacidad());
    }
}

