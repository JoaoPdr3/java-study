package br.ucb.contabil.entidades;

public class PessoaJuridica extends Pessoa {
	public PessoaJuridica(String nome) {
		super(nome);
		
	}

	private String cpnj;
	
	private double lucroBruto;
	
	
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	public double getLucroBruto() {
		return lucroBruto;
	}
	public void setLucroBruto(double lucroBruto) {
		this.lucroBruto = lucroBruto;
	}
	
	public double getImpostoEspecial() {
		return getLucroBruto() * 0.13;
	}
	
}
