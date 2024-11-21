import java.util.Scanner;

public class EjercicioTablaMultiplicar {

	public static void main(String[] args) {
		// Declaración de variables
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número para hacer la tabla de multiplicar: ");
		num=sc.nextInt();
		System.out.println("Tabla de multiplicar del "+num);
		for(int i=0;i<=10;i++) {
			System.out.println(i+" * "+num+" = "+(i*num));
		}

	}

}
