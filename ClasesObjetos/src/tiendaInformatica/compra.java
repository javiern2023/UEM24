package tiendaInformatica;

import java.util.ArrayList;

public class compra {
	protected Cliente c;
	protected ArrayList <producto> arrayListProductos;
	protected String fecha;
	protected double precioFinal, descuento;
	
	protected compra() {
		
	}

	protected Cliente getC() {
		return c;
	}

	protected void setC(Cliente c) {
		this.c = c;
	}

	protected ArrayList<producto> getArrayListProductos() {
		return arrayListProductos;
	}

	protected void setArrayListProductos(ArrayList<producto> arrayListProductos) {
		this.arrayListProductos = arrayListProductos;
	}

	protected String getFecha() {
		return fecha;
	}

	protected void setFecha(String fecha) {
		this.fecha = fecha;
	}

	protected double getPrecioFinal() {
		return precioFinal;
	}

	protected void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	protected double getDescuento() {
		return descuento;
	}

	protected void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	protected void añadirProducto() {
		
	}
	
	protected void calcularPrecioFinal() {
		
	}
	
	protected void calcularDescuento() {
		
	}
}
