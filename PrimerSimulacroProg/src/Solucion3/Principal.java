package Solucion3;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		ArrayList<Usuarios>listaUsuarios = new ArrayList<Usuarios>();
		ArrayList<Articulos>listaArticulos = new ArrayList<Articulos>();
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				darAltaAdministradores(sc, listaUsuarios);
				break;
			case 2:
				if (comprobarAdministrador(sc, listaUsuarios)) {
					darAltaClientes(sc, listaUsuarios);
				} else {
					System.out.println("No puedes hacer esta tarea por que no eres administrador");
				}
				break;
			case 3:
				if (comprobarAdministrador(sc, listaUsuarios)) {
					int option = 0;
					darAltaArticulos(sc, listaArticulos);
					do {
					System.out.println("¿Desea dar de alta otro articulo?:");
					System.out.println("1.- Si.");
					System.out.println("2.- No.");
					option = sc.nextInt();
					switch (option) {
					case 1:
						darAltaArticulos(sc, listaArticulos);
						break; 
					}
					} while (option != 2);
				} else {
					System.out.println("No puedes hacer esta tarea por que no eres administrador");
				}
				break;
			case 4:
				if (comprobarCliente(sc, listaUsuarios)) {
					int option = 0;
					prestamos(sc, listaUsuarios, listaArticulos);
					do {
						System.out.println("¿Desea optener otro prestamo?:");
						System.out.println("1.- Si.");
						System.out.println("2.- No.");
						option = sc.nextInt();
						switch (option) {
						case 1:
							prestamos(sc, listaUsuarios, listaArticulos);
							break; 
						}
						} while (option != 2);
				} else {
					System.out.println("No puedes hacer esta tarea por que no etas dado de alta como cliente.");
				}
				break;
			case 5:
				if (comprobarCliente(sc, listaUsuarios)) {
					int option = 0;
					devoluciones(sc, listaUsuarios, listaArticulos);
					do {
						System.out.println("¿Desea realizar otra devolucion?:");
						System.out.println("1.- Si.");
						System.out.println("2.- No.");
						option = sc.nextInt();
						switch (option) {
						case 1:
							devoluciones(sc, listaUsuarios, listaArticulos);
							break; 
						}
						} while (option != 2);
				} else {
					System.out.println("No puedes hacer esta tarea por que no etas dado de alta como cliente.");
				}
				break;
			case 6:
				comprobarLista1(sc, listaUsuarios, listaArticulos);
				break;
			}
		} while(opcion !=7);
	}
	
	public static void mostrarMenu(){
		System.out.println("Menú de opciones:");
		System.out.println("1.- Dar de alta administradores.");
		System.out.println("2.- Dar de alta usuarios. (administradores)");
		System.out.println("3.- Dar de alta artículos. (administradores)");
		System.out.println("4.- Hacer prestamos. (clientes)");
		System.out.println("5.- Hacer devoluciones. (clientes)");
		System.out.println("6.- Comprobar lista articulos.");
		System.out.println("7.- Salir.");
	}
	
	public static void darAltaAdministradores(Scanner sc, ArrayList<Usuarios>listaUsuarios) {
		System.out.println("Introduce el nombre del administrador:");
		String nombre = sc.next();
		System.out.println("Introduce el dni del administrador:");
		String dni = sc.next();
		System.out.println("Introduce el numero de empleado que tendra:");
		int numeroEmpleado = sc.nextInt();
		Usuarios a = new Administradores(nombre, dni, numeroEmpleado);
		listaUsuarios.add(a);
	}
	
	public static boolean comprobarAdministrador(Scanner sc, ArrayList<Usuarios>listaUsuarios) {
		System.out.println("Introduce el numero de empleado");
		int numeroEmpleado = sc.nextInt();
		boolean existe = false;
		for (Usuarios p:listaUsuarios) {
			if (p instanceof Administradores && ((Administradores) p).getNumeroEmpleado()==numeroEmpleado) {
				existe = true;
			}
		}
		return existe;
	}
	
	public static boolean comprobarCliente(Scanner sc, ArrayList<Usuarios>listaUsuarios) {
		System.out.println("Introduce el dni del cliente:");
		String dni = sc.next();
		boolean existe = false;
		for (Usuarios c: listaUsuarios) {
			if (c instanceof Clientes && c.getDni().equals(dni)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public static void darAltaClientes(Scanner sc, ArrayList<Usuarios>listaUsuarios) {
		System.out.println("Introduce el nombre del cliente:");
		String nombre = sc.next();
		System.out.println("Introduce el dni del cliente:");
		String dni = sc.next();
		Usuarios c = new Clientes(nombre, dni);
		listaUsuarios.add(c);
	}
	
	public static void darAltaArticulos(Scanner sc, ArrayList<Articulos>listaArticulos) {
		int opcion = 0;
		System.out.println("Introduce el tipo de articulo que quieres dar de alta:");
		System.out.println("1.- Libro.");
		System.out.println("2.- Revista.");
		System.out.println("3.- Pelicula.");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Introduce el numero de articulo del libro:");
			String numeroArticuloLibro = sc.next();
			System.out.println("Introduce el nombre del libro:");
			String nombreLibro = sc.next();
			sc.nextLine();
			System.out.println("Introduce el autor del libro:");
			String autorLibro = sc.next();
			sc.nextLine();
			System.out.println("Introduce la editorial del libro:");
			String editorialLibro = sc.next();
			Articulos a = new Libros (numeroArticuloLibro, nombreLibro, autorLibro, editorialLibro);
			listaArticulos.add(a);
			break;
		case 2:
			System.out.println("Introduce el numero de articulo de la revista:");
			String numeroArticuloRevista = sc.next();
			System.out.println("Introduce el nombre de la revista:");
			String nombreRevista = sc.next();
			sc.nextLine();
			System.out.println("Introduce el autor de la revista:");
			String autorRevista = sc.next();
			sc.nextLine();
			System.out.println("Introduce el nombre de la empresa que escribe la revista:");
			String empresaRevista = sc.next();
			Articulos a1 = new Revistas (numeroArticuloRevista, nombreRevista, autorRevista, empresaRevista);
			listaArticulos.add(a1);
			break;
		case 3:
			System.out.println("Introduce el numero de articulo de la pelicula:");
			String numeroArticuloPelicula = sc.next();
			System.out.println("Introduce el nombre de la pelicula:");
			String nombrePelicula = sc.next();
			sc.nextLine();
			System.out.println("Introduce el director de la pelicula:");
			String directorPelicula = sc.next();
			sc.nextLine();
			System.out.println("Introduce el genero de la pelicula:");
			String generoPelicula = sc.next();
			Articulos a2 = new Revistas (numeroArticuloPelicula, nombrePelicula, directorPelicula, generoPelicula);
			listaArticulos.add(a2);
			break;
		default:
			System.out.println("La opcion que marcaste es incorrecta.");
		}
	}
	
	public static void prestamos (Scanner sc, ArrayList<Usuarios>listaUsuarios, ArrayList<Articulos>listaArticulos) {
		System.out.println("Vuelve a introducir el dni del usuario:");
		String dni = sc.next();
		System.out.println("Introduce el numero de articulo que desea revervar:");
		String numeroArticulo = sc.next();
		for (Usuarios c: listaUsuarios) {
			if (c instanceof Clientes && c.getDni().equals(dni)) {
				Clientes c1 = (Clientes) c;
				for (Articulos a: listaArticulos) {
					if (a.getNumeroArticulo().equals(numeroArticulo)) {
						c1.listaPrestamos.add(a);
					}
				}
			}
		}
      }
	
	public static void devoluciones (Scanner sc, ArrayList<Usuarios>listaUsuarios, ArrayList<Articulos>listaArticulos) {
		System.out.println("Vuelve a introducir el dni del usuario:");
		String dni = sc.next();
		System.out.println("Introduce el numero de articulo que desea devolver:");
		String numeroArticulo = sc.next();
		for (Usuarios c: listaUsuarios) {
			if(c instanceof Clientes && c.getDni().equals(dni)) {
				Clientes c1 = (Clientes) c;
				Articulos a = c1.busquedaArticulo(numeroArticulo);
				listaArticulos.add(a);
			}
		}
	}
	
	public static void comprobarLista1 (Scanner sc, ArrayList<Usuarios>listaUsuarios, ArrayList<Articulos>listaArticulos) {
		System.out.println("Introduce el dni del usuario:");
		String dni = sc.next();
		System.out.println("Introduce el numero de articulo que desea comprobar:");
		String numeroArticulo = sc.next();
		for (Usuarios c: listaUsuarios) {
			if(c instanceof Clientes && c.getDni().equals(dni)) {
				Clientes c1 = (Clientes) c;
				c1.comprobarLista(numeroArticulo);
			}
      }
    }
   }