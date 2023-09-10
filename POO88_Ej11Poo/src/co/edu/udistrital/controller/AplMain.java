package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Plano;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Plano cartesiano1 = new Plano();

		System.out.println("Ingrese los valores del primer punto");
		System.out.println("X1:");
		cartesiano1.setX1(leer.nextDouble());
		System.out.println("Y1:");
		cartesiano1.setY1(leer.nextDouble());
		System.out.println("Ingrese los valores del segundo punto");
		System.out.println("X2:");
		cartesiano1.setX2(leer.nextDouble());
		System.out.println("Y2:");
		cartesiano1.setY2(leer.nextDouble());

		cartesiano1.calcularDistancia();
		leer.close();
	}

}
