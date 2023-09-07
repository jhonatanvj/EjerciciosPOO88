package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Cilindro;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		Cilindro c1 = new Cilindro();
		System.out.println("Ingrese el radio del cilindro:");
		c1.setRadio(leer.nextDouble());
		System.out.println("Ingrese la altura del cilindro: ");
		c1.setAltura(leer.nextDouble());
		c1.calcularVolumen();
		System.out.println("El volumen del cilindro es: " + c1.getVolumen());

		leer.close();

	}

}
