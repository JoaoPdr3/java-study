
public class Pessoa {
	private String nome;
	private String cpf;
	
	//Alterando constructor vazio
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	//Utilizando da sobrecarga para criar um constructor vazio
	public Pessoa() {}
	
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
	
}
