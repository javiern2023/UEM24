/*1.- Programa que muestre los números del 1 al 100 utilizando while.
  2.- Programa que muestre los números del 1 al 100 utilizando do-while
  3.- Programa que muestre los números del 1 al 100 utilizando for.
*/

import java.util.Scanner;

public class EjerciciosBucles {

	public static void main(String[] args) {
		int numero=1;
		boolean valor=true;
		Scanner sc = new Scanner (System.in);
		// while
		/*while (numero<=100) {
			System.out.println(numero);
			numero++;	
		}*/
		/*while (valor) {
			System.out.println("Introduzca un numero ");
			numero = sc.nextInt();
			if(numero<=0) valor=false;
		}*/
		
		
		// do-while
		/*do {
			System.out.println(numero);
			numero++;
		} while (numero<=100);*/
		/*do {
			System.out.println("dime el primer numero");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Salir");
			numero = sc.nextInt();
			System.out.println("Dime el segundo numero");
			switch(numero) {
			
			}
		} while (numero!=5);*/
		
		
		// for
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}

}
