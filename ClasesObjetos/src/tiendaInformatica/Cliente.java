package tiendaInformatica;

public class Cliente {
	//Atributos o propiedades
	protected String id_cliente, nombre, apellidos, direccion, telefono;
	
	//Constructores
	protected Cliente() {
		
	}

	protected Cliente(String id_cliente, String nombre, String apellidos) {
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	protected Cliente(String id_cliente, String nombre, String apellidos, String direccion, String telefono) {
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//Métodos get y set
	protected String getId_cliente() {
		return id_cliente;
	}

	protected void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
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
