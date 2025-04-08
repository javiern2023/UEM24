package EjercicioElectrodomesticos;

public class Lavadora extends Electrodomestico{
	protected int carga;
	protected final int CARGA=5;
	
	protected Lavadora() {
		super();
		this.carga=CARGA;
	}

	protected Lavadora(double precio_base, int peso) {
		super(precio_base, peso);
		this.carga=CARGA;
	}

	protected Lavadora(double precio_base, String color, char consumo, int peso, int carga) {
		super(precio_base, color, consumo, peso);
		this.carga = carga;
	}

	protected int getCarga() {
		return carga;
	}

	/*protected void setCarga(int carga) {
		this.carga = carga;
	}*/
	
	@Override
	protected void precioFinal() {
		super.precioFinal();
		if(carga>=30) {
			this.precio_base+=50;
		}
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
