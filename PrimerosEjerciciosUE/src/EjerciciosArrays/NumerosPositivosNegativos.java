package EjerciciosArrays;

import java.util.Scanner;

/*
 *  Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
 *  A continuación se recorre el array y calcula cuántos números son positivos, 
 *  cuántos negativos y cuántos ceros.
 */
public class NumerosPositivosNegativos {

	public static void main(String[] args) {
		// Variables 
		int numeros [] = new int [10];
		Scanner sc = new Scanner(System.in);
		int positivos=0, negativos=0, ceros=0;
		
		//Bucle para ir guardando los números en cada una de las posiciones de i
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Dime el numero a guardar: ");
			numeros[i]=sc.nextInt();
		}
		
		//Bucle que recorre el array para comparar cada número e incrementar el contador.
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<0) negativos++;
			else {
				if(numeros[i]==0) ceros++;
				else positivos++;
			}
		}
		
		System.out.println("La cantidad de numeros negativos es :"+negativos);
		System.out.println("La cantidad de numeros positivos es :"+positivos);
		System.out.println("La cantidad de ceros es :"+ceros);
		

	}

}
