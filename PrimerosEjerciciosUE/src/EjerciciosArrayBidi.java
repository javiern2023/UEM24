import java.util.Scanner;

public class EjerciciosArrayBidi {

	public static void main(String[] args) {

		final int FILAS = 3;
		final int COLUMNAS = 3;
		String arrayAlumnos [][] = new String [FILAS][COLUMNAS];
		Scanner sc = new Scanner(System.in);
		
		//Primer for me sirve para recorrer las filas
		for (int i = 0; i<arrayAlumnos.length; i++) {
			//Segundo for me sirve para recorrer las columnas, dentro de una fila
			for (int j = 0; j<arrayAlumnos[0].length; j++) {
				System.out.print("Dime el nombre: ");
				arrayAlumnos[i][j]=sc.next();
			}
			
		}
		
		//Primer for me sirve para recorrer las filas
		for (int i = 0; i<arrayAlumnos.length; i++) {
			//Segundo for me sirve para recorrer las columnas, dentro de una fila
			for (int j = 0; j<arrayAlumnos[0].length; j++) {
				System.out.println("Nombre en la fila "+i+" columna "+j+" "+arrayAlumnos[i][j]);
			}
					
		}
		
		
		

	}

}
