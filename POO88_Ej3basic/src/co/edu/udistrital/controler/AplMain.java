package co.edu.udistrital.controler;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double km,precio;
		
		System.out.println("Ingrese el numero de kilometros del viaje:");
		km=leer.nextDouble();
		precio=km*120;
		System.out.println("El precio del viaje es: "+precio);
		
		leer.close();

	}

}
