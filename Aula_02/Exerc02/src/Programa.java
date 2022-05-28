import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		/*Leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele.
		 *Sabendo que este vendedor ganha 15% de comissão.
		 *O programa deve mostrar como resultado o seu nome e o seu salário no final do mês*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome do vendedor(a): ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe seu salário fixo: ");
		double salario = entrada.nextDouble();
		
		System.out.println("Total de vendas efetuadas: ");
		double vendas = entrada.nextDouble();
		
		//15/100 = 0.15
		double totalSalario = (vendas * 0.15) + salario;
		
		//Mostrar dados
		System.out.println("Vendedor: "+nome);
		System.out.printf("Salário a receber: %.2f", totalSalario);
		
	}
}
