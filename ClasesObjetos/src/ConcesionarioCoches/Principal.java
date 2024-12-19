package ConcesionarioCoches;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		gestion();
	}

	public static void gestion() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		ArrayList <Vehiculo> arrayVehiculos = new ArrayList <Vehiculo> ();
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1: insertarVehiculo(sc,arrayVehiculos);
					break;
				case 2: mostrarVehiculos(arrayVehiculos);
					break;
				case 3: mostrarUnVehiculo(sc,arrayVehiculos);
					break;
				case 4: System.out.println("Hasta pronto");
					break;	
				default: System.out.println("Opción incorrecta");
			}
		}while (opcion!=4);
	}
	
	public static void mostrarMenu() {
		System.out.println("1.- Insertar");
		System.out.println("2.- Mostrar todos los vehiculos");
		System.out.println("3.- Mostrar un vehiculo");
		System.out.println("4.- Salir");
	}
	
	public static void insertarVehiculo(Scanner sc, ArrayList<Vehiculo> arrayVehiculos) {
		String matricula, marca, modelo, color;
		double precio;
		System.out.print("Dime la matricula: ");
		matricula=sc.next();
		if(!existeVehiculo(matricula,arrayVehiculos)) {
			System.out.print("Dime la marca: ");
			marca=sc.next();
			System.out.print("Dime el modelo: ");
			modelo=sc.next();
			System.out.print("Dime el color: ");
			color=sc.next();
			System.out.print("Dime el precio: ");
			precio=sc.nextDouble();
			Vehiculo vh = new Vehiculo(matricula,marca,modelo,color,precio);
			arrayVehiculos.add(vh);
		}
		else System.out.println("El vehiculo ya está insertado");
	}
	
	public static boolean existeVehiculo(String matricula, ArrayList<Vehiculo> arrayVehiculos) {
		boolean encontrado=false;
		for(Vehiculo v:arrayVehiculos) {
			if(v.getMatricula().equals(matricula)) {
				encontrado=true;
				break;
			}
		}
		return encontrado;
	}
	
	public static void mostrarVehiculos(ArrayList<Vehiculo> arrayVehiculos) {
		for(Vehiculo v:arrayVehiculos) {
			System.out.println("Matricula: "+v.getMatricula());
			System.out.println("Marca: "+v.getMarca());
			System.out.println("Modelo: "+v.getModelo());
			System.out.println("Color: "+v.getColor());
			System.out.println("Precio: "+v.getPrecio());
			System.out.println();
		}
	}
	
	public static void mostrarUnVehiculo(Scanner sc, ArrayList<Vehiculo> arrayVehiculos) {
		System.out.print("Dime la matricula: ");
		String matricula=sc.next();
		boolean encontrado=false;
		for(Vehiculo v:arrayVehiculos) {
			if(v.getMatricula().equals(matricula)) {
				System.out.println("Matricula: "+v.getMatricula());
				System.out.println("Marca: "+v.getMarca());
				System.out.println("Modelo: "+v.getModelo());
				System.out.println("Color: "+v.getColor());
				System.out.println("Precio: "+v.getPrecio());
				System.out.println();
				encontrado=true;
				break;
			}
		}
		if(!encontrado) System.out.println("Vehiculo no encontrado");
	}
}
