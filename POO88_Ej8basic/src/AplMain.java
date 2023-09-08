import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		double metros;
		double pies;
		double pulgadas;
	
		System.out.println("Ingrese la cantidad de metros: ");
		metros=leer.nextDouble();
		pies=metros*3.281;
		pulgadas=metros*39.37;
		System.out.println("La convercion de "+metros+" a pies es: "+pies);
		System.out.println("La convercion de "+metros+" a pulgadas es: "+pulgadas);
		
		leer.close();

	}

}
