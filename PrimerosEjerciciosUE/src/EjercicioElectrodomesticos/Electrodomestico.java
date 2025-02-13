package EjercicioElectrodomesticos;

public abstract class Electrodomestico {
	protected double precio_base;
	protected String color;
	protected char consumo;
	protected int peso;
	protected final double PRECIO=100;
	protected final String COLOR="blanco";
	protected final char CONSUMO='F';
	protected final int PESO=5;
	
	protected Electrodomestico() {
		this.precio_base=PRECIO;
		this.color=COLOR;
		this.consumo=CONSUMO;
		this.peso=PESO;
		precioFinal();
	}

	protected Electrodomestico(double precio_base, int peso) {
		this.precio_base = precio_base;
		this.peso = peso;
		this.color=COLOR;
		this.consumo=CONSUMO;
		precioFinal();
	}

	protected Electrodomestico(double precio_base, String color, char consumo, int peso) {
		this.precio_base = precio_base;
		//this.color = color;
		comprobarColor(color);
		//this.consumo = consumo;
		comprobarConsumoEnergetico(consumo);
		this.peso = peso;
		precioFinal();
	}

	protected double getPrecio_base() {
		return precio_base;
	}

	/*protected void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}*/

	protected String getColor() {
		return color;
	}

	/*protected void setColor(String color) {
		this.color = color;
	}*/

	protected char getConsumo() {
		return consumo;
	}

	/*protected void setConsumo(char consumo) {
		this.consumo = consumo;
	}*/

	protected int getPeso() {
		return peso;
	}

	/*protected void setPeso(int peso) {
		this.peso = peso;
	}*/
	
	private void comprobarConsumoEnergetico(char letra) {
		switch(letra) {
			case 'A': this.consumo='A';
					break;
			case 'B': this.consumo='B';
					break;
			case 'C': this.consumo='C';
					break;
			case 'D': this.consumo='D';
					break;
			case 'E': this.consumo='E';
					break;
			case 'F': this.consumo='F';
					break;
			default: this.consumo='F';
		
		}
	}
	
	private void comprobarColor(String color) {
		switch(color) {
			case "blanco": this.color="blanco";
					break;
			case "negro": this.color="negro";
					break;
			case "rojo": this.color="rojo";
					break;
			case "azul": this.color="azul";
					break;
			case "gris": this.color="gris";
					break;
			default: this.color="blanco";
		}
	}
	
	protected void precioFinal() {
		switch(this.consumo) {
			case 'A': this.precio_base+=100;
					break;
			case 'B': this.precio_base+=80;
					break;
			case 'C': this.precio_base+=60;
					break;
			case 'D': this.precio_base+=50;
					break;
			case 'E': this.precio_base+=30;
					break;
			case 'F': this.precio_base+=10;
					break;
			default: this.precio_base+=10;
		}
		if(this.peso>=0 && this.peso<=19) {
			this.precio_base+=10;
		}
		else if(this.peso>=20 && this.peso<=49) {
			this.precio_base+=50;
		}
		else if(this.peso>=50 && this.peso<=79) {
			this.precio_base+=80;
		}
		else if(this.peso>=80) {
			this.precio_base+=100;
		}
		else if(this.peso<0){
			
		}
		else {
			this.precio_base+=10;
		}
	}
}
