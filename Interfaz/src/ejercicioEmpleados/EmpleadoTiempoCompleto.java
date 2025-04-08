package ejercicioEmpleados;

public class EmpleadoTiempoCompleto extends Empleado implements Beneficios{
	protected EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    protected double calcularSalario() {
        return salarioBase + (salarioBase * 0.10); // Bono del 10%
    }

    @Override
    public String obtenerBeneficios() {
        return "Seguro médico y vacaciones pagadas";
    }
}
