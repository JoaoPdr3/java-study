import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static char lerCaractere (String msg) {
		System.out.println(msg);
		return lerCaractere();
	}
	
	public static char lerCaractere() {
		return new Scanner(System.in).next().charAt(0);
	}
	
	public static double lerDouble (String msg) {
		System.out.println(msg);
		return lerDouble();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static String lerString (String msg) {
		System.out.println(msg);
		return lerString();
	}
	
	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
}
