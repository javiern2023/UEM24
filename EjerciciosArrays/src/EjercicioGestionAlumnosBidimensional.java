import java.util.Scanner;

public class EjercicioGestionAlumnosBidimensional {

	public static void main(String[] args) {
		// Declaración de variables
		int opcionMenuGeneral;
		final int ALUMNOS = 22;
		final int COLUMNAS = 8;
		Scanner sc = new Scanner(System.in);
		String arrayAlumnos [][] = new String [ALUMNOS][COLUMNAS];
		mostrarMenuGeneral();
		opcionMenuGeneral = sc.nextInt();
		switch (opcionMenuGeneral) {
			case 1: insertarAlumno(sc, arrayAlumnos);
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}

	public static void mostrarMenuGeneral() {
		System.out.println("Menu de opciones");
		System.out.println("1.- Insertar alumno");
		System.out.println("2.- Modificar alumno");
		System.out.println("3.- Dar de baja alumno");
		
	}
	
	public static void insertarAlumno(Scanner sc, String arrayAlumnos [][]) {
		String dni;
		int posicion;
		System.out.print("Dime tu dni ");
		dni = sc.next();
		if(buscarDniAlumno(dni, arrayAlumnos)) {
			System.out.println("Alumno ya registrado");
		}
		else {
			posicion = buscarEspacioLibre(arrayAlumnos);
			if(posicion<0) {
				System.out.println("No hay espacio");
			}
			else {
				arrayAlumnos[posicion][0] = dni;
				System.out.print("Dime tu nombre ");
				arrayAlumnos[posicion][1]=sc.nextLine();
			}
		}
	}
	
	public static boolean buscarDniAlumno(String dni, String arrayAlumnos [][]) {
		boolean encontrado = false;
		for(int i=0;i<arrayAlumnos.length;i++) {
			if(arrayAlumnos[i][0]!=null) {
				if(arrayAlumnos[i][0].equals(dni)) {
					encontrado = true;
					i=arrayAlumnos.length;
				}
			}
		}
		return encontrado;
	}
	
	public static int buscarEspacioLibre(String arrayAlumnos [][]) {
		int posicion = -1;
		for(int i=0;i<arrayAlumnos.length;i++) {
			if(arrayAlumnos[i][0]==null) {
				posicion = i;
				i=arrayAlumnos.length;
			}
		}
		return posicion;
	}
}
