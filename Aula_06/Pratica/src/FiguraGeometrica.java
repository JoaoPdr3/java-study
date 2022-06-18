
abstract class FiguraGeometrica {
	
	public FiguraGeometrica(String nome) {
		setNome(nome);
	}
	
	private String nome;
	
	abstract double getArea();
	
	abstract String getDescricao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
