package EjerciciosArrays;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		// Variables
		int n, sumaAlturas=0, superior=0, inferior=0;
		double media=0;
		Scanner sc = new Scanner(System.in);
		int alturas [];
		
		System.out.print("Dime cuantas personas vas a introducir: ");
		n=sc.nextInt();
		alturas = new int [n];
		
		for(int i=0;i<alturas.length;i++) {
			System.out.print("Dime la altura de la persona: ");
			alturas[i]=sc.nextInt();
		}

		for(int i=0;i<alturas.length;i++) {
			sumaAlturas+=alturas[i];
		}
		media=sumaAlturas/n;
		
		for(int i=0;i<alturas.length;i++) {
			if(alturas[i]<media) inferior++;
			else {
				if(alturas[i]>media) superior++;
			}
				
		}
		System.out.println("La altura media es: "+media);
		System.out.println("La cantidad de personas superiores a la media es: "+superior);
		System.out.println("La cantidad de personas inferiores a la media es: "+inferior);
	}

}
