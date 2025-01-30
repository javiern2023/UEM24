
import java.util.ArrayList;
import java.util.Scanner;

class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private boolean ocupada;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupada = false; // Por defecto, la habitación está disponible
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ", $" + precio + "/noche, " +
                (ocupada ? "Ocupada" : "Disponible") + ")";
    }
}

class Reserva {
    private int numeroReserva;
    private String cliente;
    private int numeroHabitacion;
    private int diasEstancia;
    private double costoTotal;

    public Reserva(int numeroReserva, String cliente, int numeroHabitacion, int diasEstancia, double costoTotal) {
        this.numeroReserva = numeroReserva;
        this.cliente = cliente;
        this.numeroHabitacion = numeroHabitacion;
        this.diasEstancia = diasEstancia;
        this.costoTotal = costoTotal;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    @Override
    public String toString() {
        return "Reserva " + numeroReserva + " - Cliente: " + cliente +
                ", Habitación: " + numeroHabitacion +
                ", Días: " + diasEstancia +
                ", Costo Total: $" + costoTotal;
    }
}

public class SistemaReservasHotel {
    private static ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static int numeroReservaActual = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Sistema de Reservas de Hotel ===");
            System.out.println("1. Añadir habitación");
            System.out.println("2. Mostrar todas las habitaciones");
            System.out.println("3. Realizar una reserva");
            System.out.println("4. Cancelar una reserva");
            System.out.println("5. Mostrar todas las reservas");
            System.out.println("6. Consultar habitaciones disponibles");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> agregarHabitacion(scanner);
                case 2 -> mostrarHabitaciones();
                case 3 -> realizarReserva(scanner);
                case 4 -> cancelarReserva(scanner);
                case 5 -> mostrarReservas();
                case 6 -> consultarHabitacionesDisponibles();
                case 7 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void agregarHabitacion(Scanner scanner) {
        System.out.print("Número de habitación: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tipo de habitación (Individual, Doble, Suite): ");
        String tipo = scanner.nextLine();
        System.out.print("Precio por noche: ");
        double precio = scanner.nextDouble();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                System.out.println("La habitación con este número ya existe.");
                return;
            }
        }

        habitaciones.add(new Habitacion(numero, tipo, precio));
        System.out.println("Habitación añadida correctamente.");
    }

    private static void mostrarHabitaciones() {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones registradas.");
            return;
        }

        System.out.println("\n=== Lista de Habitaciones ===");
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }
    }

    private static void realizarReserva(Scanner scanner) {
        System.out.print("Nombre del cliente: ");
        scanner.nextLine(); // Limpiar el buffer
        String cliente = scanner.nextLine();
        System.out.print("Número de habitación: ");
        int numeroHabitacion = scanner.nextInt();
        System.out.print("Días de estancia: ");
        int diasEstancia = scanner.nextInt();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                if (habitacion.isOcupada()) {
                    System.out.println("La habitación está ocupada.");
                    return;
                }

                double costoTotal = diasEstancia * habitacion.getPrecio();
                habitacion.setOcupada(true);
                reservas.add(new Reserva(numeroReservaActual++, cliente, numeroHabitacion, diasEstancia, costoTotal));
                System.out.println("Reserva realizada correctamente.");
                return;
            }
        }

        System.out.println("No se encontró una habitación con ese número.");
    }

    private static void cancelarReserva(Scanner scanner) {
        System.out.print("Número de reserva a cancelar: ");
        int numeroReserva = scanner.nextInt();

        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            if (reserva.getNumeroReserva() == numeroReserva) {
                for (Habitacion habitacion : habitaciones) {
                    if (habitacion.getNumero() == reserva.getNumeroHabitacion()) {
                        habitacion.setOcupada(false);
                        break;
                    }
                }
                reservas.remove(i);
                System.out.println("Reserva cancelada correctamente.");
                return;
            }
        }

        System.out.println("No se encontró una reserva con ese número.");
    }

    private static void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas realizadas.");
            return;
        }

        System.out.println("\n=== Lista de Reservas ===");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    private static void consultarHabitacionesDisponibles() {
        boolean hayDisponibles = false;

        System.out.println("\n=== Habitaciones Disponibles ===");
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.isOcupada()) {
                System.out.println(habitacion);
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay habitaciones disponibles.");
        }
    }
}

