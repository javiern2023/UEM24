
	package EjerciciosArrays;
	import java.util.Scanner;
	import java.util.ArrayList;

	public class MenuVehiculos {
		private  ArrayList<String> vehiculos = new ArrayList<>();		
		public static void main(String[] args) {
			//creamos objeto de programa
			MenuVehiculos app = new MenuVehiculos();
			Scanner scanner = new Scanner(System.in);
			
			
			int opcion;
			// menu do-while primero se ejecuta el bloque y luego las condiciones.
			  do {
				  System.out.println("\nMenú: ");
				  System.out.println("1. Insertar vehículo");
				  System.out.println("2. Eliminar vehículo");
				  System.out.println("3. Modificar vehículo");
				  System.out.println("4. Salir");
				  System.out.println("5. Mostrar vehículos disponibles");
				  System.out.println("6. Vender vehícolo");
				  System.out.println("7. Mostrar vehículos vendidos");
				  System.out.println("8. Mostrar vehículo por cliente");
				  System.out.println("Seleccione una opción: ");
				  opcion = scanner.nextInt();
				  scanner.nextLine();//Limpieza del buffer
				  //Manejar una llamada de usuario con switch(expresión) con case (valor de caso)
				  	switch (opcion) {
				  	case 1:
				  		app.insertarVehiculo(scanner);// llamado al método de inserción
				  		break;
				  	case 2: 
				  		app.eliminarVehiculo(scanner);// llamado al método de eliminación
				  		break;
				  	case 3:
				  		app.modificarVehiculo(scanner);// llamado al método de modificación
				  		break;
				  	case 4:
				  		System.out.println("Saliendo del programa...");
				  		break;
				  	case 5:
				  		app.mostrarVehiculos();
				  		break;
				  	case 6:
				  		app.venderVehiculo(scanner);
				  		break;
				  	case 7:
				  		app.mostrarVendidos();
				  		break;
				  	case 8:
				  		app.mostrarPorCliente(scanner);
				  		break;
				  		default:
				  			System.out.println("Opción no válida. Intente de nuevo.");
				  	}
				  	} while (opcion != 4); //funcióna asta eligir a salir
				  	
		}
			  //método para ingresar
		
		private void insertarVehiculo(Scanner scanner) {
	
					System.out.print("Ingrese la matrícula del vehículo: ");
					String matricula =  scanner.nextLine();
					
					//Comprobar duplicación
					if (vehiculos.contains(matricula)) {
						System.out.println("Error: Este vehículo y está registrado.");
					} else {
						vehiculos.add(matricula); // Añadir a la lista
						System.out.println("Vehículo agregado con éxito.");
					}
			  }
			  // método  para eliminar
			  private  void eliminarVehiculo(Scanner scanner) {
					System.out.print("Ingrese la matrícula del vehículo: ");
					String matricula =  scanner.nextLine();
					// encontrar index
					int index = vehiculos.indexOf(matricula);
					//Comprobar duplicación
					if (index !=-1) {//si se encuentra  
						vehiculos.set(index, null); // reemplazarcon null
						System.out.println("Vehículo eliminado. Espacio dejado vacío.");
					} else {
						System.out.println("Error: No se encontró ningún vehículo con esa matrícula.");
					}
			  }
			// método  para modificar
			  private  void modificarVehiculo(Scanner scanner) {
					System.out.print("Ingrese la matrícula del vehículo a modificar: ");
					String matricula =  scanner.nextLine();
					
					//Comprobar que éxito
					if (vehiculos.contains(matricula)) {// comprobando se la matrícula existe
						System.out.println("Ingrese la nueva matrícula: ");
						String nuevaMatricula = scanner.nextLine();
						//Comprobar dublicación
						if (! nuevaMatricula.equals(matricula)&& vehiculos.contains(nuevaMatricula)) {
							System.out.println("Error: La nueva matrículo ya está registrada.");
					} else {
						vehiculos.set(vehiculos.indexOf(matricula), nuevaMatricula); // cambiar matrícula anterior a nueva matrícula
						System.out.println("Vehículo modificado con éxito.");
					}
			  } else {
				  System.out.println("Error: No se encontró ningún vehículo con esa matrícula.");
			  }
			  }
			  //mostrar vehículos
			  private  void mostrarVehiculos() {
				  if (vehiculos.isEmpty()) {
					  System.out.println("No hay vehículos disponibles");
				  }else {
					  System.out.println("\nLista de vehículos disponibles: ");
					  for (int i=0; i< vehiculos.size(); i++) {
						  if (vehiculos.get(i)== null) {//.get(i) devolverá null
							  System.out.println("- Espacio vacío");//podemos indicar un espacio, pero en caso de evitarlo,para que usuario no se confunda, escribimos con letras.
						  }else {
							  System.out.println("- "+vehiculos.get(i));
						  }
						  
					  }
					  
				  }
			  }
			  //mostrar vehiculos que se venden
			  private  ArrayList<String> vendidos = new ArrayList<>();
			  private  void venderVehiculo(Scanner scanner){
				  System.out.println("Ingrese la matrícula del vehículo a vender: ");
				  String matricula = scanner.nextLine();
				  
				  if (vehiculos.contains(matricula)) {// si vehículo exito
				  System.out.println("Ingrese el DNI del cliente: ");
				  String dni = scanner.nextLine();
				  
				  vendidos.add(matricula);// añadir vehículo a lista de vendido
				  clientes.add(dni);//añadir cliente 
				  vehiculos.remove(matricula);//eliminamos vehícilo
				  System.out.println("Vehículo vendido con éxito.");
				  }else{ //si vehícula no encontrada
				  System.out.println("Error: No se encontró ningún vehículo con esa matrícula.");  
				  }
			  }
			private void mostrarVendidos() {
				if (vendidos.isEmpty()) {
					System.out.println("No hay vehículos vendidos.");
				}else {
					System.out.println("\nLista de vehículos vendidos:");
					for (int i=0; i< vendidos.size(); i++){						System.out.println("- "+ vendidos.get(i) + " (Cliente: " + clientes.get(i)+")");
						
				}
				
				}
			}
			//CLIENTES
			private  ArrayList<String> clientes = new ArrayList<>();
	private  void mostrarPorCliente(Scanner scanner) {
		System.out.println("Ingrese el DNI del cliente: ");
		String dni = scanner.nextLine();
		boolean encontrado = false; //variable para el seguimiento de la disponibilidad de la vehículo.
		System.out.println("\nVehículos asociados al cliente "+ dni + ":");
		for (int i=0; i< clientes.size(); i++) {//valor de retorno siempre el número de elementos, independiente del tipo de datos dentro de la colección.
			if (clientes.get(i).equals(dni)) {//comprobando si el cliente está conectado a la vehículo.
				System.out.println("- "+vendidos.get(i));//recupera un elemento de la lista de vendidos por índice.
				encontrado = true;
			}
		}
		if (!encontrado) {//si no encontramos, vemos un texto...
			System.out.println("No se encontraron vehículos asociados a este cliente.");
		}
	}
	}
		
