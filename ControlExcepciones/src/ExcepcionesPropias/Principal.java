package ExcepcionesPropias;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String telefono = "123456789";  // Número incorrecto (solo 9 dígitos)
        String correo = "usuario@correo"; // Correo incorrecto (falta el dominio)
        Validador v = new Validador();
        Scanner sc = new Scanner(System.in);
        
        /*try {
            v.validarTelefono(telefono);
            System.out.println("Teléfono válido: " + telefono);
        } catch (TelefonoInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            v.validarCorreo(correo);
            System.out.println("Correo válido: " + correo);
        } catch (CorreoInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        }*/
        
         // Validar teléfono
        while (true) {
            System.out.print("Ingrese su número de teléfono (10 dígitos): ");
            telefono = sc.nextLine();
            try {
                v.validarTelefono(telefono);
                System.out.println("Teléfono válido: " + telefono);
                break; // Salir del bucle si es correcto
            } catch (TelefonoInvalidoException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        // Validar correo
        while (true) {
            System.out.print("Ingrese su correo electrónico: ");
            correo = sc.nextLine();
            try {
                v.validarCorreo(correo);
                System.out.println("Correo válido: " + correo);
                break; // Salir del bucle si es correcto
            } catch (CorreoInvalidoException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Datos ingresados correctamente.");
        

	}

}
