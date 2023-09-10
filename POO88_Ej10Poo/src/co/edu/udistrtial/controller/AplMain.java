package co.edu.udistrtial.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Granja;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		Granja n1 = new Granja();

		System.out.println("Ingrese la cantidad de animales: ");
		n1.setTotalanimales(leer.nextDouble());
		System.out.println("Ingrese el numero de patas: ");
		n1.setTotalpatas(leer.nextDouble());
		n1.calculoAnimales();

		leer.close();
	}

}
