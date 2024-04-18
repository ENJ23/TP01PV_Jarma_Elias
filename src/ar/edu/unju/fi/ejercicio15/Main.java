package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int numero = 0;
		
		while (numero < 5 || numero > 10) {
			System.out.println("Ingrese un numero para determinar el espacio del arreglo en el rango [5,10]: ");
			numero = scanner.nextInt();
			if (numero < 5 || numero > 10) {
				System.out.println("Valor fuera de rango");
			}
		}
		
		String[] arreglo = new String [numero]; 
		//corregir
		 for (int i = 0; i < arreglo.length; i++) {
	            System.out.print("Ingrese un número entero para la posición " + i + ": ");
	            arreglo[i] = scanner.next();
	        }
		 
	        System.out.println("Valores almacenados en el array:");
	        for (int i = arreglo.length - 1 ; i >= 0; i--) {
	            System.out.println("Índice " + i + ": " + arreglo[i]);
	            scanner.close();
	        }

	
	}

}
