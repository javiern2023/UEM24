package Ejercicio1;

public class BarcoCarga extends Barco implements Capacidad {
    private int numBodegas;
    private int capacidadPorBodega;

    public BarcoCarga(int id, String nombre, double velocidadMaxima, int numBodegas, int capacidadPorBodega)
            throws BarcoInvalidoException {
        super(id, nombre, velocidadMaxima);
        if (numBodegas < 0 || capacidadPorBodega < 0) {
            throw new BarcoInvalidoException("Valores inválidos para BarcoCarga.");
        }
        this.numBodegas = numBodegas;
        this.capacidadPorBodega = capacidadPorBodega;
    }

    @Override
    public int calcularCapacidad() {
        return numBodegas * capacidadPorBodega;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Barco de Carga: " + nombre + ", ID: " + id + ", Velocidad Máxima: " + velocidadMaxima
                + " nudos, Capacidad de carga: " + calcularCapacidad() + " toneladas");
    }
}

