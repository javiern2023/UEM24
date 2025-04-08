import java.util.Scanner;

public class EjercicioMayorMenorSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorMayorIgual=0, nota, contadorMenor=0;
		boolean seguir=true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dime la nota a comprobar");
			nota=sc.nextInt();
			if(nota!=0) {
				if(nota>=7) contadorMayorIgual++;
				else contadorMenor++;
			}
		} while (nota!=0);
		System.out.println("Numero de notas mayores o iguales a 7: "+contadorMayorIgual);
		System.out.println("Numero de notas menores de 7: "+contadorMenor);
	}

}
