import java.util.Scanner;

public class ejemploArray {

	public static void main(String[] args) {
		int arrayNotas [];
		
		Scanner sc = new Scanner(System.in);
		int notas;
		
		System.out.print("Dime tu nota: ");
		notas = sc.nextInt();
		arrayNotas = new int [notas];
		arrayNotas[4]=notas;
		System.out.println("La nota en la posición 4 es: "+arrayNotas[4]);
		
		//System.out.println("La nota en la posición 8 es: "+arrayNotas[7]);
		
		
		//System.out.println(arrayNotas[0]);
		
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.print("Dime la nota");
			arrayNotas[i]=sc.nextInt();
			System.out.println("La nota en la posicion "+i+" es "+arrayNotas[i]);
		}
		/*
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.println("Nota de la posición "+i+" es "+arrayNotas[i]);
		}*/

	}

}
