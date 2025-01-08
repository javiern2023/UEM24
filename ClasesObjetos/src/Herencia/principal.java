package Herencia;

public class principal {

	public static void main(String[] args) {
		ClasePadre cp = new ClasePadre("Javi","0987");
		System.out.println("Tu nombre es "+cp.getNombre()+" con dni "+cp.getDni());
		
		ClaseHijo ch = new ClaseHijo("Eduardo","3456",23);
		System.out.println("Tu nombre es "+ch.getNombre()+" con dni "+ch.getDni()+", tu edad es "+ch.getEdad());

		ClaseNieto cn = new ClaseNieto("Manu","5638",9,true);
		System.out.println("Tu nombre es "+cn.getNombre());
		System.out.println("Tu edad es "+cn.getEdad());
		System.out.println("¿Eres menor? "+cn.isMenor());
	}

}
