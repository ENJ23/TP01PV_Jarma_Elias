package ar.edu.unju.fi.ejercicio07.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio07.model.*;
public class Main {

	public static void main (String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese el nombre del empleado:");
	        String nombre = sc.nextLine();

	        System.out.println("Ingrese el legajo del empleado:");
	        int legajo = sc.nextInt();

	        System.out.println("Ingrese el salario del empleado:");
	        double salario = sc.nextDouble();

	        Empleado empleado = new Empleado (nombre, legajo, salario);
	        empleado.mostrarDatos();

	        empleado.darAumento();

	        System.out.println("Después del aumento:");
	        empleado.mostrarDatos();

	        sc.close();
	    }

	}


