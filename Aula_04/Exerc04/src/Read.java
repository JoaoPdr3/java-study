import java.util.Scanner;

@SuppressWarnings("all")
public class Read {
	
	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
	public static String lerString(String msg) {
		System.out.println(msg);
		return lerString();
	}
}
