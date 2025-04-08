package ReservaHabitaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
	protected int opcion;
	protected Scanner sc = new Scanner (System.in);
	protected LecturaEscritura le = new LecturaEscritura();
	protected ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
	protected ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
	protected Habitacion hab;
	protected Reserva res;
	
	protected void gestionPrincipal() {
		do {
			opcion=le.mostrarMenuPrincipal();
			switch(opcion) {
				case 1: anadirHabitacion();
					break;
				case 2: mostrarHabitaciones();
					break;
				case 3: realizarReserva();
					break;
				case 4: cancelarReserva();
					break;
				case 5: mostrarReservas();
					break;
				case 6: habitacionesDisponibles();
					break;
				case 7: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opcion del menu incorrecta");
			}
		}while(opcion!=7);
	}
	
	protected void habitacionesDisponibles() {
		for(Habitacion h:listaHabitaciones) {
			if(h.isEstado()==false) {
				System.out.println(h.toString());
			}
		}
		
	}

	protected void cancelarReserva() {
		int reserva, habitacion;
		System.out.println("Dime el numero de reserva a cancelar: ");
		reserva=sc.nextInt();
		for(Reserva r:listaReservas) {
			if(r.getNumero_reserva()==reserva) {
				for(Habitacion h:listaHabitaciones) {
					if(r.getNumero_habitacion()==h.getNumero()) {
						h.setEstado(false);
						listaReservas.remove(r);
						System.out.println("Reserva cancelada correctamente");
						break;
					}
				}
			break;	
			}
		}
		
	}

	protected void mostrarReservas() {
		for(Reserva r:listaReservas) {
			System.out.println(r.toString());
		}
		
	}

	protected void realizarReserva() {
		int numeroHabitacion,diasEstancia, numeroReserva;
		String nombreCliente;
		double precioReserva;
		System.out.println("Dime el numero de la habitacion a reservar: ");
		numeroHabitacion=sc.nextInt();
		for(Habitacion h:listaHabitaciones) {
			if(h.getNumero()==numeroHabitacion && h.isEstado()==false) {
				System.out.println("Dime el nombre del cliente: ");
				nombreCliente=sc.next();
				System.out.println("Dime el numero de dias: ");
				diasEstancia=sc.nextInt();
				System.out.println("Dime el numero de reserva: ");
				numeroReserva=sc.nextInt();
				precioReserva=diasEstancia*h.getPrecio_noche();
				res=new Reserva(numeroReserva,nombreCliente,numeroHabitacion,diasEstancia,precioReserva);
				listaReservas.add(res);
				System.out.println("Reserva realizada correctamente");
				h.setEstado(true);
				break;
			}
			else System.out.println("No se puede hacer la reserva de esa habitacion");
		}
	}

	protected void mostrarHabitaciones() {
		for(Habitacion h:listaHabitaciones) {
			System.out.println(h.toString());
		}
	}
	
	protected void anadirHabitacion() {
		int numero;
		String tipo;
		double precio;
		System.out.println("Dime el numero de habitacion que quieres añadir: ");
		numero=sc.nextInt();
		if(!existeHabitacion(numero)) {
			System.out.println("Dime el tipo de habitacion: ");
			tipo=sc.next();
			System.out.println("Dime el precio por noche: ");
			precio = sc.nextDouble();
			hab = new Habitacion(numero,tipo,precio,false);
			listaHabitaciones.add(hab);
		}
		else System.out.println("El numero ya existe, no se puede añadir");
		
	}
	
	protected boolean existeHabitacion(int numero) {
		boolean encontrada=false;
		for(Habitacion h:listaHabitaciones) {
			if(h.getNumero()==numero) {
				encontrada=true;
				break;
			}
		}
		return encontrada;
	}
}
