import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escreva uma frase pequena: ");
		String frase = in.nextLine();
		
		System.out.println("Frase informada em caixa alta: "+frase.toUpperCase());
		System.out.println("Frase informada em caixa baixa: "+frase.toLowerCase());
		System.out.println("Quantidade de caracteres da frase informada: "+frase.replaceAll(" ", "").length());
		System.out.println("Frase igual a 'Estou estudando Java: '"+frase.equals("Estou estudando Java"));
		System.out.println("Quantidade de palavras na frase informada: "+frase.split("\\s+").length);
	}
}
