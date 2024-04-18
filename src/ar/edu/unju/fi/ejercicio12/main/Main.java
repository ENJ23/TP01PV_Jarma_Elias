package ar.edu.unju.fi.ejercicio12.main;
import ar.edu.unju.fi.ejercicio12.model.*;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

			System.out.print("Ingrese el nombre de la persona: ");
			String nombre = scanner.nextLine();
			
			Calendar fechaNacimiento = Calendar.getInstance();
			System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
			String fechaTexto = scanner.nextLine();
			String[] partesFecha = fechaTexto.split("/");
	        int dia = Integer.parseInt(partesFecha[0]);
	        int mes = Integer.parseInt(partesFecha[1]) - 1; 
	        int anio = Integer.parseInt(partesFecha[2]);

	        fechaNacimiento.set(anio, mes, dia);

			
			Persona persona = new Persona(nombre, fechaNacimiento);
			
			System.out.println("Nombre: " + persona.getNombre());
			System.out.println("Fecha de Nacimiento: " + fechaTexto);
			System.out.println("Edad: " + persona.calcularEdad() + " años");
			System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
			System.out.println("Estación: " + persona.obtenerEstacion());
			scanner.close();
			
		}
	}


