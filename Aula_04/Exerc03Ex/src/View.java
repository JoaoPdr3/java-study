import java.util.ArrayList;

public class View {
	public static Habitante lerHabitante() {
		String nome = Leitor.lerString("Informe o nome do habitante: ");
		int anoNasc = Leitor.lerInt("Informe o ano de nascimento do(a) "+nome+ ":", "Ano inválido", 1940, 2022);
		double salario = Leitor.lerDouble("Informe o salario do(a) "+nome+ ":", "Salario inválido", 0, Double.MAX_VALUE);
		
		Habitante habitante = new Habitante(nome, salario, anoNasc);
//		habitante.setNome(nome);
//		habitante.setSalario(salario);
//		habitante.setAnoNasc(anoNasc);
		
		return habitante;
	}
	
	public static void print(Habitante habitante) {
		System.out.println("Nome: "+habitante.getNome());
		System.out.println("Ano de Nascimento: "+habitante.getAnoNasc());
		System.out.println("Salario: "+habitante.getSalario());
		System.out.println("Classe Social: "+habitante.getClasseSocial());
		System.out.println("\n");
	}
	
	public static void print(ArrayList<Habitante> habitantes) {
		for (Habitante habitante : habitantes) {
			print(habitante);
		}
	}

}
