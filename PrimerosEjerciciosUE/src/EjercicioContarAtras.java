import java.util.Scanner;
//Contar hacia atrás desde el número dado por el usuario.
public class EjercicioContarAtras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número para contar: ");
		num=sc.nextInt();
		for(int i=num;i>=0;i--) {
			System.out.println("Numero "+i);
		}

	}

}
