package ejercicioEmpleados;

public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("David", 2000);
        empleados[1] = new EmpleadoPorHoras("Javier", 2300, 160, 15);

        for (Empleado emp : empleados) {
            emp.mostrarInformacion();
            if (emp instanceof Beneficios) {
                System.out.println("Beneficios: " + ((Beneficios) emp).obtenerBeneficios());
            }
            System.out.println("-----------------------");
        }
        
        
        for (Empleado emp : empleados) {
            if(emp instanceof EmpleadoTiempoCompleto) {
            	((EmpleadoTiempoCompleto) emp).mostrarInformacion();
            	System.out.println("Beneficios: " +((EmpleadoTiempoCompleto) emp).obtenerBeneficios());
            }
            
            if(emp instanceof EmpleadoPorHoras) {
            	((EmpleadoPorHoras) emp).mostrarInformacion();
            
            	System.out.println("Beneficios: " +((EmpleadoPorHoras) emp).obtenerBeneficios());
            }
     
            System.out.println("-----------------------");
        }
       

	}

}
