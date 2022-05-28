import java.util.Scanner;

@SuppressWarnings("all")
public class EntradaDeDados {
	public static void main(String[] args) {
		double numSalario = lerDouble("Informe seu salário:",  "O valor digitado é inválido", 1100, 5000);
		System.out.println("O valor lido foi: "+numSalario);
	}
	
	public static double lerDouble(String mensagem, String mensagemErro, double min, double max) {
		double retorno;
		
		do {
			retorno = lerDouble(mensagem);
			if(retorno < min || retorno > max) {
				System.out.println(mensagemErro);
			}
		} while(retorno < min || retorno > max);
		
		return retorno;
	}
	
	public static double lerDouble(String mensagem) {
		System.out.println(mensagem);
		return lerDouble();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
}
