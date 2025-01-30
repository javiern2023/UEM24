import java.util.Scanner;

public class EjercicioNotasArrayBid {

	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean existe = false;
		String dni, nombre, nota;
		
		String arrayAlumnos [][] = new String [25][3];
		System.out.println("Menu de opciones");
		System.out.println("1.- Insertar alumnos");
		System.out.println("6.- Salir");
		opcion=sc.nextInt();
		do {
			switch(opcion) {
				case 1: System.out.print("Dime tu dni: ");
						dni = sc.next();
						for(int i=0;i<arrayAlumnos.length;i++) {
							if(arrayAlumnos[i][0].equals(dni)) {
								System.out.println("No se puede insertar, ya existe");
								existe=true;
								break;
							}
						}
						if(!existe) {
							for(int i=0;i<arrayAlumnos.length;i++) {
								if(arrayAlumnos[i][0]==null) {
									arrayAlumnos[i][0]=dni;
									System.out.print("Dime tu nombre: ");
									arrayAlumnos[i][1] = sc.next();
									System.out.print("Dime tu nota: ");
									arrayAlumnos[i][2] = sc.next();
									break;
								}
							}
						}
					break;
				case 6: System.out.println("Hasta pronto");
					break;
				default:
			}
		} while(opcion!=6);

	}

}
