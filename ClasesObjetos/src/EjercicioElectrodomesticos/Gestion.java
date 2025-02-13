package EjercicioElectrodomesticos;

import java.util.ArrayList;

public class Gestion {
	int opcion;
	ArrayList<Electrodomestico> listaElect=new ArrayList<Electrodomestico>();
	imprimirPantalla p = new imprimirPantalla();
	Electrodomestico e;
	
	protected void menuPrincipal(int opcion) {
		switch(opcion) {
			case 1: //opcion=menuAlta();
					darAlta(opcion);
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				
		}
	}
	
	protected void darAlta(int opcion) {
		
	}
	protected void darBaja(int opcion) {
		
	}
}
