import java.util.Locale;
import java.util.Scanner;
public class Programa {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		/*
		 * Receba 5 mil dados do usuário do tipo inteiro.
		 * Imprima na saída padrão a média dos valores, quantos valores são pares e quantos são ímpares*/
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		int []nums = new int[4];//Apenas para teste. Só alterar o valor para 5000.
		double media = 0;
		int soma = 0;
		int impares = 0;
		int pares = 0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums[i] = entrada.nextInt();
			
			soma += nums[i];
			media = soma/nums.length;
			
			if(nums[i]% 2 == 0) {
				++pares;
			}else {
				++impares;
			}
		}
		System.out.printf("A média é: %.1f", media);
		System.out.println("\nA quantidade de números pares é: "+pares);
		System.out.println("A quantidade de números impares é: "+impares);
	}
}
