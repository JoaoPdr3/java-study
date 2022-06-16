import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		double salario;
		
		try {//delimita a zona de perigo
			//na leitura pode ocorrer um exception
			System.out.println("Informe um salário: ");
			salario = new Scanner(System.in).nextDouble();
			
		}catch (InputMismatchException ex) {
			//caso o dado não seja um double a seguinte mensagem será mostrada
			System.out.println("Ops! O valor informado é inválido.");
			ex.printStackTrace();
		}
		System.out.println("Finalizando o programa normalmente.");
	}
}
