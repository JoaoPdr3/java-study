import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		
		double calcularDivida = calcularDivida("Informe o valor do juros mensal: ", "Informe o valor da dívida");
		System.out.printf("O valor total a ser pago é: %.2f ", calcularDivida);
		
	}
	
	public static double calcularDivida(String informeJuros, String informeDivida) {
		System.out.println(informeJuros);
		double jurosMensal = lerDouble();
		System.out.println(informeDivida);
		double valorDivida = lerDouble();
		
		double valorJuros = valorDivida * (jurosMensal /100);
		double valorTotalDivida = valorDivida + valorJuros;
		return valorTotalDivida;
		
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
}
