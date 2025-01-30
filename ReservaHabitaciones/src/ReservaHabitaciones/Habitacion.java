package ReservaHabitaciones;

public class Habitacion {
	protected int numero;
	protected String tipo;
	protected double precio_noche;
	protected boolean estado;
	
	protected final boolean ESTADO=false;
	
	protected Habitacion() {
		
	}

	protected Habitacion(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		precio_noche=50;
		estado=ESTADO;
	}


	protected Habitacion(int numero, String tipo, double precio_noche, boolean estado) {
		this.numero = numero;
		this.tipo = tipo;
		this.precio_noche = precio_noche;
		this.estado = estado;
	}

	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected double getPrecio_noche() {
		return precio_noche;
	}

	protected void setPrecio_noche(double precio_noche) {
		this.precio_noche = precio_noche;
	}

	protected boolean isEstado() {
		return estado;
	}

	protected void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", tipo=" + tipo + ", precio_noche=" + precio_noche + ", estado="
				+ estado + "]";
	}
	
	
}
