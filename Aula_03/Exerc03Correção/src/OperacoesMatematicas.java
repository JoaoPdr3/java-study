
public class OperacoesMatematicas {
	//2 e 3 = 2 elevado a 3 = 8 (2 * 2 * 2)
	public static double expoente(double base, double expoenteFlutuante) {
		int expoente = (int) expoenteFlutuante;
		double resultado = 1;
		
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
	
	public static double divisao (double valorUm, double valorDois) {
		if (valorDois == 0)
			return 0;
		return (valorUm / valorDois);
	}
	
	public static double multiplicao (double valorUm, double valorDois) {
		return (valorUm * valorDois);
	}
	
	public static double subtracao (double valorUm, double valorDois) {
		return (valorUm - valorDois);
	}
	
	public static double somar (double valorUm, double valorDois) {
		return (valorUm + valorDois);
	}
	
	public static double calcular(double valorUm, char operador, double valorDois) {
		double resultado = 0;
		
		switch (operador) {
			case '+': resultado = OperacoesMatematicas.somar (valorUm, valorDois);
				break;
			case '-': resultado = OperacoesMatematicas.subtracao (valorUm, valorDois);
				break;
			case '*': resultado = OperacoesMatematicas.multiplicao (valorUm, valorDois);
				break; 
			case '/': resultado = OperacoesMatematicas.divisao (valorUm, valorDois);
				break;
			case '^': resultado = OperacoesMatematicas.expoente (valorUm, valorDois);
				break;
			default:
				break;
		}
		return resultado;
	}
}
