package ConcesionarioCoches;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		String matricula, marca, modelo, color;
		double precio;
		Scanner sc = new Scanner(System.in);
		ArrayList <Vehiculo> arrayVehiculos = new ArrayList <Vehiculo> ();
		
		do {
			System.out.println("1.- Insertar");
			System.out.println("2.- Mostrar todos los vehiculos");
			System.out.println("3.- Mostrar un vehiculo");
			System.out.println("4.- Salir");
			opcion=sc.nextInt();
			switch(opcion) {
				case 1: System.out.print("Dime la matricula: ");
						matricula=sc.next();
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
					break;
				case 2: for(Vehiculo v:arrayVehiculos) {
							System.out.println("Matricula: "+v.getMatricula());
							System.out.println("Marca: "+v.getMarca());
							System.out.println("Modelo: "+v.getModelo());
							System.out.println("Color: "+v.getColor());
							System.out.println("Precio: "+v.getPrecio());
							System.out.println();
						}
					break;
				case 3: System.out.print("Dime la matricula: ");
						matricula=sc.next();
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
					break;
				case 4: System.out.println("Hasta pronto");
					break;	
				default: System.out.println("Opción incorrecta");
			}
		}while (opcion!=4);
		
		

	}

}
