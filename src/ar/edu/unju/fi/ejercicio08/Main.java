package ar.edu.unju.fi.ejercicio08;
import ar.edu.unju.fi.ejercicio08.Calculadora.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese el valor de n:");
        int valorN = sc.nextInt();

        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(valorN);

        System.out.println("Sumatoria: " + calculadora.calcularSumatoria());
        System.out.println("Productoria: " + calculadora.calcularProductoria());

        sc.close();
	}

}
