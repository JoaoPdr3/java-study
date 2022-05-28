import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		/*Leia 500 valores inteiros e positivos e:
		 *Encontre o maior.
		 *Encontre o menor valor
		 *Calcule a média dos números lidos*/
		Scanner entrada = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		int soma = 0;
		int quantidade = 5;
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite um número: ");
			int numero = entrada.nextInt();
			
			soma += numero;
			
			if (numero > maior) {
				maior = numero;
			}
			//Recebe o primeiro número.
			if(menor == 0) {
				menor = numero;
			}
			/*Se o número que foi digitado for menor,
			 *então a variavel menor receber esse número.*/ 
			if(numero < menor) {
				menor = numero;
			}
			

			
		}
	
		System.out.println("O maior número é: "+maior);
		System.out.println("O menor número é: "+menor);
		System.out.println("A média é: "+(soma/quantidade));
			
	}	
}
