package CuentaBancaria;

public class Cuenta {
	//Atributos
	protected String titular;
	protected double cantidad;
	
	protected Cuenta(String titular) {
		this.titular = titular;
		cantidad=100;
	}

	protected Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	protected String getTitular() {
		return titular;
	}

	protected void setTitular(String titular) {
		this.titular = titular;
	}

	protected double getCantidad() {
		return cantidad;
	}

	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	protected void ingresar(double can) {
		cantidad+=can;
	}
	
	protected void retirar(double cantidad) {
		if(cantidad>0) {
			this.cantidad-=cantidad;
			if(this.cantidad<0) this.cantidad=0;
		}
	}
	
	
}
