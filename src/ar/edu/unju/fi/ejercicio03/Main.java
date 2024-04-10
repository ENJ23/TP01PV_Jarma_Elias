package ar.edu.unju.fi.ejercicio03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; 
		Scanner scanner = new Scanner (System.in);
		System.out.print("Por favor, ingrese un número");
		num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número ingresado es par. El triple del número es: " + (num * 3));
        } else {
        	System.out.println("El número ingresado es impar. El doble del número es: " + (num * 2));
        	scanner.close();
        	}
    	}
	}
