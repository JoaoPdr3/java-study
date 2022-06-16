import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
	
	 public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numUm = in.nextDouble();
		System.out.println("Informe o operador: ");
		char operador = in.next().charAt(0);
		System.out.println("Informe outro número: ");
		double numDois = in.nextDouble();
		
		Calculadora calculadora = new Calculadora(numUm, operador, numDois);
		double resultado = calculadora.getCalcula();
		
		System.out.println(resultado);
		
	}
}
