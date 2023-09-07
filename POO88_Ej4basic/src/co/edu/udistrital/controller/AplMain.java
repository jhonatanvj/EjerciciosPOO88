package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de pesos colombianos que quiere cambiar: ");
		double pesos = leer.nextDouble();

		double dolar = pesos / 2950;
		double euro = pesos / 3450;
		System.out.println(pesos + " pesos colombianos son: " + dolar);
		System.out.println(pesos + " pesos colombianos son: " + euro);
		leer.close();

	}

}
