
public class Pessoa {
	private String nome;
	private String cpf;
	private double salario;
	
	public Pessoa(String nome, String cpf, double salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}
	
	public String getClasseSocial() {
		if(getSalario() <= 600) {
			return "F";
		} else if(getSalario() >= 950 && getSalario() < 1400) {
			return "E";
		} else if(getSalario() >= 1400 && getSalario() < 2300) {
			return "D";
		} else if(getSalario() >= 2300 && getSalario() < 4600) {
			return "C";
		} else if(getSalario() >= 4600 && getSalario() < 8100) {
			return "B";
		} else if(getSalario() >= 8100 && getSalario() < 14400) {
			return "A2";
		}
		return "A1";
	}
	
	@Override
	public String toString() {
		return "\nNome: "+getNome()+"\nCPF: "+getCpf()+" \nSalário: "+getSalario()+"\nClasse Social: "+getClasseSocial();
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
