package Concesionario;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehiculos vh = new Vehiculos();
		System.out.println("Bastidor: "+vh.getBastidor());
		System.out.println("Dime el bastidor: ");
		vh.setBastidor(sc.next());
		System.out.println("Bastidor: "+vh.getBastidor());
		
		Vehiculos vh1 = new Vehiculos("frt","volvo","s40",23.6);
		System.out.println("Bastidor: "+vh1.getBastidor());
		System.out.println("Marca: "+vh1.getMarca());
		System.out.println("Modelo: "+vh1.getModelo());
		System.out.println("Precio: "+vh1.getPrecio());
		
	}

}
