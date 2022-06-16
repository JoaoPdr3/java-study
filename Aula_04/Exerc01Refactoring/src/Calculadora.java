
public class Calculadora {	
	
	public Calculadora(double numUm, char operador, double numDois) {
		setNumUm(numUm);
		setOperador(operador);;
		setNumDois(numDois);
	}

	private double numUm;
	private char operador;
	private double numDois;
	

	public double getCalcula() {
		double resultado = 0;
		
		switch (getOperador()) {
		
		case '+': resultado = getSoma();
			break;
		case '-': resultado = getSubtracao();
			break;
		case '*': resultado = getMultiplicacao();
			break;
		case '/': resultado = getDivisao();
			break;
		default:
			break;
		}
		
		return resultado;
	}
	
	
	public double getSoma() {
		return getNumUm() + getNumDois();
	}
	
	public double getSubtracao() {
		return getNumUm() - getNumDois();
	}
	
	public double getMultiplicacao() {
		return getNumUm() * getNumDois();
	}
	
	public double getDivisao() {
		return getNumUm() / getNumDois();
	}
	
	/*Métodos Acessores*/
	public double getNumUm() {
		return numUm;
	}

	public void setNumUm(double numUm) {
		this.numUm = numUm;
	}

	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}

	public double getNumDois() {
		return numDois;
	}

	public void setNumDois(double numDois) {
		this.numDois = numDois;
	}
}
