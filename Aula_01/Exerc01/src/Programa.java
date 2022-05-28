import java.util.Scanner;

public class Programa {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		/*Ler uma temperatura em graus Celsius e 
		 *apresentá-la convertida em graus Fahrenheit.*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius:");
		int celsius = entrada.nextInt();
		
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);
	}
}
