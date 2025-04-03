package capturaExcepcion;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws valorIncorrecto{
		Scanner sc = new Scanner(System.in);
		String telefono;
		
			System.out.println("Dime tu teléfono: ");
			telefono=sc.next();
			try {
				if(telefono.length()!=9 )throw new valorIncorrecto(
						"El teléfono debe tener 9 dígitos"
				);
				else System.out.println("Longitud correcta");
			}
			catch(valorIncorrecto e) {
				System.out.println("Excepcion capturada: "+e.getMessage());
				System.out.println("Pila: "+e.getStackTrace());
				e.printStackTrace();
			}
			finally {
				System.out.println("Finally");
			}
		
			
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");	
		System.out.println("Dime la fecha de hoy: ");
		String fecha = sc.next();
		formato.format(fecha);
	}

}
