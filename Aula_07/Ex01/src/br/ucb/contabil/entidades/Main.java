package br.ucb.contabil.entidades;

public class Main {
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Laura");
		pf.setSalario(1245);
		pf.setCpf("101.293.444-10");
		System.out.println(pf);
		
		
		
//		PessoaJuridica pj = new PessoaJuridica();
//		pj.setNome("BB/SA");
//		pj.setCpnj("123456/0001-56");
//		pj.setLucroBruto(20000);
//		
////		System.out.println(pj.getImpostoEspecial());
//		
//		PessoaFisica pf = new PessoaFisica();
//		pf.setNome("Paulo");
//		pf.setCpf("123.456.789-10");
//		pf.setSalario(5000);
//		
////		System.out.println(pf.getImpostoEspecial());
//		
//		PessoaIsenta pi = new PessoaIsenta();
//		pi.setNome("Ana Paula");
//		
//		contabilidade(pj);
//		contabilidade(pf);
//		contabilidade(pi);
		
	}
	
//	public static void contabilidade(Pessoa p) {
//		System.out.println(p.getNome());
//		//Polimorfismo
//		System.out.println(p.getImpostoEspecial()+"\n");
//	}
}
