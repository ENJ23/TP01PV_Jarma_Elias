package ar.edu.unju.fi.ejercicio16;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		String [] arreglo = new String [5];
		int iterador = 0;
		
		 for (int i = 0; i < arreglo.length; i++) {
	            System.out.print("Ingrese un nombre para la posicion " + i + ": ");
	            arreglo[i] = scanner.next();
	        }
		 
		 while (iterador < arreglo.length) {
			 System.out.println("Valor para el arreglo en la posición "+iterador+": "+arreglo[iterador]);
			 iterador++;
			 
		 }
		 
		 int tamaño = arreglo.length;
		 System.out.println("El tamaño del arreglo es: "+tamaño);
		 byte indiceEliminar = 0;
		 do {
			 System.out.println("Ingrese el indice a eliminar (0-4): ");
			 indiceEliminar = scanner.nextByte();
		 }	while (indiceEliminar < 0 || indiceEliminar >= arreglo.length);
		 
		 for (int i = indiceEliminar; i < arreglo.length - 1; i++) {
	            arreglo[i] = arreglo[i + 1];
	        }
	        arreglo[arreglo.length - 1] = "";
		 
	        System.out.println("Array después de eliminar el elemento:");
	       for (int i = 0; i < arreglo.length; i++) {
	    	   System.out.println("Arreglo en posicion "+i+": "+arreglo[i]);
	       }
		 scanner.close();
	}
}
