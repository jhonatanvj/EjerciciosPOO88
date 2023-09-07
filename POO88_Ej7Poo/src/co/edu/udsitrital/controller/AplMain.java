package co.edu.udsitrital.controller;

import java.util.Scanner;

import co.edu.udistrital.model.NumeroFinal;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		NumeroFinal n1 = new NumeroFinal();
		do {
			System.out.println("Escriba el primer numero de un digito: ");
			n1.setA(leer.nextInt());
			leer.nextLine();
			System.out.println("Escriba el segundo numero de un digito: ");
			n1.setB(leer.nextInt());
			leer.nextLine();
			System.out.println("Escriba el tercer numero de un digito: ");
			n1.setC(leer.nextInt());
			leer.nextLine();
			if(n1.comprobar()==true) {
				System.out.println("Error numeros incorrectos");
			}
		}while (n1.comprobar() == true);

		n1.unionNumeros();
		System.out.println("Los tres numeros son: " + n1.getX());
		leer.close();

	}

}
