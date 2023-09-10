package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		double pollos;
		double vacas;
		double totalpatas;
		double totalanimales;
		
		System.out.println("Ingrese la cantidad de animales: ");
		totalanimales=leer.nextDouble();
		System.out.println("Ingrese el numero de patas: ");
		totalpatas=leer.nextDouble();

		vacas = (totalpatas - (totalanimales * 2)) / 2;
		pollos = totalanimales - vacas;

		if (pollos >= 0 && vacas >= 0) {
			System.out.println("Número de pollos: " + pollos);
			System.out.println("Número de vacas: " + vacas);
		} else {
			System.out.println("No se encontró una solución válida.");
		}
		
		leer.close();

	}

}
