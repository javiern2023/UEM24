import java.util.Scanner;

public class VentaEntradas {
    public static void main(String[] args) {

        int opciones;
        Scanner sc = new Scanner(System.in);
        int filas = 9;
        int columnas = 9;
        int asientos[][] = new int[filas][columnas];
        int filaCompra;
        int columnaCompra;
        int entradas;

        GenerarPanel(asientos, filas, columnas);

        do {
            mostrarMenuGeneral();
            opciones = sc.nextInt();

            switch (opciones) {

                case 1:
                    System.out.println("¿Cuántas entradas deseas comprar?");
                    entradas = sc.nextInt();

                    for (int i = 0; i < entradas; i++) {
                        System.out.println("Compra de entrada " + (i + 1));
                        System.out.println("1->Ocupado | 0->Libre");
                        ImprimirPanel(asientos, filas, columnas);
                        System.out.println("¿En que fila la deseas?");
                        filaCompra = sc.nextInt();
                        while (filaCompra>8){
                        System.out.println("Fila no existente");
                        System.out.println("¿En que fila la deseas?");
                        filaCompra = sc.nextInt();
                        }
                        System.out.println("¿En que columna la deseas?");
                        columnaCompra = sc.nextInt();
                        while (columnaCompra>8){
                            System.out.println("Columna no existente");
                            System.out.println("¿En que columna la deseas?");
                            columnaCompra = sc.nextInt();
                        }
                       

                        if (ComprobarAsientos(asientos, filaCompra, columnaCompra)) {
                            asientos[filaCompra][columnaCompra] = 1; 
                            System.out.println("Asiento reservado con exito");
                        } else {
                            System.out.println("Asiento ocupado, por favor elige otro");
                            i--; 
                        }
                    }
                    break;

                case 2:
                    System.out.println("Estado actual de los asientos:");
                    ImprimirPanel(asientos, filas, columnas);
                    break;

                case 3:
                    System.out.println("¿Cuántas entradas deseas devolver?");
                    entradas = sc.nextInt();

                    for (int i = 0; i < entradas; i++) {
                        System.out.println("Devolución de entrada " + (i + 1));
                        System.out.println("1->Ocupado | 0->Libre");
                        ImprimirPanel(asientos, filas, columnas);
                        System.out.println("Dime la fila en la que se encuentra tu entrada:");
                        filaCompra = sc.nextInt();
                        while (filaCompra>8){
                            System.out.println("Fila no existente");
                            System.out.println("¿En que fila la deseas?");
                            filaCompra = sc.nextInt();
                            }
                        System.out.println("Dime la columna en la que se encuentra tu entrada:");
                        columnaCompra = sc.nextInt();
                        while (columnaCompra>8){
                            System.out.println("Columna no existente");
                            System.out.println("¿En que columna la deseas?");
                            columnaCompra = sc.nextInt();
                        }
                        
                   

                        if (!ComprobarAsientos(asientos, filaCompra, columnaCompra)) {
                            asientos[filaCompra][columnaCompra] = 0;
                            System.out.println("Entrada cancelada con exito.");
                        } else {
                            System.out.println("Ese asiento no está reservado.");
                            i--; 
                        }
                    }
                    break;

                case 4:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Seleccione una opción correcta.");
            }

        } while (opciones != 4);
    }

    public static void mostrarMenuGeneral() {
        System.out.println("Menu de opciones");
        System.out.println("1.- Comprar entradas");
        System.out.println("2.- Ver entradas");
        System.out.println("3.- Devolver entradas");
        System.out.println("4.- Salir");
    }

    public static void GenerarPanel(int asientos[][], int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = 0; 
            }
        }
    }

    public static void ImprimirPanel(int asientos[][], int filas, int columnas) {
        int contador = -1;
        System.out.println("0 1 2 3 4 5 6 7 8");
        System.out.println("-----------------");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            contador ++;
            System.out.println(" " + contador);
            

        }
    }

    public static boolean ComprobarAsientos(int asientos[][], int filaCompra, int columnaCompra) {
        return asientos[filaCompra][columnaCompra] == 0;
    }
}