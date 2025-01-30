package EjerciciosArrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Crear una matriz de 5 filas y n columnas (se pide al usuario). 
 * Rellenarlo con números aleatorios entre 0 y 10.*/
public class NumerosAleatorios {

	public static void main(String[] args) {
		// Variables
		final int FILAS = 5;
		int columnas;
		Scanner sc = new Scanner (System.in);
		int array [][];
		Random rd = new Random();
		
		System.out.print("Cuantas columnas quieres crear: ");
		columnas=sc.nextInt();
		array=new int [FILAS][columnas];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=rd.nextInt(11);
			}
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(" "+array[i][j]+ " ");
			}
			System.out.println(" ");
		}

	}

}
