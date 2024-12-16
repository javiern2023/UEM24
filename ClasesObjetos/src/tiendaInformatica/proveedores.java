package tiendaInformatica;

public class proveedores {
	//Atributos o propiedades
	protected String id_proveedor, nombre, apellidos, provincia, direccion, telefono;

	//Constructores
	protected proveedores() {
		
	}

	protected proveedores(String id_proveedor, String nombre, String apellidos) {
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	protected proveedores(String id_proveedor, String nombre, String apellidos, String provincia, String direccion,
			String telefono) {
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.provincia = provincia;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//Métodos get y set
	protected String getId_proveedor() {
		return id_proveedor;
	}

	protected void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected String getProvincia() {
		return provincia;
	}

	protected void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getTelefono() {
		return telefono;
	}

	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
