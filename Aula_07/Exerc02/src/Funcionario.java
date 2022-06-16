
abstract class Funcionario {
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String matricula, double salario) {
		setNome(nome);
		setCpf(cpf);
		setMatricula(matricula);
		setSalario(salario);
	}
	
	private String nome;
	private String cpf;
	private String matricula;
	private double salario;
	
	public double getImpostoDeRenda() {
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nMatrícula: "+getMatricula()+"\nSalário: "+getSalario()+"\nImposto de Renda: "+getImpostoDeRenda();
	}
	
	
}
