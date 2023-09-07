package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Persona;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Persona a = new Persona();
		System.out.println("Ingrese el valor del prestamo: ");
		a.setPrestamo(leer.nextDouble());
		a.sacarResultado();
		leer.close();

	}

}
