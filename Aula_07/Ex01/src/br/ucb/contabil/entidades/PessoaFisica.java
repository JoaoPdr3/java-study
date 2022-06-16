package br.ucb.contabil.entidades;

public class PessoaFisica extends Pessoa{
	public PessoaFisica(String nome) {
		super(nome);
//		System.out.println("Construindo Pessoa Física...");
	}

	private String cpf;
	
	private double salario;
	
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
	
	public double getImpostoEspecial() {
		return super.getImpostoEspecial() + getSalario() * 0.1;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t CPF: "+getCpf() + "\t Salário: "+getSalario();
	}
	
}
