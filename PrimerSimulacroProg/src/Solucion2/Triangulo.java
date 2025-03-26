package Solucion2;

public class Triangulo extends Figura2D {

//Atributos.
double aLongitud, bLongitud, cLongitud;

//Constructor con parámetros
public Triangulo(String nombre, double aLongitud, double bLongitud, double cLongitud) {
	super(nombre);
	this.aLongitud = aLongitud;
	this.bLongitud = bLongitud;
	this.cLongitud = cLongitud;
}

//Getters y setters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getaLongitud() {
	return aLongitud;
}
public void setaLongitud(double aLongitud) {
	this.aLongitud = aLongitud;
}
public double getbLongitud() {
	return bLongitud;
}
public void setbLongitud(double bLongitud) {
	this.bLongitud = bLongitud;
}
public double getcLongitud() {
	return cLongitud;
}
public void setcLongitud(double cLongitud) {
	this.cLongitud = cLongitud;
}

//Calculamos perímetro
public double calcularPerimetro() {
    return aLongitud + bLongitud + cLongitud;
}

public String toString() {
    return "Triángulo nombre=" + nombre + ", lado1=" + aLongitud + ", lado2=" + bLongitud + ", lado3=" + cLongitud + "";
}
	

}
