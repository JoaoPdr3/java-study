public class Somador {
	public static void main(String[] args) {
		
		double valorUm = 10;
		double valorDois = 3;
		
		// Invocando um método
		double somar = somar(valorUm, valorDois);
		System.out.println(somar);
		
	}
	
	// Os métodos devem ficar dentro da classe e fora do main
	public static double somar(double valorUm, double valorDois) {
		return (valorUm + valorDois);
	}
}
