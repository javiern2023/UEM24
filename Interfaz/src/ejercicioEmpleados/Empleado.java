package ejercicioEmpleados;

public abstract class Empleado {
	protected String nombre;
    protected double salarioBase;

    protected Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
    
    protected abstract double calcularSalario();
}
