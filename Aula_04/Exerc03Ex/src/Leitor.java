import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static double lerDouble(String mensagem) {
		System.out.println(mensagem);
		return lerDouble();
	}
	
	public static double lerDouble(String mensagem, String erro, double min, double max) {
		double retorno;
		
		do {
			retorno = lerDouble(mensagem);
			if(retorno < min || retorno > max) {
				System.out.println(erro);
			}
			
		}while(retorno < min || retorno > max);
		
		return retorno;
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static int lerInt(String mensagem) {
		System.out.println(mensagem);
		return lerInt();
	}
	
	public static int lerInt(String mensagem, String erro, int min, int max) {
		int retorno;
		
		do {
			retorno = lerInt(mensagem);
			if(retorno < min || retorno > max) {
				System.out.println(erro);
			}
			
		}while(retorno < min || retorno > max);
		
		return retorno;
	}

	public static String lerString(String mensagem) {
		System.out.println(mensagem);
		return lerString();
	}
	
	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
	public static char lerChar(String mensagem) {
		System.out.println(mensagem);
		return lerChar();
	}
	
	public static char lerChar() {
		return new Scanner(System.in).next().charAt(0);
	}
	
	
}
