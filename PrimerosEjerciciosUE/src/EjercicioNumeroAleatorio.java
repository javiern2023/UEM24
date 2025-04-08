// Adivinar el número. El usuario introduce un número y mostramos si lo ha
// adivinado o no.

import java.util.Random;
import java.util.Scanner;

public class EjercicioNumeroAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		// Crear una instancia de Random
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 49 (incluyendo ambos extremos)
        int numeroAleatorio = random.nextInt(49) + 1;
	    //do {    
        	do {
	        	 System.out.print("Introduce tú numero del 1 al 49: ");
	             num=sc.nextInt();
	             if(num<1 || num>49) {
	            	 System.out.println("Introduce bien el numero");
	             }
	        }while(num<1 || num>49);
	    
        
	        if(num==numeroAleatorio) System.out.println("Enhorabuena has ganado el premio");
	        else System.out.println("Lo siento mucho, sigue jugando");
	        
	        System.out.println("Numero jugado "+num);
	        System.out.println("Numero aleatorio "+numeroAleatorio);
	        System.out.println("Quieres seguir o no");
	        
	    //} while(seguir);     

	}

}
