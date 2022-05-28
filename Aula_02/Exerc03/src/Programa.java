import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		/* Leia a idade e a altura de 10 pessoas. 
		 * Calcule e informe a média das alturas 
		 * das pessoas com mais de 50 anos.*/
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		int pessoas = 0;
		int idade = 0;
		double altura;
		double somaAltura = 0;
		double media = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite sua altura: ");
			altura = entrada.nextDouble();
			
			if(idade >= 50) {
				somaAltura += altura;
				pessoas += 1;
			}
			media = somaAltura/pessoas;
		}
		System.out.printf("A média é: %.2f ",media);
	}
}
