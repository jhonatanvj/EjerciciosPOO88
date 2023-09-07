package co.edu.udistrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.Moneda;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Moneda a=new Moneda();
		System.out.println("Ingrese la cantidad de pesos colombianos que quiere cambiar: ");
		a.setValor(leer.nextDouble());
		a.conversionmoneda();
		leer.close();

	}

}
