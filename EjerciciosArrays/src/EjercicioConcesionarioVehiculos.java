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
			default:
		}
		
		
		

	}
	
	public static void insertarMatricula(String vehiculos [][], Scanner sc) {
		boolean insertado = false;
		String matricula;
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i]==null) {
				//Pedir datos e insertar en el array
				System.out.println("Dime la matricula");
				matricula=sc.next();
				if(comprobarMatricula(vehiculos,matricula)) {
					System.out.println("La matricula ya existe");
					i=vehiculos.length;
				}
				else {
					vehiculos[i][0]=matricula;
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
			if(vehiculos[i]!=null) {
				if(vehiculos[i].equals(matricula)) {
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
