package EjercicioElectrodomesticos;

import java.util.Scanner;

public class imprimirPantalla {
	protected int opcion;
	Scanner sc = new Scanner(System.in);
	
	protected int menuPrincipal() {
		System.out.println("Menu de opciones");
		System.out.println("1.- Dar de alta electrodomestico");
		System.out.println("2.- Mostrar precio");
		System.out.println("3.- Salir");
		opcion=sc.nextInt();
		return opcion;
	}
	
	protected int menuAlta() {
		System.out.println("1- Dar de alta lavadora");
		System.out.println("2.- Dar de alta televisor");
		System.out.println("3.- Salir");
		opcion=sc.nextInt();
		return opcion;
	}
	
	protected void menuMostrarInformacion() {
		System.out.println("4.- Mostrar precio final de un electrodomestico");
		System.out.println("5.- Mostrar precio final de todos los electrodestico");
		System.out.println("6.- Mostrar precio final lavadoras");
	}
}
