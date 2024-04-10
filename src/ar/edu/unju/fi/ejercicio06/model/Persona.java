package ar.edu.unju.fi.ejercicio06.model;
import java.time.LocalDate;

public class Persona {
	 	private String dni;
	    private String nombre;
	    private LocalDate fechaNacimiento;
	    private String provincia;
public Persona() {
}
public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.provincia = provincia;
}
public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNacimiento = fechaNacimiento;
    this.provincia = "Jujuy";
}

public int calcularEdad() {
    return LocalDate.now().getYear() - fechaNacimiento.getYear();
}

public boolean esMayorEdad() {
    return calcularEdad() >= 18;
}

public void mostrarDatos() {
    System.out.println("DNI: " + dni);
    System.out.println("Nombre: " + nombre);
    System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    System.out.println("Provincia: " + provincia);
    
    int edad = calcularEdad();
    System.out.println("Edad: " + edad);
    
    if (esMayorEdad()) {
        System.out.println("La persona es mayor de edad");
    } else {
        System.out.println("La persona no es mayor de edad");
    	}
	}
}