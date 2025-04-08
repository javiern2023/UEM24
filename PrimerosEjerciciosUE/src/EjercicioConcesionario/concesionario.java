package EjercicioConcesionario;

import java.util.Scanner;

public class concesionario {

	public static void main(String[] args) {
		// variables
		int opcionMenu;
		Scanner sc = new Scanner (System.in);
		do {
			mostrarMenu();
			opcionMenu=sc.nextInt();
			menuOpciones(sc, opcionMenu);
		} while (opcionMenu!=8);

	}
	
	public static void mostrarMenu() {
		System.out.println("1. Ingresar vehiculo");
		System.out.println("2. Modificar vehiculo");
		System.out.println("3. Eliminar vehiculo");
		System.out.println("4. Mostrar vehiculos disponibles");
		System.out.println("5. Vender vehiculo");
		System.out.println("6. Mostrar vehiculos vendidos");
		System.out.println("7. Mostar los vehiculos de un cliente");
		System.out.println("8. Salir");
	}
	
	public static void menuOpciones(Scanner sc, int opcionMenu) {
		final int FILAS=100, COLUMNAS=6;
		String vehiculos [][] = new String [FILAS][COLUMNAS];
		switch(opcionMenu) {
			case 1: ingresarVehiculos(vehiculos,sc);
				break;
			case 2: modificarVehiculos(vehiculos,sc);
				break;
			case 3: eliminarVehiculos(vehiculos,sc);
				break;
			case 4: mostrarVehiculosDisponibles(vehiculos);
				break;
			case 5: venderVehiculo(vehiculos,sc);
				break;
			case 6: mostrarVehiculosVendidos(vehiculos);
				break;
			case 7: mostrarVehiculosCliente(vehiculos,sc);
				break;
			case 8: System.out.println("Hasta pronto");
				break;
			default: System.out.println("Opcion incorrecta");	
		}
	}
	
	public static void ingresarVehiculos(String[][] vehiculos, Scanner sc) {
		boolean guardado=false;
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]==null) {
				System.out.println("Dime la matricula");
				vehiculos[i][0]=sc.next();
				System.out.println("Dime la marca");
				vehiculos[i][1]=sc.next();
				System.out.println("Dime el modelo");
				vehiculos[i][2]=sc.next();
				System.out.println("Dime el color");
				vehiculos[i][3]=sc.next();
				System.out.println("Dime el precio");
				vehiculos[i][4]=sc.next();
				System.out.println("Guardado el vehículo");
				guardado=true;
				break;
			}
		}
		if(!guardado) System.out.println("No se ha podido guardar el vehículo");
	}
	
	public static void modificarVehiculos(String[][] vehiculos, Scanner sc) {
		boolean modificado=false;
		System.out.println("Dime la matricula");
		String matricula=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				if(vehiculos[i][0].equals(matricula) ) {
					System.out.println("Dime la marca");
					vehiculos[i][1]=sc.next();
					System.out.println("Dime el modelo");
					vehiculos[i][2]=sc.next();
					System.out.println("Dime el color");
					vehiculos[i][3]=sc.next();
					System.out.println("Dime el precio");
					vehiculos[i][4]=sc.next();
					System.out.println("Modificado los datos del vehículo");
					modificado=true;
					break;
				}
			}
			
		}
		if(!modificado) System.out.println("No se ha podido modificar los datos del vehículo");
	}
	
	public static void eliminarVehiculos(String[][] vehiculos, Scanner sc) {
		boolean eliminado=false;
		System.out.println("Dime la matricula");
		String matricula=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				if(vehiculos[i][0].equals(matricula) ) {
					vehiculos[i][0]=null;
					vehiculos[i][1]=null;
					vehiculos[i][2]=null;
					vehiculos[i][3]=null;
					vehiculos[i][4]=null;
					vehiculos[i][5]=null;
					System.out.println("Eliminado el vehículo");
					eliminado=true;
					break;
				}
			}
			
		}
		if(!eliminado) System.out.println("No se ha podido eliminar el vehículo");
	}
	
	public static void mostrarVehiculosDisponibles(String[][] vehiculos) {
		
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				if(vehiculos[i][5]==null) {
					System.out.print("Matricula "+vehiculos[i][0]+" marca "+vehiculos[i][1]+" modelo "+vehiculos[i][2]+" color "+vehiculos[i][3]+" precio "+vehiculos[i][4]);
				}
			}
			
		}
	}
	
	public static void venderVehiculo(String[][] vehiculos, Scanner sc) {
		boolean vendido=false;
		mostrarVehiculosDisponibles(vehiculos);
		System.out.println("Dime la matricula");
		String matricula=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				if(vehiculos[i][0].equals(matricula)) {
					System.out.println("Dime el dni del cliente");
					vehiculos[i][5]=sc.next();
					System.out.println("Vehiculo al cliente correctamente");
					vendido=true;
					break;
				}
			}
		}
		if(!vendido) System.out.println("No se ha vendido ningún vehículo");
	}
	
	public static void mostrarVehiculosVendidos(String[][] vehiculos) {
		
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][0]!=null) {
				if(vehiculos[i][5]!=null) {
					System.out.print("Matricula "+vehiculos[i][0]+" marca "+vehiculos[i][1]+" modelo "+vehiculos[i][2]+" color "+vehiculos[i][3]+" precio "+vehiculos[i][4]+" dni "+vehiculos[i][5]);
				}
			}
			
		}
	}
	
	public static void mostrarVehiculosCliente(String[][] vehiculos, Scanner sc) {
		boolean vendido=false;
		System.out.println("Dime el dni del cliente");
		String dni=sc.next();
		for(int i=0;i<vehiculos.length;i++) {
			if(vehiculos[i][5]!=null) {
				if(vehiculos[i][5].equals(dni)) {
					System.out.print("Matricula "+vehiculos[i][0]+" marca "+vehiculos[i][1]+" modelo "+vehiculos[i][2]+" color "+vehiculos[i][3]+" precio "+vehiculos[i][4]+" dni "+vehiculos[i][5]);
					vendido=true;
				}
			}
		}
		if(!vendido) System.out.println("No tiene ningún coche el cliente");
	}
	
}
