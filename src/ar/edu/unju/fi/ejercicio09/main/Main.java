package ar.edu.unju.fi.ejercicio09.main;
import java.util.*;
import ar.edu.unju.fi.ejercicio09.model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Producto producto = new Producto();

            System.out.println("Ingrese el nombre del producto " + i + ":");
            producto.setNombre(sc.next());

            System.out.println("Ingrese el código del producto " + i + ":");
            producto.setCodigo(sc.next());

            System.out.println("Ingrese el precio del producto " + i + ":");
            producto.setPrecio(sc.nextDouble());

            System.out.println("Ingrese el descuento del producto " + i + " (entre 0 y 50):");
            producto.setDescuento(sc.nextInt());

            System.out.println("Producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.calcularDescuento());
        	}

        sc.close();
		}
	}

