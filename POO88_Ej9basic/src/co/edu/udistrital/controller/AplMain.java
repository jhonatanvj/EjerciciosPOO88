package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double kilos, gramos, libras, toneladas;

		System.out.println("Ingrese la cantidad de kilos de una persona: ");
		kilos = leer.nextDouble();
		gramos = kilos * 1000;
		libras = kilos * 2.205;
		toneladas = kilos / 1000;
		System.out.println("El valor de " + kilos + " a gramos es: " + gramos);
		System.out.println("El valor de " + kilos + " a libras es: " + libras);
		System.out.println("El valor de " + kilos + " a toneladas es: " + toneladas);

		leer.close();
	}

}
