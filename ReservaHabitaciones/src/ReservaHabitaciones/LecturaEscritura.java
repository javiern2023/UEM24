package ReservaHabitaciones;

import java.util.Scanner;

public class LecturaEscritura {
	protected Scanner sc = new Scanner(System.in);
	protected int opcion;
	
	protected int mostrarMenuPrincipal() {
		System.out.println("1.- Añadir una habitacion");
		System.out.println("2.- Mostrar todas las habitaciones");
		System.out.println("3.- Realizar una reserva");
		System.out.println("4.- Cancelar una reserva");
		System.out.println("5.- Mostrar todas las reservas");
		System.out.println("6.- Mostrar habitaciones disponibles");
		System.out.println("7.- Salir");
		opcion=sc.nextInt();
		return opcion;
	}
	
}
