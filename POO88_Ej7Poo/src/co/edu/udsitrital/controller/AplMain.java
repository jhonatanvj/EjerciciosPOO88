package co.edu.udsitrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int a, b, c;
		do {
			System.out.println("Escriba el primer numero de un digito: ");
			a = leer.nextInt();
			leer.nextLine();
			System.out.println("Escriba el segundo numero de un digito: ");
			b = leer.nextInt();
			leer.nextLine();
			System.out.println("Escriba el tercer numero de un digito: ");
			c = leer.nextInt();
			leer.nextLine();
		} while (a > 10 || b > 10 || c > 10);

		int x = a * 100 + b * 10 + c;
		System.out.println("Los tres numeros son: " + x);
		leer.close();

	}

}
