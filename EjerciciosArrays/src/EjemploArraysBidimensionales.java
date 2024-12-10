import java.util.Scanner;

public class EjemploArraysBidimensionales {

	public static void main(String[] args) {
		final int FILAS = 2;
		final int COLUMNAS = 3;
		Scanner sc = new Scanner(System.in);
		
		String array [][] = new String [FILAS][COLUMNAS];
		
		System.out.println("Filas "+array.length);
		System.out.println("Columnas "+array[0].length);
		
		//array [0][0] ="025";
		System.out.println("El dni es: "+array[0][0]);
		
		//bucle que recorre las filas
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print("Dime el dni de la fila "+i+" y columna "+j+" :");
				array [i][j] = sc.next();
			}
			
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("Dni de la fila "+i+" y columna "+j+" es: "+array[i][j]);
			}
			
		}
	}

}
