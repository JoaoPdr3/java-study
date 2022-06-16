package br.ucb.contabil.entidades;

public class PessoaIsenta extends Pessoa{
	public PessoaIsenta(String nome) {
		super(nome);
		
	}

	@Override
	public double getImpostoEspecial() {
		return 0;
	}
}
