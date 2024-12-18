package tiendaInformatica;

public class suministra {
	protected String id_producto, id_proveedor;
	protected int cantidad;
	protected double precio_compra;
	
	
	
	protected suministra() {
	
	}

	protected suministra(String id_producto, String id_proveedor, int cantidad, double precio_compra) {
		
		this.id_producto = id_producto;
		this.id_proveedor = id_proveedor;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
	}

	protected String getId_producto() {
		return id_producto;
	}

	protected void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	protected String getId_proveedor() {
		return id_proveedor;
	}

	protected void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	protected int getCantidad() {
		return cantidad;
	}

	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	protected double getPrecio_compra() {
		return precio_compra;
	}

	protected void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	
	
	
}
