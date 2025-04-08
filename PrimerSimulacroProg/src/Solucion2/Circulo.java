package Solucion2;

public class Circulo extends Figura2D {

//Atributo
double radio;

//Constructor con parámetros
public Circulo(String nombre, double radio) {
	super(nombre);
	this.radio = radio;
}

//Getters & Setters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}

//Calculamos perímetro
public double calcularPerimetro() {
    return 2 * Math.PI * radio;
}

public String toString() {
    return "Círculo nombre=" + nombre + ", radio=" + radio + "";
}

}
