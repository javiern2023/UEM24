package Ejercicio16;

import java.util.Scanner;

public class Formulario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:rellenarNombre(sc);
				break;
			case 2:rellenarApellidos(sc);
				break;
			case 3:rellenarDNI(sc);
				break;
			case 4:rellenarMail(sc);
				break;
			case 5:salir(sc);
				break;
			default:System.out.println("ERROR, elija una de las opciones indicadas");
				break;
			}
			
		}while(opcion!=5);

	}

	public static void salir(Scanner sc) {
		String nombre = null,apellido = null,dni = null,email = null;
		 if (nombre != null && apellido != null && dni != null && email != null) {
			 System.out.println("Todos los datos han sido completados. ¡Formulario completado correctamente!");
	        } else {
	           System.out.println("Faltan datos por rellenar!!! No puedes salir.");
	        }
	    }
		

	public static void rellenarMail(Scanner sc) {
		System.out.print("Introduce tu Email: ");
        String email = sc.nextLine();
        System.out.println("Email registrado correctamente.");
		
	}

	public static void rellenarDNI(Scanner sc) {
		System.out.print("Introduce tu DNI: ");
        String DNI = sc.nextLine();
        System.out.println("DNI registrado correctamente.");
		
	}

	public static void rellenarApellidos(Scanner sc) {
		System.out.print("Introduce tus apellidos: ");
        String apellido = sc.nextLine();
        System.out.println("Apellidos registrados correctamente.");
		
	}

	public static void rellenarNombre(Scanner sc) {
		System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre registrado correctamente.");
		
	}

	public static void mostrarMenu() {
		 System.out.println("Menú de opciones:");
	     System.out.println("1.- Rellenar nombre.");
	     System.out.println("2.- Rellenar apellidos.");
	     System.out.println("3.- Rellenar DNI.");
	     System.out.println("4.- Rellenar e-mail.");
	     System.out.println("5.- Salir.");
	     System.out.print("Elija una opción: ");
		
	}

}
