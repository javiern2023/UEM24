import java.util.ArrayList;
import java.util.Scanner;


public class principal {

	public static void main(String[] args) {
		int opcion;
		String nombre, dni, apellidos, direccion;
		Scanner sc = new Scanner(System.in);
		ArrayList <Persona> ArrayListPersonas = new ArrayList <Persona> ();
		do {
			System.out.println("MENU DE OPCIONES");
			System.out.println("1.- Insertar persona");
			System.out.println("2.- Comprobar dni");
			opcion=sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.print("Dime tu nombre");
						nombre=sc.next();
						System.out.print("Dime tu dni");
						dni=sc.next();
						System.out.print("Dime tus apellidos");
						apellidos=sc.next();
						System.out.print("Dime tu direccion");
						direccion=sc.next();
						Persona p = new Persona(nombre,dni,apellidos,direccion);
						ArrayListPersonas.add(p);
					break;
				case 2: System.out.print("Dime tu nombre");
						nombre=sc.next();
						for(Persona p1: ArrayListPersonas) {
							if(p1.getNombre().equalsIgnoreCase(nombre)) {
								System.out.println("Tu dni es: "+p1.getDni());
							}
						}
					break;
				case 3: System.out.print("Dime tu dni");
						dni=sc.next();
						for(Persona p1: ArrayListPersonas) {
							if(p1.getDni().equals(dni)) {
								ArrayListPersonas.remove(p1);
							}
						}
					break;
			}
		
		}while(opcion!=3);
	}

}
