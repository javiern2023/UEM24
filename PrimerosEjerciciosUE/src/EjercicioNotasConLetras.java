import java.util.Scanner;

public class EjercicioNotasConLetras {

	public static void main(String[] args) {
		// Declaración de variables
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nota numérica: ");
		nota = sc.nextInt();
		
		if(nota>=0 && nota<=10) {
			if(nota>=0 && nota<=4) {
				System.out.println("INSUFICIENTE");
			}
			else {
				if(nota>=5 && nota<6) {
					System.out.println("SUFICIENTE");
				}
				else {
					if(nota>=6 && nota<7) {
						System.out.println("BIEN");
					}
					else {
						if(nota>=7 && nota<9) {
							System.out.println("NOTABLE");
						}
						else {
							if(nota>=9 && nota<10) {
								System.out.println("SOBRESALIENTE");
							}
							else {
								System.out.println("MATRICULA DE HONOR");
							}
						}
					}
				}
			}
		}
		else {
			System.out.println("Nota incorrecta");
		}
		

	}

}
