package HerenciaProductos;

public class Principal {

	public static void main(String[] args) {
		Producto p = new Producto("HP","ert","64");
		System.out.println("Memoria del producto "+p.getMemoria());
		
		Portatil po = new Portatil("Lenovo","tyu","128","56");
		System.out.println("Memoria del portatil "+po.getMemoria());
		
		Sobremesa so = new Sobremesa("Toshiba","wsx","256",234);
		System.out.println("Tamaño es "+so.getTamanio());

	}

}
