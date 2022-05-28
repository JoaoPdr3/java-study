import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		/* Receba duas notas de um estudante.
		 * Apresente todos os valores informados, a média, e se ele está aprovado ou reprovado.
		 * Não deve permitir que os valores informados sejam inferiores a 0 ou superiores a 10
		 * Extra: O usuário deve informar se quer continuar a usar o programa informando S-Sim ou N-Não*/
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		char opcao = 'N';
		
		do {
			
			System.out.println("Digite seu nome: ");
			String nome = new Scanner(System.in).nextLine();
			
			double nota1;
			do {
				
				System.out.println("Informe a nota 1: ");
				nota1 = entrada.nextDouble();
				if(nota1 < 0 || nota1 > 10) {
					System.out.println("Nota 1 inválida.");
				}
				
			} while(nota1 < 0 || nota1 > 10);
			
			double nota2;
			do {
				
				System.out.println("Informe a nota 2: ");
				nota2 = entrada.nextDouble();
				if(nota2 <= 0 || nota2 > 10) {
					System.out.println("Nota 2 inválida");
				
				}
				
			} while(nota2 < 0 || nota2 > 10);
				
				
			double media = (nota1 + nota2) / 2;
				
			if(media >= 6) {
				System.out.println("Parabéns "+nome+" você está aprovado!");
				System.out.printf("Sua média foi de: %.1f", media);
			} else {
				System.out.println("Não foi dessa "+nome+". Mas nunca deixe de tentar!");
				System.out.printf("Sua média foi de: %.1f", media);
			}
			
			System.out.println("\nDeseja continuar? S para Sim ou N para Não");
			opcao = entrada.next().charAt(0);
		} while (opcao == 'S' || opcao == 's');
		
	}	
}
