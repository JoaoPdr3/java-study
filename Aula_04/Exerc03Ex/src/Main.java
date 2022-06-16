import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Prefeitura pref = new Prefeitura();
		
		char opcao;
		do {	
			
			Habitante habitante = View.lerHabitante();
			pref.adicionar(habitante);
			opcao = Leitor.lerChar("Deseja continuar? S-Sim ou N-Não:");
			
		} while(opcao == 'S' || opcao == 's');
		
		ArrayList<Habitante> habPorNasc = pref.buscarPorAnoNasc(1970);
		ArrayList<Habitante> habPorClasse = pref.buscarPorClasse('B');
		ArrayList<Habitante> habRico = pref.buscarHabitanteMaiorSalario(5000);
		int habitantes = pref.getHabitantes().size();
		
		System.out.println("-------QUANTIDADE DE HABITANTES---------\n");
		System.out.println(habitantes);
		
		System.out.println("-------NASCIDOS APÓS 1970---------\n");
		View.print(habPorNasc);
		
		
		System.out.println("-------HABITANTES DA CLASSE B---------\n");
		View.print(habPorClasse);
		
		
		System.out.println("-------HABITANTES RICOS---------\n");
		View.print(habRico);
	
		
	}
	
}
