
public class Programa {
	public static void main(String[] args) {
		
		Calculator c = new Soma();
		double resultado = c.operacao(10, 20); //Polimorfismo
		System.out.println("O resultado da soma é: "+resultado);
		
		
		c = new Subtracao();
		resultado = c.operacao(40, 20);
		System.out.println("O resultado da subtração é: " +resultado);
	}
}

interface Calculator {
	public double operacao(double a, double b);
}

class Soma implements Calculator {
	public double operacao(double a, double b) {
		return a + b;
	}
}

class Subtracao implements Calculator {
	@Override
	public double operacao(double a, double b) {
		return a - b;
	}
}