package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.*;
public class Main {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 1; i <= 3; i++) {
	            Pizza pizza = new Pizza();

	            System.out.println("** Pizza " + i + " **");
	            System.out.println("Ingrese el diámetro (20, 30 o 40):");
	            pizza.setDiametro(sc.nextInt());

	            System.out.println("¿Lleva ingredientes especiales? (true/false):");
	            pizza.setIngredientesEspeciales(sc.nextBoolean());

	            pizza.calcularPrecio();
	            pizza.calcularArea();

	            System.out.println("Diámetro = " + pizza.getDiametro());
	            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
	            System.out.println("Precio Pizza = $" + pizza.getPrecio());
	            System.out.println("Área de la pizza = " + pizza.getArea());
	        }

	        sc.close();
	}

}
