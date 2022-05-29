import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		
		Aluno al = new Aluno( );
		al.nome = lerString ("Informe seu nome completo: ");
		al.matricula = lerString ("Informe sua matrícula: ");
		al.notaUm = lerDouble ("Informe a primeira nota: ");
		al.notaDois = lerDouble ("Informe a segunda nota: ");
		double mediaNotas = mediaNotas(al.notaUm, al.notaDois);
		String situacao = situacao(mediaNotas);
		printPane(al.nome, mediaNotas, situacao);
		
		
		
	}
	
	public static String situacao(double media) {
		String situacao;
		if (media > 7) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		return situacao;
	}
	
	public static double mediaNotas(double notaUm, double notaDois) {
		return (notaUm + notaDois) / 2;
	}
	
	public static void printPane(String nome, double media, String situacao) {
		System.out.println("Aluno "+nome+" com a média "+media+" está "+situacao);
	}
	
	public static double lerDouble (String msgUsuario) {
		System.out.println(msgUsuario);
		return lerDouble();
	}
	
	public static double lerDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static String lerString (String msgUsuario) {
		System.out.println(msgUsuario);
		return lerString();
	}
	
	public static String lerString() {
		return new Scanner(System.in).nextLine();
	}
	
	
}

class Aluno {
	String nome;
	String matricula;
	double notaUm = 0;
	double notaDois = 0;
}

