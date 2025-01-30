//Sumar y multiplicar números hasta que el usuario introduzca un 0 por teclado.
import java.util.Scanner;
public class EjercicioSumarMultiplicar {

	public static void main(String[] args) {
		// Declaración de variables
		int sumaNumeros=0, num, productoNumeros=1;
		boolean seguir=true;
		Scanner sc = new Scanner(System.in);
		/*do {
			System.out.print("Introduzca el numero: ");
			num=sc.nextInt();
			if(num!=0) {
				sumaNumeros+=num;
				productoNumeros*=num;
			}
		} while(num!=0);*/
		
		while(seguir) {
			System.out.print("Introduzca el numero: ");
			num=sc.nextInt();
			if(num!=0) {
				sumaNumeros+=num;
				productoNumeros*=num;
			}
			else seguir=false;
		} 
		System.out.println("La suma de los numeros es: "+sumaNumeros);
		System.out.println("El producto de los numeros es: "+productoNumeros);
	}

}
