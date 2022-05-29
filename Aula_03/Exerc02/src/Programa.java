import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = fahrenheit(celsius);
		System.out.println("A temperatura em graus fahrenheit é: "+fahrenheit+ "°F");
	}
	
	public static double fahrenheit(double celsius) {
		double fahrenheit = (celsius * 1.8) + 32;
		return fahrenheit;
	}
}
