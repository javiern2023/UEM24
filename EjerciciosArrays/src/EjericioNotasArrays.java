import java.util.Scanner;

public class EjericioNotasArrays {

	public static void main(String[] args) {
		double nota, media=0;
		int opcion, alumnos=0;
		String dni;
		boolean encontrado=false;
		Scanner sc = new Scanner(System.in);
		String arrayDni [] = {"123","456","789","741","852","963","753","159"};
		double arrayNotas [] = new double [arrayDni.length];
		
		do {
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("1.- Insertar nota");
			System.out.println("2.- Modificar nota");
			System.out.println("3.- Quitar nota");
			System.out.println("4.- Media de la clase");
			System.out.println("5.- Salir");
			opcion=sc.nextInt();
			
			switch(opcion) {
				case 1: System.out.println("Dime el dni del alumno");
						dni=sc.next();
						for(int i=0;i<arrayDni.length;i++) {
							if(arrayDni[i].equals(dni)) {
								System.out.println("Dime la nota del alumno");
								arrayNotas[i]=sc.nextDouble();
								encontrado=true;
								System.out.println("Nota insertada correctamente");
								i=arrayDni.length;
							}
						}
						if(!encontrado) System.out.println("El alumno no existe");
						else encontrado=false;
					break;
				case 2: System.out.println("Dime el dni del alumno");
						dni=sc.next();
						for(int i=0;i<arrayDni.length;i++) {
							if(arrayDni[i].equals(dni)) {
								System.out.println("Nota actual "+arrayNotas[i]);
								System.out.println("Dime la nota nueva del alumno");
								arrayNotas[i]=sc.nextDouble();
								encontrado=true;
								System.out.println("Nota modificada correctamente");
								i=arrayDni.length;
							}
						}
						if(!encontrado) System.out.println("El alumno no existe");
						else encontrado=false;
					break;
				case 3: System.out.println("Dime el dni del alumno");
						dni=sc.next();
						for(int i=0;i<arrayDni.length;i++) {
							if(arrayDni[i].equals(dni)) {
								System.out.println("Nota actual "+arrayNotas[i]);
								arrayNotas[i]=0.0;
								encontrado=true;
								System.out.println("Nota eliminada correctamente");
								i=arrayDni.length;
							}
						}
						if(!encontrado) System.out.println("El alumno no existe");
						else encontrado=false;
					break;
				case 4: for(int i=0;i<arrayNotas.length;i++) {
							if(arrayNotas[i]!=0.0) {
								media+=arrayNotas[i];
								alumnos++;
							}
						}
						System.out.println("La media de la clase es: "+(media/alumnos));
					break;
				case 5: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opcion incorrecta");
			}
		} while(opcion!= 5);
	}
}
