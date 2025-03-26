package Solucion2;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		
		//Se crea ArrayList de tipo Figuras2D
		ArrayList<Figura2D> array = new ArrayList<>();
		
		//Se crean objetos de cada figura y se añaden al arraylist
		Circulo c1=new Circulo("Circulo", 5);
		Triangulo t1= new Triangulo("Triangulo", 10, 6, 4);
		Rectangulo r1=new Rectangulo("Rectangulo", 7, 2);
		
		array.add(c1);
		array.add(t1);
		array.add(r1);
		
		//Se recorre Arraylist con un foreach
		for (Figura2D item : array) {
			System.out.println("Nombre: " + item.getNombre() + ", Perímetro: " + item.calcularPerimetro());
			
		}
		
	}

}
