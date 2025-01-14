package bibliotecaUEM;

import java.util.Scanner;

public class EjerBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				Scanner sc = new Scanner(System.in);
				
				int opcion;
				final int filas = 20;
				final int columnas = 5;
				String libros [][] = new String [filas][columnas];
				String revistas [][] = new String [filas][columnas];
				String peliculas [][] = new String [filas][columnas];
				
				System.out.println("Bienvenido a la biblioteca de la UEM!");
				do {
					Menu();
					opcion = sc.nextInt();
					menuOpcion(sc, libros, revistas, peliculas, opcion);
					
				}while(opcion != 0);

	}

	public static void Menu() {
		System.out.println("1.- Insertar artículo.");
		System.out.println("2.- Eliminar artículo.");
		System.out.println("3.- Modificar artículo.");
		System.out.println("4.- Alquilar artículo.");
		System.out.println("5.- Devolución de artículo.");
		System.out.println("0.- Salir.");
	}
	
	public static void mostrarMenuArticulos() {
		System.out.println("Teclee una opción:");
		System.out.println("1.- Libro.");
		System.out.println("2.- Revista.");
		System.out.println("3.- Película.");
		System.out.println("0.- Salir.");
	}
	
	public static void menuOpcion(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int op) {
		switch (op) {
		case 1: insertarArticulo(sc, libros, revistas, peliculas,op); 
			break;
		case 2: EliminarArticulo(sc, libros, revistas, peliculas, op); 
			break;
		case 3: ModificarArticulo(sc, libros, revistas, peliculas, op); 
			break;
		case 4: AlquilarArticulo(sc, libros, revistas, peliculas, op); 
			break; 
		case 5: DevolverArticulo(sc, libros, revistas, peliculas, op); 
			break;
		case 0: System.out.println("Hasta pronto.");
			break;
		default: System.out.println("ERROR. Teclee una opción correcta.");
		}
	}
	
	public static void insertarArticulo(Scanner sc, String [][] libros,String[][] revistas, String[][] peliculas, int op) {
		mostrarMenuArticulos();
		int opInsArt = sc.nextInt();
		menuInsertarArticulo(sc, libros, revistas, peliculas, opInsArt);
	}
	
	public static void menuInsertarArticulo(Scanner sc, String [][] libros, String[][] revistas, String[][] peliculas, int opInsArt) {
		switch (opInsArt) {
		case 1: InsertarLibro(sc, libros);
			break;
		case 2: //InsertarRevista(sc, revistas);
			break;
		case 3: //InsertarPelicula(sc, peliculas);
			break;
		case 0: System.out.println("Volviendo al menú...");
			break;
		default: System.out.println("ERROR. Teclee una opción correcta.");
	}
  }
	
public static void InsertarLibro(Scanner sc, String [][] libros) {
		
		boolean insertado = false;
		
		System.out.print("Escribe el ISBN: ");
		String isbn = sc.next();
		
		
		for (int i = 0; i < libros.length; i++) {
			if (libros[i][0] == null && !isbn.equals(libros[i][0])) {
				libros[i][0] = isbn;
				System.out.print("Escribe el título: ");
				libros[i][1] = sc.next();
				System.out.print("Escribe el autor: ");
				libros[i][2] = sc.next();
				System.out.print("Escribe la editorial: ");
				libros[i][3] = sc.next();
				System.out.println("Libro añadido con éxito.");
				insertado = true;
				break;
			}
		}
		
		if (!insertado) System.out.println("No se ha podido añadir el Libro");
	}

public static void EliminarArticulo(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int op) {
	mostrarMenuArticulos();
	int opElimArt = sc.nextInt();
	menuEliminarArticulo(sc, libros, revistas, peliculas, opElimArt);
}

public static void menuEliminarArticulo(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int opElimArt) {
	switch (opElimArt) {
	case 1: EliminarLibro(sc, libros);
		break;
	case 2: //elimRevista(sc, revistas);
		break;
	case 3: //elimPeli(sc, peliculas);
		break;
	case 0: System.out.println("Volviendo al menú...");
		break;
	default: System.out.println("ERROR. Teclee una opción correcta.");
	}
}

public static void EliminarLibro(Scanner sc, String [][] libros) {
	boolean eliminado = false;
	mostrarArrayLibros(libros); 
	System.out.println("");
	System.out.print("Introduce el ISBN: ");
	String isbn = sc.next();
	
	for (int i = 0; i < libros.length; i++) {
		if (libros[i][0] != null && libros[i][0].equals(isbn)) {
			libros[i][0] = null;
			libros[i][1] = null;
			libros[i][2] = null;
			libros[i][3] = null;
			System.out.println("Libro eliminado con éxito");
			eliminado = true;
			break;
		}
	}
	if (!eliminado) System.out.println("No se ha podido eliminar el Libro");
	}

	

	public static void ModificarArticulo(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int op) {
		mostrarMenuArticulos();
		int opModArt = sc.nextInt();
		menuModificarArticulo(sc, libros, revistas, peliculas, opModArt);
	}
	
	public static void menuModificarArticulo(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int opModArt) {
		switch (opModArt) {
		case 1: modificarLibro(sc, libros);
			break;
		case 2: //modRevista(sc, revistas);
			break;
		case 3: //modPeli(sc, peliculas);
			break;
		case 0: System.out.println("Volviendo al menú...");
			break;
		default: System.out.println("ERROR. Teclee una opción correcta.");
		}
	}
	
	public static void modificarLibro(Scanner sc,String [][] libros) {
		
		boolean modificado = false;
		mostrarArrayLibros(libros); 
		System.out.println("");
		System.out.print("Introduzca el ISBN del libro: ");
		String isbn = sc.next();
		
		for (int i = 0; i < libros.length; i ++) {
				if (libros[i][0].equals(isbn)) {
					System.out.print("Escribe el ISBN: ");
					libros[i][0] = sc.next();
					System.out.print("Escribe el título: ");
					libros[i][1] = sc.next();
					System.out.print("Escribe el autor: ");
					libros[i][2] = sc.next();
					System.out.print("Escribe la editorial: ");
					libros[i][3] = sc.next();
					System.out.println("Libro modificado con éxito.");
					modificado = true;
					break;
				}
 			}
		
		if (!modificado) System.out.println("No se ha podido modificar el Libro");
	}
	
	public static void mostrarArrayLibros(String [][] libros) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i][0]!=null) {
				for (int j = 0; j < libros[i].length; j++) {
					System.out.print(" " + libros[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}
	
	public static void AlquilarArticulo (Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int op) {
		mostrarMenuArticulos();
		int opAlqArt = sc.nextInt();
		menuAlquilarArticulo(sc, libros, revistas, peliculas, opAlqArt);
		
	}
	
	public static void menuAlquilarArticulo(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int opAlqArt) {
		
		switch (opAlqArt) {
		case 1: AlquilarLibro(sc, libros);
			break;
		case 2: //alqRevista(sc, revistas);
			break;
		case 3: //alqPeli(sc, peliculas);
			break;
		case 0: System.out.println("Volviendo al menú...");
			break;
		}
	}
	
	public static void AlquilarLibro (Scanner sc, String[][] libros) {
		
		boolean alquilado = false;
		mostrarArrayLibrosDisponibles(libros);
		System.out.print("");
		System.out.print("Introduce el ISBN: ");
		String isbn = sc.next();
		
		for (int i = 0; i < libros.length; i ++) {
			if (libros[i][0].equals(isbn) && libros[i][4] == null) {
				System.out.print("Introduzca su DNI: ");
				String dni = sc.next();
				libros[i][4] = dni;
				alquilado = true;
				break;
			}
		}
		
		if (!alquilado) System.out.println("No se ha podido alquilar el Libro.");
	}
	
	public static void DevolverArticulo (Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int op) {
		mostrarMenuArticulos();
		int opDevArt = sc.nextInt();
		menuDevolverArticulo(sc, libros, revistas, peliculas, opDevArt);
		
	}
	
	public static void menuDevolverArticulo(Scanner sc, String [][] libros, String [][] revistas, String [][] peliculas, int opDevArt) {
		
		switch (opDevArt) {
		case 1: devolverLibro(sc, libros);
			break;
		case 2: //devRevista(sc, revistas);
			break;
		case 3: //devPeli(sc, peliculas);
			break;
		case 0: System.out.println("Volviendo al menú...");
			break;
		}
	}
	
	public static void devolverLibro (Scanner sc, String[][] libros) {
		
		boolean devuelto = false;
		mostrarArrayLibrosAlquilados(libros);
		System.out.print("");
		System.out.print("Introduce el ISBN: ");
		String isbn = sc.next();
		
		for (int i = 0; i < libros.length; i ++) {
			if (libros[i][0].equals(isbn) && libros[i][4] != null) {
				libros[i][4] = null;
				System.out.println("Libro devuelto con éxito");
				devuelto = true;
				break;
			}
		}
		
		if (!devuelto) System.out.println("No se ha podido devolver el Libro.");
	}
	
	public static void mostrarArrayLibrosDisponibles(String [][] libros) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i][0]!=null && libros[i][4]==null) {
				for (int j = 0; j < libros[i].length; j++) {
					System.out.print(" " + libros[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}
	
	public static void mostrarArrayLibrosAlquilados(String [][] libros) {
		for (int i = 0; i < libros.length; i++) {
			if(libros[i][0]!=null && libros[i][4]!=null) {
				for (int j = 0; j < libros[i].length; j++) {
					System.out.print(" " + libros[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}
	
}
