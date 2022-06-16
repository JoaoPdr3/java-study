
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public double getImpostoDeRenda( ){
		return 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

class Professor extends Funcionario {
	private String titulacao;
	
	public double getImpostoDeRenda() {
		return getSalario() * 0.23;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
}

class Administrativo extends Funcionario {
	
	public double getContribuicaoSindical() {
		return getSalario() * 0.01;
	}
}
