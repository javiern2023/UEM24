//package simulacro_katherinVarela;
import java.util.Scanner;
public class Formulario {
	 static String nombre = "" , apellido = "", dni = "", email = "", salir;
	 static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		 int opcion;
		 do {
			 mostrarMenu();
			 opcion = sc.nextInt();
			 menuElegido(opcion);
		 } while (!validarSalida(opcion));
	}
		
	

		public static void mostrarMenu() {
		
		System.out.println("Digite 1 para rellenar nombre: ");
		System.out.println("Digite 2 para rellenar apellidos: ");
		System.out.println("Digite 3 para rellenar DNI: ");
		System.out.println("Digite 4 para rellenar e-mail: ");
		System.out.println("Digite 5 para salir del menu: ");
		
	
        }
    public static void menuElegido(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("Ingrese su nombre: ");
			nombre = sc.next();
			break;
		
		case 2:
			System.out.println("Ingrese su apellido: ");
			apellido = sc.next();
			break;
		case 3:
			System.out.println("Ingrese el DNI:");
			dni = sc.next();
			break;
		case 4:
			System.out.println("Ingrese el e-mail: ");
			email = sc.next();
			break;
		case 5:
			break;
			default:
				System.out.println("opcion no valida.");
				
				
			}
		
		
		}
    
    
    private static boolean validarSalida(int opcion) {
 		if (opcion == 5) {
 			if(!nombre.isEmpty() && !apellido.isEmpty() && !dni.isEmpty() && !email.isEmpty()) {
 				System.out.println("Datos ingresados correctamente, puede salir del sistema.");
 				return true;
 			
 			} else {
 				System.out.println("no se han igresado los datos, no es posible salir");
 				return false;
 			}
 		}
 		return false;
 	}
			

	}


	


