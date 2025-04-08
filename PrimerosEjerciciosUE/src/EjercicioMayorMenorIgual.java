/*Dado dos números por teclado, que me muestre cuál es el mayor, menor y
si son iguales.*/

import java.util.Scanner;

public class EjercicioMayorMenorIgual {

	public static void main(String[] args) {
		//Declaración de variables
		double num1, num2;
		Scanner sc = new Scanner (System.in);
		
		//Petición de datos
		System.out.print("Dime el primer numero ");
		num1 = sc.nextDouble();
		System.out.print("Dime el segundo numero ");
		num2 = sc.nextDouble();
		
		//Comprobación
		if (num1>num2) {
			System.out.println("El numero "+num1+" es mayor que el numero "+num2);
		}
		else {
			if(num2>num1) {
				System.out.println("El numero "+num2+" es mayor que el numero "+num1);
			}
			else {
				System.out.println("Ambos numeros son iguales");
			}
		}

	}

}
