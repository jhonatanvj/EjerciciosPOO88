package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double prestamo, interesanio, interesmes, tpagar;

		System.out.print("Ingrese el valor del prestamo: ");
		prestamo = leer.nextDouble();
		interesanio = (prestamo * 27) / 100;
		interesmes = interesanio / 12;
		tpagar = prestamo + interesanio;
		System.out.println("La persona debera pagar mensual: " + interesmes);
		System.out.println("El total a pagar de la persona es: " + tpagar);
		leer.close();

	}

}
