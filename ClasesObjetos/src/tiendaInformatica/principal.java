package tiendaInformatica;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Variables
		int opcionPrincipal, opcionGenerico;
		Scanner sc = new Scanner(System.in);
		ArrayList <Cliente> arrayClientes = new ArrayList <Cliente> ();
		do {
			menuPrincipal();
			opcionPrincipal=sc.nextInt();
			switch(opcionPrincipal) {
				case 1: do {
							menuGenerico();
							opcionGenerico=sc.nextInt();
							menuClientes(opcionGenerico, arrayClientes, sc);
						}while(opcionGenerico!=4);
					break;
				case 2: menuGenerico();
						opcionGenerico=sc.nextInt();
					break;
				case 3: menuGenerico();
						opcionGenerico=sc.nextInt();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opción incorrecta");
				}
		} while(opcionPrincipal!=6);
		
		
	}
	
	public static void menuPrincipal() {
		System.out.println("MENÚ DE TRABAJO");
		System.out.println("1.- Clientes");
		System.out.println("2.- Productos");
		System.out.println("3.- Proveedores");
		System.out.println("4.- Suministros");
		System.out.println("5.- Ventas");
		System.out.println("6.- Salir");
	}
	
	public static void menuGenerico() {
		System.out.println("MENÚ");
		System.out.println("1.- Insertar");
		System.out.println("2.- Borrar");
		System.out.println("3.- Modificar");
		System.out.println("4.- Salir");
	}
	
	public static void menuClientes(int opcion, ArrayList<Cliente> arrayClientes, Scanner sc) {
		String id_cliente, nombre, apellidos, direccion, telefono;
		boolean encontrado = false;
		switch(opcion) {
			case 1: System.out.print("Dime el id: ");
					id_cliente=sc.next();
					for(Cliente c1: arrayClientes) {
						if(c1.getId_cliente().equals(id_cliente)) {
							encontrado=true;
							break;
						}
					}
					if(!encontrado) {
						System.out.print("Dime tú nombre: ");
						nombre=sc.next();
						System.out.print("Dime tus apellidos: ");
						apellidos=sc.next();
						System.out.print("Dime tú dirección: ");
						direccion=sc.next();
						System.out.print("Dime tú teléfono: ");
						telefono=sc.next();
						Cliente c = new Cliente(id_cliente,nombre,apellidos,direccion,telefono);
						arrayClientes.add(c);
						System.out.println("Cliente registrado");
					}
					else System.out.println("El cliente ya existe, no se puedo añadir");
				break;
			case 2: System.out.print("Dime el id: ");
					id_cliente=sc.next();
					encontrado=false;
					for(Cliente c1: arrayClientes) {
						if(c1.getId_cliente().equals(id_cliente)) {
							arrayClientes.remove(c1);
							System.out.println("Usuario eliminado");
							encontrado=true;
							break;
						}
					}
					if(!encontrado) System.out.println("El usuario no se pudo eliminar");
				break;
			case 3: 
				break;
			case 4: System.out.println("Volvemos al menú principal");
				break;
			default: System.out.println("Opción incorrecta");
		}
	}
	
}
