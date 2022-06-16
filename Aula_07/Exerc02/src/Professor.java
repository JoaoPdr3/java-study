
public class Professor extends Funcionario {

	public Professor(String nome, String cpf, String matricula, double salario) {
		super(nome, cpf, matricula, salario);
	}
	
	public double getImpostoDeRenda() {
		return getSalario() * 0.2;
	}

}
