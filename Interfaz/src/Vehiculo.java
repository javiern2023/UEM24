//package ejemploAbstractaInterfaz;

public abstract class Vehiculo {
	protected String matricula;

	protected Vehiculo(String matricula) {
		this.matricula = matricula;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	abstract protected String comprobarMatricula();
	
}
