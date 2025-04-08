//package ejemploAbstractaInterfaz;

public class Coche extends Vehiculo implements Vehiculo2{
	protected String color;

	protected Coche(String matricula, String color) {
		super(matricula);
		this.color = color;
	}

	

	@Override
	public double devolverPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String mostrarBastidor() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	protected String comprobarMatricula() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
