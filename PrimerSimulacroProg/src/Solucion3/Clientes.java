package Solucion3;
import java.util.ArrayList;

public class Clientes extends Usuarios{

	protected ArrayList<Articulos>listaPrestamos = new ArrayList<Articulos>();
	
	
	public Clientes() {
		super();
	}
	
	public Clientes(String nombre, String dni) {
		super(nombre, dni);
	}

	protected ArrayList<Articulos> getListaPrestamos() {
		return listaPrestamos;
	}

	protected void setListaPrestamos(ArrayList<Articulos> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}
	
	public Articulos busquedaArticulo(String numeroArticulo) {
		for (Articulos a : listaPrestamos) {
			if (a.getNumeroArticulo().equals(numeroArticulo)) {
				listaPrestamos.remove(a);
				return a;
			}
		}
		return null;
	}
	
	public void comprobarLista(String numeroArticulo) {
		for (Articulos a : listaPrestamos) {
			if (a.getNumeroArticulo().equals(numeroArticulo)) {
				System.out.println(a.getNombre());
			} else {
				System.out.println("Articulo no enconctrado");
			}
		
	   }
		
      }
   }
