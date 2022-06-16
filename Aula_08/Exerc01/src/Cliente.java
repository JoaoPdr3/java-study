
public class Cliente {
	private String nome;
	private String endereco;
	private Pagamento pagamento;
	
	public Cliente(String nome, String endereco, Pagamento pagamento) {
		setNome(nome);
		setEndereco(endereco);
		setPagamento(pagamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	
	
	
	
}
