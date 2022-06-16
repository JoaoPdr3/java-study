import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
	public static String lerString(String msg) {
		System.out.println(msg);
		return lerString();
	}
	
	public static char lerChar() {
		return new Scanner(System.in).next().charAt(0);
	}
	
	public static char lerChar(String msg) {
		System.out.println(msg);
		return lerChar();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static double lerDouble(String msg) {
		System.out.println(msg);
		return lerDouble();
	}
	
	public static double lerDouble(String msg, String msgErro, double min, double max) {
		double retorno;
		
		do {
			retorno = lerDouble(msg);
			if(retorno < min || retorno > max) {
				System.out.println(msgErro);
			}
		} while(retorno < min || retorno > max);
		
		return retorno;
	}
}
