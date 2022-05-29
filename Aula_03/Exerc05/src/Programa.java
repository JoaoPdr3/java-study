import java.util.Scanner;
import javax.swing.JOptionPane;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		//Calcular fatorial de um número
		int num = lerInt("Informe um número: ");
		int fatorial = Matemática.fatorial(num);
		printPane(num, fatorial);
		
		//Recebe dois números e retorna o maior
		int valorUm = lerInt("Informe o primeiro número: ");
		int valorDois = lerInt("Informe o segundo número: ");
		int maiorNumero = Matemática.maior(valorUm, valorDois);
		printPane(valorUm, valorDois, maiorNumero);
		
		//Recebe um número e retorna se ele Par = true ou Par = false
		int numero = lerInt("Informe um número: ");
		boolean numeroPar = Matemática.par(numero);
		printPane(numero, numeroPar);
		
		//Recebe um número e retorna se ele é um número Primo ou não;
		int n = lerInt("Digite um número: ");
		boolean numeroPrimo = Matemática.numeroPrimo(n);
		print(n, numeroPrimo);
		
	}
	
	public static int lerInt(String msgUsuario) {
		System.out.println(msgUsuario);
		return lerInt();	
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static void print(int numero, boolean numeroPrimo) {
		System.out.println("O número "+numero+" é um número Primo? "+numeroPrimo);
	}
	
	public static void printPane(int numero, boolean numeroPar) {
		JOptionPane.showMessageDialog(null, "O número "+numero+" é um número Par? "+numeroPar);
	}
	
	public static void printPane(int valorUm, int valorDoism, int maiorNumero) {
		JOptionPane.showMessageDialog(null, "O maior número é: "+maiorNumero);
	}
	
	public static void printPane(int num, int fatorial) {
		JOptionPane.showMessageDialog(null, "O fatorial de "+num+"! é: "+fatorial);
	}
}
