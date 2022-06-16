import java.util.ArrayList;

public class Funcionarios {
	
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public void adicionar(Funcionario funcionario) {
		getFuncionarios().add(funcionario);
	}
	
	public double getMediaImposto() {
		int qtdFuncinarios = getFuncionarios().size();
		double somaImpostos = 0;
		
		for (Funcionario funci : getFuncionarios()) {
			somaImpostos = somaImpostos + funci.getImpostoDeRenda();
		}
		
		return somaImpostos /qtdFuncinarios;
	}
	
	public double getTotalImposto() {
		double somaImposto = 0;
		
		for (Funcionario funcionario : funcionarios) {
			somaImposto = somaImposto + funcionario.getImpostoDeRenda();
		}
		
		return somaImposto;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
}
