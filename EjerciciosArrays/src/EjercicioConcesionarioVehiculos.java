import java.util.Scanner;

public class EjercicioConcesionarioVehiculos {

	public static void main(String[] args) {
		// Declaracion variables
		final int FILAS = 200;
		final int COLUMNAS = 5;
		String vehiculos [][] = new String [FILAS][COLUMNAS];
		int opcionMenuPrincipal;
		Scanner sc = new Scanner(System.in);
		
		mostrarMenu();
		opcionMenuPrincipal = sc.nextInt();
		
		switch(opcionMenuPrincipal) {
			case 1: insertarMatricula(vehiculos, sc);
				break;
			case 2: eliminarMatricula(vehiculos, sc);
				break;
			case 3: modificarMatricula(vehiculos, sc);
				break;
			case 4: mostrarVehiculosDisponibles(vehiculos, sc);
					realizarVenta(vehiculos, sc);
				break;
			case 5: mostrarVehiculosDisponibles(vehiculos, sc);
				break;
			case 6: mostrarVehiculosDeUnCliente(vehiculos, sc);
				break;
			case 7: mostrarVehiculosVendidos(vehiculos, sc);
				break;	
			default:
		}
		
	}
	
	public static void mostrarVehiculosDisponibles(String vehiculos[][], Scanner sc) {
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][4]==null) {
				System.out.print("La matricula es: "+vehiculos[i][0]);
			}
		}
		
	}
	
	public static void mostrarVehiculosDeUnCliente(String vehiculos[][], Scanner sc) {
		System.out.println("Dime el dni a buscar");
		String dni=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][4]!=null) {
				if(vehiculos[i][4].equalsIgnoreCase(dni)) {
					System.out.print("La matricula es: "+vehiculos[i][0]);
				}
			}
		}
		
	}
	
	public static void mostrarVehiculosVendidos(String vehiculos[][], Scanner sc) {
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][4]!=null) {
				System.out.print("La matricula es: "+vehiculos[i][0]);
			}
		}
		
	}
	
	public static void realizarVenta(String vehiculos [][], Scanner sc) {
		boolean realizada = false;
		System.out.println("Dime la matricula a buscar");
		String matricula=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				//Pedir datos e insertar en el array
				if(vehiculos[i][0].equalsIgnoreCase(matricula)) {
					System.out.println("Dime el dni");
					vehiculos[i][4]=sc.next();
					i=vehiculos.length;
					realizada=true;
				}
				
			}
		}
		if(realizada) System.out.println("Venta realizada correctamentamente");
		else System.out.println("No se pudo realizar la venta del vehículo");
	}
	
	
	public static void modificarMatricula(String vehiculos [][], Scanner sc) {
		boolean cambiada = false;
		System.out.println("Dime la matricula a buscar");
		String matricula=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				//Pedir datos e insertar en el array
				if(vehiculos[i][0].equalsIgnoreCase(matricula)) {
					System.out.println("Dime la matricula nueva");
					vehiculos[i][0]=sc.next();
					i=vehiculos.length;
					cambiada=true;
				}
				
			}
		}
		if(cambiada) System.out.println("Modificada correctamentamente");
		else System.out.println("No se pudo modificar la matricula");
	}
	
	public static void eliminarMatricula(String vehiculos [][], Scanner sc) {
		boolean eliminado = false;
		System.out.println("Dime la matricula");
		String matricula=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				//Pedir datos e insertar en el array
				if(vehiculos[i][0].equalsIgnoreCase(matricula)) {
					vehiculos[i][0]=null;
					vehiculos[i][1]=null;
					vehiculos[i][2]=null;
					vehiculos[i][3]=null;
					i=vehiculos.length;
					eliminado=true;
				}
				
			}
		}
		if(eliminado) System.out.println("Eliminada correctamentamente");
		else System.out.println("No se pudo eliminar");
	}
	
	public static void insertarMatricula(String vehiculos [][], Scanner sc) {
		boolean insertado = false;
		String matricula;
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]==null) {
				//Pedir datos e insertar en el array
				System.out.println("Dime la matricula");
				matricula=sc.next();
				if(comprobarMatricula(vehiculos,matricula)) {
					System.out.println("La matricula ya existe");
					i=vehiculos.length;
				}
				else {
					vehiculos[i][0]=matricula;
					System.out.println("Dime la marca");
					vehiculos[i][1]=sc.next();
					//Sigo pidiendo datos del coche
					insertado=true;
					i=vehiculos.length;
				}
				
			}
		}
		if(insertado) System.out.println("Insertada correctamenta");
		else System.out.println("No se insertó");
		
	}
	
	public static boolean comprobarMatricula(String vehiculos[][], String matricula) {
		boolean encontrada = false;
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				if(vehiculos[i][0].equals(matricula)) {
					encontrada=true;
					i=vehiculos.length;
				}
			}
		}
		return encontrada;
	}
	
	public static void mostrarMenu() {
		System.out.println("Menú de opciones");
		System.out.println("1.- Insertar matricula");
		System.out.println("2.- Eliminar matricula");
		System.out.println("3.- Borrar matricula");
		System.out.println("4.- Realizar la venta");
		System.out.println("5.- Mostrar vehiculos disponibles");
		System.out.println("6.- Mostrar vehiculos de un cliente");
		System.out.println("7.- Mostrar vehiculos vendidos");
		System.out.println("8.- Salir");
	}

}
