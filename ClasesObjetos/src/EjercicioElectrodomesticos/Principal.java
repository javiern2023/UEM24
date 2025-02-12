package EjercicioElectrodomesticos;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		imprimirPantalla ip = new imprimirPantalla();
		Gestion g = new Gestion();
		do {
			opcion=ip.menuPrincipal();
			g.menuPrincipal(opcion);
		} while (opcion!=3);
		

	}
	
}
