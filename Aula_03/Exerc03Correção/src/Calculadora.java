
@SuppressWarnings("all")
public class Calculadora {
	public static void main(String[] args) {
		
		char continuar;
		do {
			double valorUm = Leitor.lerDouble ("Informe o primeiro valor:");
			char operador = Leitor.lerCaracter ("Informe o operador: ");
			double valorDois = Leitor.lerDouble ("Informe o segundo valor:");
			double resultado = OperacoesMatematicas.calcular(valorUm, operador, valorDois);
			Impressao.printPane (valorUm, operador, valorDois, resultado);
			
			continuar = Leitor.lerCaracter("\nDeseja continuar o programa? S-Sim ou N-Não: ");
			
		} while (continuar == 's' || continuar == 'S');
	}
	
}
