package creacionExcepciones;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws valorErroneo{
		Scanner sc = new Scanner(System.in);
		String telefono;
		System.out.println("Dime tu teléfono: ");
		telefono=sc.next();
		if(telefono.length() != 9 )throw new valorErroneo(
				"El teléfono debe tener 9 dígitos");
		else System.out.println("longitud correcta");
	}

}
