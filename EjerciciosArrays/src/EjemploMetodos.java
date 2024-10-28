import java.util.Scanner;

public class EjemploMetodos {
	
	public static void main(String[] args) {
		// Declaración de variables
		int suma;
		Scanner sc = new Scanner(System.in);
		
		suma = suma(sc);
		System.out.println("La suma es: "+suma);
	}
	
	public static int suma(Scanner sc) {
		int suma, num1, num2;
		System.out.println("Dime el primer numero ");
		num1 = sc.nextInt();
		System.out.println("Dime el segundo numero ");
		num2 = sc.nextInt();
		suma = num1+num2;
		return suma;
	}

}
