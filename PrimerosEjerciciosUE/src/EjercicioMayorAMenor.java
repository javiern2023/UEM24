import java.util.Scanner;

public class EjercicioMayorAMenor {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el primer número: ");
		num1=sc.nextInt();
		System.out.print("Dame el segundo número: ");
		num2=sc.nextInt();
		System.out.print("Dame el tercer número: ");
		num3=sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("El numero mayor es "+num1);
				if(num2>num3) {
					System.out.println("El numero mediano es "+num2);
					System.out.println("El más pequeño es "+num3);
				}
				else {
					System.out.println("El numero mediano es "+num3);
					System.out.println("El más pequeño es "+num2);
				}
				
			}
			else {
				System.out.print("El numero mayor es "+num3);
				if(num1>num2) {
					System.out.println("El numero mediano es "+num1);
					System.out.println("El más pequeño es "+num2);
				}
				else {
					System.out.println("El numero mediano es "+num2);
					System.out.println("El más pequeño es "+num1);
				}
			}
		}
		else {
			if(num2>num3) {
				System.out.println("El numero mayor es "+num2);
				if(num1>num3) {
					System.out.println("El numero mediano es "+num1);
					System.out.println("El más pequeño es "+num3);
				}
				else {
					System.out.println("El numero mediano es "+num3);
					System.out.println("El más pequeño es "+num1);
				}
				
			}
			else {
				System.out.print("El numero mayor es "+num3);
				if(num1>num2) {
					System.out.println("El numero mediano es "+num1);
					System.out.println("El más pequeño es "+num2);
				}
				else {
					System.out.println("El numero mediano es "+num2);
					System.out.println("El más pequeño es "+num1);
				}
			}
			
		}
	}		
}
