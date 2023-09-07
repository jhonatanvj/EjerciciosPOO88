package co.edu.udistrital.model;

public class NumeroFinal {

	private int a, b, c, x;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getX() {
		return x;
	}

	public boolean comprobar() {

		if (a > 10 || b > 10 || c > 10) {

			return true;
		} else {
			return false;
		}

	}

	public void unionNumeros() {

		x = a * 100 + b * 10 + c;

	}

}
