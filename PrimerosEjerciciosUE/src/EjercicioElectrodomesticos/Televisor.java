package EjercicioElectrodomesticos;

public class Televisor extends Electrodomestico{
	protected int resolucion;
	protected boolean tdt;
	
	protected Televisor() {
		super();
		resolucion=20;
		tdt=false;
	}

	protected Televisor(double precio_base, int peso) {
		super(precio_base, peso);
		this.resolucion = 20;
		this.tdt = false;
	}

	protected Televisor(double precio_base, String color, char consumo, int peso, int resolucion, boolean tdt) {
		super(precio_base, color, consumo, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	protected int getResolucion() {
		return resolucion;
	}

	/*protected void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}*/

	protected boolean isTdt() {
		return tdt;
	}

	/*protected void setTdt(boolean tdt) {
		this.tdt = tdt;
	}*/
	
	@Override
	protected void precioFinal() {
		super.precioFinal();
		if(resolucion>40) {
			this.precio_base+=(precio_base*0.3);
		}
		if(tdt) {
			this.precio_base+=50;
		}
	}
}
