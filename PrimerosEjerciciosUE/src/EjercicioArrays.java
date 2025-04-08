import java.util.Scanner;

public class EjercicioArrays {

	public static void main(String[] args) {
		// Variables
		/*String nombre, apellidos, edad, salario;
		
		String arrayAlumnos [] = new String [5];
		
		arrayAlumnos[0] = "Javier";
		arrayAlumnos[1] ="Navazo";
		System.out.print("Dime tu edad ");
		arrayAlumnos[2] = sc.next();
		System.out.println(arrayAlumnos[0]);
		System.out.println(arrayAlumnos[1]);
		System.out.println(arrayAlumnos[2]);*/
		Scanner sc = new Scanner(System.in);
		int arrayNotas [] = new int [5];
		
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.print("Dime la nota a guardar: ");
			arrayNotas[i]=sc.nextInt();
		}
		
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.println("La nota en la posicion "+i+" es "+arrayNotas[i]);
		}

	}

}
