import java.util.Scanner;
import javax.swing.JOptionPane;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		int num = lerInt ("Informe um número: ");
		int soma = somatorio(num);
		printPane (num, soma);
		
	}
	
	public static void printPane (int num, int soma) {
		JOptionPane.showMessageDialog(null, "A soma de todos os números até " +num+ " é: "+soma);
	}
	
	public static int somatorio (int num) {
		int soma = 0;
		for (int i = 0; i <= num; i++) {
			soma += i;
		}
		return soma;
	}
	
	public static int lerInt (String msgUsuario) {
		System.out.println(msgUsuario);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
}
