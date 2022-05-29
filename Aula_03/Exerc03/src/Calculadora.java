import java.util.Scanner;

@SuppressWarnings("all")
public class Calculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		double valorUm = entrada.nextDouble();
		
		System.out.println("Informe um operador.soma(+), subtr(-), div(/), multi(*): ");
		char operador = entrada.next().charAt(0); 
		
		System.out.println("Informe outro valor: ");
		double valorDois = entrada.nextDouble();
		
		System.out.printf("Resultado da operação é: %.0f",operacoes(valorUm, valorDois, operador));
	}
	
	public static double operacoes(double valorUm, double valorDois, char operador) {
		double resultado = 0;
		
		if (operador == '+') {
			resultado = valorUm + valorDois;
		} else if(operador == '-') {
			resultado = valorUm - valorDois;
		} else if(operador == '/') {
			resultado = valorUm / valorDois;
		} else if(operador == '*') {
			resultado = valorUm * valorDois;
		}
		
		return resultado;
	}
	
}


