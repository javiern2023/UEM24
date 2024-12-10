
public class principal {

	public static void main(String[] args) {
		
		Persona p0 = new Persona();
		System.out.println("Nombre del objeto p0 "+p0.getNombre());
		p0.setNombre("David");
		System.out.println("Nombre del objeto p0 "+p0.getNombre());
		Persona p1 = new Persona("Javier","05","Navazo","C/ Labastida");

	}

}
