
public class Matemática {
	public static int fatorial (int num) {
		int fatorial = 1;
		for (int i = 1; i <= num; i++ ) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static int maior (int numUm, int numDois) {
		int maiorNumero;
		if (numUm > numDois) {
			maiorNumero = numUm;
		} else {
			maiorNumero = numDois;
		}
		return maiorNumero;
	}
	
	public static boolean par (int num) {
		boolean numeroPar;
		if (num % 2 == 0) {
			numeroPar = true;
		} else {
			numeroPar = false;
		}
		return numeroPar;
	}
	
	public static boolean numeroPrimo (int num) {
		boolean numPrimo;
		if (num > 1 && num/1 == num && num/num == 1) {
			numPrimo = true;
		} else {
			numPrimo = false;
		}
		return numPrimo;
	}
}
