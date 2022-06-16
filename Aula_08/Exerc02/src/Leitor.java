import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static double lerDouble(String mensagem) {
		try {
			System.out.println(mensagem);
			return lerDouble();
		}catch (InputMismatchException ex) {
			System.out.println("Entrada de dado inválida! Tipo de dado DOUBLE!");
			ex.printStackTrace();
		}
		
		return 0;
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static int lerInt(String mensagem) {
		try {
			System.out.println(mensagem);
			return lerInt();
		}catch (InputMismatchException ex) {
			System.out.println("Entrada de dado inválida! Tipo de dado INT!");
			ex.printStackTrace();
		}
		
		return 0;
	}
	
}
