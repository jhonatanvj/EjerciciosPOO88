package co.edu.udistrital.controller;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el monto presupuestal: ");
		double presu=leer.nextDouble();
		double urgencias=(presu*0.37);
		double pedriatia=(presu*0.42);
		double traumatologia=(presu*0.21);
		System.out.println("El presupuesto de urgencias es de:"+urgencias);
		System.out.println("El presupuesto de predriatia es de:"+pedriatia);
		System.out.println("El presupuesto de traumatologia es de:"+traumatologia);
		leer.close();
		

	}

}
