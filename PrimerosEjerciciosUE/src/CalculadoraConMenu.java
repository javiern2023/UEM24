import java.util.Scanner;

public class CalculadoraConMenu {

	public static void main(String[] args) {
		// Declaracion de variables
		String operacion;
		double op1, op2=0, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el primer numero: ");
		op1=sc.nextDouble(); //Lecutra de valor int
		
		System.out.println("Indique la operación con la palabra");
		System.out.println("Sumar");
		System.out.println("Restar");
		System.out.println("Multiplicar");
		System.out.println("Dividir");
		System.out.println("Resto");
		System.out.println("Salir");
		operacion = sc.next().toLowerCase();
		
		if(!operacion.equals("salir")) {
			System.out.print("Dime el segundo numero: ");
			op2=sc.nextDouble();
		}
				
		switch(operacion) {
			case "sumar": System.out.println("La suma de "+op1+" y "+op2+" es: "+(op1+op2));
				break;
			case "restar": if(op1>op2) {
						resultado = op1-op2;
						System.out.println("La resta de "+op1+" y "+op2+" es: "+resultado);
					}
					else {
						resultado = op2-op1;
						System.out.println("La resta de "+op2+" y "+op1+" es: "+resultado);
					}
					
				break;
			case "multiplicar": System.out.println("La multiplicacion de "+op1+" y "+op2+" es: "+(op1*op2));
				break;
			case "dividir": if(op2==0) {
						System.out.println("La division no se puede hacer");
					}
					else {
						resultado = op1/op2;
						System.out.println("La division de "+op1+" y "+op2+" es: "+resultado);
					}
					
				break;
			case "resto": if(op2==0) System.out.println("La division no se puede hacer");
					else {
						resultado = op1%op2;
						System.out.println("El resto de "+op1+" y "+op2+" es: "+resultado);
					}
				break;
			case "salir": System.out.println("Hasta pronto");
				break;
			default: System.out.println("Opcion incorrecta");
		}

	}

}
