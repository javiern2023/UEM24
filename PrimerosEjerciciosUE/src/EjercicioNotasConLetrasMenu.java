import java.util.Scanner;

public class EjercicioNotasConLetrasMenu {

	public static void main(String[] args) {
		int nota=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("la nota es: "+nota);
		
		System.out.print("Dime tu nota numérica: ");
		nota = sc.nextInt();
		/*System.out.println("Menu de opciones");
		System.out.println("1.- Opcion 1");
		System.out.println("2.- Opcion 2");
		System.out.println("3.- Opcion 3");
		System.out.println("4.- Opcion 4");
		//int opcion = sc.nextInt();
		//String opcion = sc.next().toLowerCase();
		char opcion = sc.next().charAt(0);*/
		
		switch(nota) {
			case 0: System.out.println("INSUFICIENTE");
				break;
			case 1: System.out.println("2");
				break;
			case 2: System.out.println("3");
				break;
			case 3:System.out.println("4");
				break;
			default:System.out.println("Error");
		
		}

	}

}
