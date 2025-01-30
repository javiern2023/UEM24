package EjerciciosMetodos;

import java.util.Scanner;

public class EjercicioPruebaMetodos {

	public static void main(String[] args) {
		// Variables
		int edad=28;
		int notas [] = {1,2,3};
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Mi edad es: "+edad);
		edad = imprimirPorPantalla(edad);
		System.out.println("Tu nueva edad es: "+edad);
		
		imprimirNotas(notas, sc);
		System.out.println("La nota de la posicion 1 (main): "+notas[0]);

	}
	
	public static void imprimirNotas(int[] not, Scanner sc) {
		System.out.println("La nota de la posicion 1 (metodo): "+not[0]);
		System.out.println("Dime la nota a guardar: ");
		not[0]=sc.nextInt();
	}
	
	public static int imprimirPorPantalla(int edad) {
		edad = 38;
		System.out.println("Tu edad es: "+edad);
		return edad;
	}
	

}
