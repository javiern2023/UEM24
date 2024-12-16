package tiendaInformatica;

public class producto {
	//Atributos o propiedades
	protected String id_producto, descripcion, stock;
	protected double precio;
	
	//Constructores
	protected producto() {
		
	}

	protected producto(String id_producto, String stock, double precio) {
		this.id_producto = id_producto;
		this.stock = stock;
		this.precio = precio;
	}

	protected producto(String id_producto, String descripcion, String stock, double precio) {
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}

	//Métodos get y set
	protected String getId_producto() {
		return id_producto;
	}

	protected void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected String getStock() {
		return stock;
	}

	protected void setStock(String stock) {
		this.stock = stock;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
