package ClasesObjetos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Persona p = new Persona();
		System.out.println("El dni de la persona p es: "+p.getDni());
		p.setDni("234T");
		System.out.println("El dni de la persona p es: "+p.getDni());
		
		Persona p1 = new Persona("987T");
		System.out.println("El dni de la persona p1 es: "+p1.getDni());
		System.out.println("El nombre de la persona p1 es: "+p1.getNombre());
		p1.setNombre("Eduardo");
		System.out.println("El nombre de la persona p1 es: "+p1.getNombre());
		
		Persona p2 = new Persona("9375R", "David");
		System.out.println("El dni de la persona p2 es: "+p2.getDni());
		System.out.println("El nombre de la persona p2 es: "+p2.getNombre());
		
		

	}

}
