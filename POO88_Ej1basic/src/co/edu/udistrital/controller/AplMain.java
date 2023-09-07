package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double radio, altura, volumen;

		System.out.println("Ingrese el radio del cilindro: ");
		radio = leer.nextDouble();
		System.out.println("Ingrese la altura del cilindo: ");
		altura = leer.nextDouble();
		volumen = ((Math.PI) * (Math.pow(radio, 2)) * (altura));
		System.out.println("El volumen del cilindro es: " + volumen);

		leer.close();

	}

}
