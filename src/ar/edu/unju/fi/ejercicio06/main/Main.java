package ar.edu.unju.fi.ejercicio06.main;

	import ar.edu.unju.fi.ejercicio06.model.*;
	import java.time.LocalDate;
	import java.util.Scanner;

	public class Main {
	   
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Creación de objeto con constructor por defecto
	        Persona persona1 = new Persona("12345678A", "Juan", LocalDate.of(1990, 5, 15), "Jujuy");
	        System.out.println("Datos para Persona 1:");
	        persona1.mostrarDatos();

	        // Creación de objeto con constructor parametrizado
	        System.out.println("\nDatos para Persona 2:");
	        System.out.print("Ingrese DNI: ");
	        String dni = scanner.next();
	        System.out.print("Ingrese Nombre: ");
	        String nombre = scanner.next();
	        System.out.print("Ingrese Fecha de Nacimiento (yyyy-mm-dd): ");
	        LocalDate fechaNacimiento = LocalDate.parse(scanner.next());
	        Persona persona2 = new Persona(dni, nombre, fechaNacimiento);
	        persona2.mostrarDatos();

	        // Creación de objeto con constructor para dni, nombre y fecha de nacimiento
	        System.out.println("\nDatos para Persona 3:");
	        System.out.print("Ingrese DNI: ");
	        dni = scanner.next();
	        System.out.print("Ingrese Nombre: ");
	        nombre = scanner.next();
	        System.out.print("Ingrese Fecha de Nacimiento (yyyy-mm-dd): ");
	        fechaNacimiento = LocalDate.parse(scanner.next());
	        Persona persona3 = new Persona (dni, nombre, fechaNacimiento);
	        persona3.mostrarDatos();

	        scanner.close();
	    }
	}

