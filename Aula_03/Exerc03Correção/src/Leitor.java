import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	public static char lerCaracter (String msgUsuario) {
		System.out.println(msgUsuario);
		return lerCaracter();
	}
	
	public static char lerCaracter() {
		return new Scanner(System.in).next().charAt(0);
	}
	
	public static double lerDouble (String msgUsuario) {
		System.out.println(msgUsuario);
		return lerDouble();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
}
