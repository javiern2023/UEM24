package Calculadora;

public class Operaciones {
	//Sobrecarga
	protected double valor1, valor2, valor3, valor4, resultado;
	
	protected void sumar(double v1, double v2) {
		resultado = v1+v2;
	}
	
	protected void sumar(int v1, double v2) {
		
	}
	protected void sumar(double v1, double v2, double v3) {
		resultado = v1+v2+v3;
	}
	
	protected void sumar(double v1, double v2, double v3, double v4) {
		resultado = v1+v2+v3+v4;
	}
}
