package Clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import BaseDatos.Conexion;
import BaseDatos.GestionBD;


public class principal {

	public static void main(String[] args) {
		int opcion;
		System.out.println("Bienvenido a mi programa");
		Gestion g = new Gestion();
		
		do {
			opcion=g.menuPrincipal();
			switch(opcion) {
				case 1:g.comprobarUsuario();
					break;
				case 2:g.insertarUsuario();
					break;
				case 3:g.eliminarUsuario();
					break;
				default: System.out.println("Opcion incorrecta");
			}
		}while (opcion!=4);
		
	}	
}
