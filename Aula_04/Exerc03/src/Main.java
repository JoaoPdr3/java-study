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
		Habitante rico = pref.buscarHabitanteMaiorSalario();
		
		System.out.println("-------QUANTIDADE DE HABITANTES---------\n");
		
		System.out.println("-------NASCIDOS APÓS 1970---------\n");
		View.print(habPorNasc);
		System.out.println("\n");
		
		System.out.println("-------HABITANTES DA CLASSE B---------\n");
		View.print(habPorClasse);
		System.out.println("\n");
		
		System.out.println("-------UM HABITANTE RICO---------\n");
		View.print(rico);
	
		
	}
	
}
