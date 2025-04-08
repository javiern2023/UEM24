package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import BaseDatos.Conexion;
import BaseDatos.GestionBD;

public class Gestion {
	protected String dni, pass;
	private Scanner sc = new Scanner (System.in);
	private Conexion cn;
	private Connection con;
	private GestionBD gbd;
	
	protected Gestion() {
		
	}
	
	protected int menuPrincipal() {
		int opcion;
		System.out.println("Menu de opciones");
		System.out.println("1.- Buscar");
		System.out.println("2.- Insertar");
		System.out.println("3.- Eliminar");
		System.out.println("4.- Salir");
		opcion=sc.nextInt();
		return opcion;
	}
	
	
	protected void comprobarUsuario() {
		System.out.print("Dime tu dni: ");
		dni=sc.next();
		System.out.print("Dime tu contraseña: ");
		pass=sc.next();
		
		cn = new Conexion();
		gbd=new GestionBD();
		try {
			if (gbd.comprobarUsuario(dni,pass)){
					System.out.println("Bienvenido al curso");
			}
			else{
				System.out.println("Usuario o contraseña incorrecto");	
			}
						
		} catch (HeadlessException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	protected void insertarUsuario() {
		System.out.print("Dime tu dni: ");
		dni=sc.next();
		System.out.print("Dime tu contraseña: ");
		pass=sc.next();
		
		cn = new Conexion();
		gbd=new GestionBD();
		try {
			if (gbd.comprobarUsuario(dni,pass)){
				System.out.println("Ya existe el usuario");	
			}
			else{
				if(gbd.insertarUsuario(dni, pass)) {
					System.out.println("Usuario insertado correctamente");
				}
				else System.out.println("Error, no se pudo insertar");
					
			}
						
		} catch (HeadlessException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	protected void eliminarUsuario() {
		System.out.print("Dime tu dni: ");
		dni=sc.next();
		System.out.print("Dime tu contraseña: ");
		pass=sc.next();
		
		cn = new Conexion();
		gbd=new GestionBD();
		try {
			if (gbd.comprobarUsuario(dni,pass)){
				if(gbd.eliminarUsuario(dni)==1) {
					System.out.println("Usuario eliminado");
				}
				else System.out.println("Error, no se pudo eliminar el usuario");
			}
			else{
				System.out.println("Usuario o contraseña incorrecto");	
			}
						
		} catch (HeadlessException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}	

