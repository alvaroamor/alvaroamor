package calidad;

public class Calculadora {
	
	public static int numero;
	public static int numero1;
	
	public Calculadora(int numero, int numero1) {
		this.numero = numero;
		this.numero1 = numero1;
	}
	
	public int suma() {
		int res = numero + numero1;
		return res;
	}
	
	public int resta() {
		int res = numero - numero1;
		return res;
	}
	
	public double dividir() {
		double res = numero/numero1;
		return res;
	}
	
	public int multiplicar() {
		int res = numero*numero1;
		return res;
	}
	
	public double raizCuadrada() {
		double res = numero+numero1;
		return res;
	}
	
}
