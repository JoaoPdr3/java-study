
public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario;
		Funcionarios funcionarios = new Funcionarios();
		
		char opcao = 'N';
		do {
			char cargo = Leitor.lerChar("Informe seu cargo: P-Professor ou D-Diretor");
			if(cargo == 'P' || cargo == 'p') {
				funcionario = Imprimir.lerProfessor();
//				System.out.println(funcionario);
				funcionarios.adicionar(funcionario);
			} else if (cargo == 'D' || cargo == 'd') {
				funcionario = Imprimir.lerDiretor();
//				System.out.println(funcionario);
				funcionarios.adicionar(funcionario);
			} else {
				print("Cargo não encontrado no sistema.");
			}
			
			opcao = Leitor.lerChar("Deseja continuar? S-Sim ou N-Não.");
		} while (opcao == 'S' || opcao == 's');
		
		print("A média de impostos é: "+funcionarios.getMediaImposto());
		print("O total de impostos calculado foi: "+ funcionarios.getTotalImposto());
		
	}
	
	public static void print(double msg) {
		System.out.println(msg);
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
}


