package CuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variables
		String nombre;
		double cantidad;
		int opcion;
		ArrayList <Cuenta> Cuentas = new ArrayList <Cuenta> ();
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Dime el nombre del primer titular");
		nombre=sc.next();
		Cuenta c1 = new Cuenta(nombre);
		Cuentas.add(c1);
		
		
		
		System.out.println("Dime el nombre del titular a buscar");
		nombre=sc.next();
		//bucle for each
	    for (Cuenta c: Cuentas) {
	        if(c.getTitular().equals(nombre)) {
	        	System.out.print("Tu saldo actual es: "+c.getCantidad());
	        	break;
	        }
	    }*/
		
		do {
			System.out.println("MENU DE OPCIONES");
			System.out.println("1.- Dar de alta una cuenta");
			System.out.println("2.- Dar de baja una cuenta");
			System.out.println("3.- Ingresar");
			System.out.println("4.- Retirar");
			System.out.println("5.- Ver saldo");
			System.out.println("6.- Transferencia");
			System.out.println("7.- Salir");
			opcion=sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.println("Dime el nombre del segundo titular");
						nombre=sc.next();
						System.out.println("Dime la cantidad del segundo titular");
						cantidad=sc.nextDouble();
						Cuenta c1 = new Cuenta(nombre,cantidad);
						Cuentas.add(c1);
					break;
				case 3: System.out.println("¿Cuánto vas a ingresar?");
				        cantidad=sc.nextDouble();
				        /*if(cantidad>0) c1.ingresar(cantidad);
				        else System.out.println("Valor negativo, no se ingresa nada");*/
					break;
				case 4: System.out.println("¿Cuánto vas a retirar?");
						//c1.retirar(sc.nextDouble());
					break;
				case 5: System.out.println("Dime el nombre del titular a buscar");
						nombre=sc.next();
						for (Cuenta c: Cuentas) {
					        if(c.getTitular().equals(nombre)) {
					        	System.out.println("Tu saldo actual es: "+c.getCantidad());
					        	break;
					        }
					    }
						//System.out.println("Tu saldo actual es: "+c1.getCantidad());
						break;
				case 7: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opcion incorrecta");
			}
		} while(opcion!=4);

	}

}
