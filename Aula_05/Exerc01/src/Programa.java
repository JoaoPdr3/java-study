import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informeu seu cargo: P-Professor ou A-Administrativo. ");
		char cargo = in.next().charAt(0);
		
		Professor prof = new Professor();
		Administrativo adm = new Administrativo();
		
		String nome;
		String cpf;
		double salario;
		
		if(cargo == 'P' || cargo == 'p') {
			
			System.out.print("Informe seu nome: ");
			nome = in.next();
			System.out.println("Informe seu CPF: ");
			cpf = in.next();
			System.out.println("Informe seu salário: ");
			salario = in.nextDouble();
			System.out.println("Informe sua titutalação: ESPECIALISTA, MESTRE OU DOUTOR.");
			String titulacao = in.next();
			
			prof.setNome(nome);
			prof.setCpf(cpf);
			prof.setSalario(salario);
			prof.setTitulacao(titulacao);
			
			System.out.println("Nome: "+prof.getNome()+" Titulação: "+prof.getTitulacao()+" CPF: "+prof.getCpf()+" Imposto de Renda: "+prof.getImpostoDeRenda());
			
		} else if(cargo == 'A' || cargo == 'a') {
			
			System.out.print("Informe seu nome: ");
			nome = in.next();
			System.out.println("Informe seu CPF: ");
			cpf = in.next();
			System.out.println("Informe seu salário: ");
			salario = in.nextDouble();
			
			adm.setNome(nome);
			adm.setCpf(cpf);
			adm.setSalario(salario);
			
			System.out.println("Nome: "+adm.getNome()+" CPF: "+adm.getCpf()+" Contribuição Sindical: "+adm.getContribuicaoSindical());
			
		} else {
			System.out.println("Cargo não encontrado no sistema.");
		}
	}
}
