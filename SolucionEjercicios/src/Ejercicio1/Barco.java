package Ejercicio1;

public abstract class Barco {
    protected int id;
    protected String nombre;
    protected double velocidadMaxima;

    public Barco(int id, String nombre, double velocidadMaxima) throws BarcoInvalidoException {
        if (id < 0 || nombre == null || nombre.isEmpty() || velocidadMaxima < 0) {
            throw new BarcoInvalidoException("Datos inválidos para crear un barco.");
        }
        this.id = id;
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void mostrarInformacion();
}

