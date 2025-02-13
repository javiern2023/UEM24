package ReservaHabitaciones;

public class Reserva {
	protected int numero_reserva;
	protected String nombre_cliente;
	protected int numero_habitacion;
	protected int dias;
	protected double precio_total;
	
	protected Reserva() {
		
	}
	
	protected Reserva(int numero_reserva, String nombre_cliente, int numero_habitacion, int dias, double precio_total) {
		this.numero_reserva = numero_reserva;
		this.nombre_cliente = nombre_cliente;
		this.numero_habitacion = numero_habitacion;
		this.dias = dias;
		this.precio_total = precio_total;
	}
	protected int getNumero_reserva() {
		return numero_reserva;
	}
	protected void setNumero_reserva(int numero_reserva) {
		this.numero_reserva = numero_reserva;
	}
	protected String getNombre_cliente() {
		return nombre_cliente;
	}
	protected void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	protected int getNumero_habitacion() {
		return numero_habitacion;
	}
	protected void setNumero_habitacion(int numero_habitacion) {
		this.numero_habitacion = numero_habitacion;
	}
	protected int getDias() {
		return dias;
	}
	protected void setDias(int dias) {
		this.dias = dias;
	}
	protected double getPrecio_total() {
		return precio_total;
	}
	protected void setPrecio_total(double precio_total) {
		this.precio_total = precio_total;
	}
	@Override
	public String toString() {
		return "Reserva [numero_reserva=" + numero_reserva + ", nombre_cliente=" + nombre_cliente
				+ ", numero_habitacion=" + numero_habitacion + ", dias=" + dias + ", precio_total=" + precio_total
				+ "]";
	}
	
	
}
