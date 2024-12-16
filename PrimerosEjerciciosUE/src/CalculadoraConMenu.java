import java.util.Scanner;

public class CalculadoraConMenu {

	public static void main(String[] args) {
		// Declaracion de variables
		String operacion;
		double op1, op2=0, resultado=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Dime el primer numero: ");
			op1=sc.nextDouble(); //Lecutra de valor int
			
			imprimirMenuPrincipal();
			operacion = sc.next().toLowerCase();
			
			if(!operacion.equals("salir")) {
				System.out.print("Dime el segundo numero: ");
				op2=sc.nextDouble();
			}
					
			menuOperaciones(op1, op2, resultado, operacion);
		}while(!operacion.equals("salir"));
		
		

	}
	
	public static void imprimirMenuPrincipal() {
		System.out.println("Indique la operación con la palabra");
		System.out.println("Sumar");
		System.out.println("Restar");
		System.out.println("Multiplicar");
		System.out.println("Dividir");
		System.out.println("Resto");
		System.out.println("Salir");
	}
	
	public static void menuOperaciones(double op1, double op2, double resultado, String operacion) {
		switch(operacion) {
		case "sumar": resultado = sumar(op1, op2, resultado);
					  System.out.println("La suma de "+op1+" y "+op2+" es: "+resultado);	
			break;
		case "restar": restar(op1, op2, resultado);
			break;
		case "multiplicar": multiplicar(op1, op2);
			break;
		case "dividir": dividir(op1, op2, resultado);
			break;
		case "resto": resto(op1, op2, resultado);
			break;
		case "salir": System.out.println("Hasta pronto");
			break;
		default: System.out.println("Opcion incorrecta");
	}
	}
	
	public static double sumar(double op1, double op2, double resultado) {
		resultado = op1+op2;
		return resultado;
	}
	
	public static void restar(double op1, double op2, double resultado) {
		if(op1>op2) {
			resultado = op1-op2;
			System.out.println("La resta de "+op1+" y "+op2+" es: "+resultado);
		}
		else {
			resultado = op2-op1;
			System.out.println("La resta de "+op2+" y "+op1+" es: "+resultado);
		}
	}
	
	public static void multiplicar(double op1, double op2) {
		System.out.println("La multiplicacion de "+op1+" y "+op2+" es: "+(op1*op2));
	}
	
	public static void dividir(double op1, double op2, double resultado) {
		if(op2==0) {
			System.out.println("La division no se puede hacer");
		}
		else {
			resultado = op1/op2;
			System.out.println("La division de "+op1+" y "+op2+" es: "+resultado);
		}
	}

	public static void resto(double op1, double op2, double resultado) {
		if(op2==0) System.out.println("La division no se puede hacer");
		else {
			resultado = op1%op2;
			System.out.println("El resto de "+op1+" y "+op2+" es: "+resultado);
		}
	}
}
