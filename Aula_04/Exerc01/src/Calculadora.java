
public class Calculadora {
	double numUm;
	char operador;
	double numDois;
	
	
	public double calcular(double numUm, char operador, double numDois ) {
		this.numUm = numUm;
		this.numDois = numDois;
		this.operador = operador;
		
		double resultado = 0;
		
		switch (this.operador) {
		
		case '+': resultado = soma();
			break;
		case '-': resultado = subtracao();
			break;
		case '*': resultado = multiplicacao();
			break;
		case '/': resultado = divisao();
			break;
		default:
			break;
		}
		
		return resultado;
	}
	
	public double soma() {
		return numUm + numDois;
	}
	
	public double subtracao() {
		return numUm - numDois;
	}
	
	public double multiplicacao() {
		return numUm * numDois;
	}
	
	public double divisao() {
		return numUm / numDois;
	}
}
