package br.ucb.contabil.entidades;

//Classes abstratas não são instanciadas
abstract class Pessoa {
	
	private String nome;
	
	public Pessoa(String nome) {
		setNome(nome);
//		System.out.println("Construindo Pessoa...");
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getImpostoEspecial() {
		return 30;
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome() + "\t Imposto: "+getImpostoEspecial()+ "\t";
	}
	
}
