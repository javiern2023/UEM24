package EjerciciosArrays;
import java.util.Scanner;

public class arraysDnin {

	public static void main(String[] args) {
		int resto, dni;
		final int VEINTITRES=23;
		Scanner sc = new Scanner(System.in);
		String arrayDni [] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		System.out.println("Dime tu dni, sin letra");
		dni=sc.nextInt();
		resto=dni%VEINTITRES;
		System.out.println("La letra para el dni "+dni+" es "+arrayDni[resto]);
	}

}
