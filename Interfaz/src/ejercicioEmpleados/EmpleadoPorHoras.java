package ejercicioEmpleados;

public class EmpleadoPorHoras extends Empleado implements Beneficios{
	private int horasTrabajadas;
    private double tarifaPorHora;

    protected EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    protected double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String obtenerBeneficios() {
        return "Bonos por horas extras trabajadas";
    }
}
