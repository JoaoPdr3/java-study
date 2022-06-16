import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
//		Professor prof = new Professor();
//		prof.setNome("Gilson da Silva");// HERDADO DE FUNCIONARIO
//		prof.setCpf("123.456.789-10");// HERDADO DE FUNCIONARIO
//		prof.setSalario(8000);// HERDADO DE FUNCIONARIO
//		prof.setTitulacao("MESTRE");
//		
//		System.out.println(prof.getImpostoRenda());
//		System.out.println(prof.getGratificacao());
	
		Calendar dtAdmissao = Calendar.getInstance();
		dtAdmissao.set(Calendar.DAY_OF_MONTH, 1);// dia 1
		dtAdmissao.set(Calendar.MONTH, Calendar.SEPTEMBER);// mês de junho
		dtAdmissao.set(Calendar.YEAR, 2021);// ano 2000
		//Admissao em 21/06/2000
		
		Administrativo adm = new Administrativo();
		adm.setNome("Carlos Ribeiro Pereira");
		adm.setCpf("145.342.769.32");
		adm.setSalario(50000);
		adm.setDtAdmissao(dtAdmissao);
		System.out.println("Sindicato: "+adm.getContribuicaoSindical());
		System.out.println("Dias Trabalhados: "+adm.getDiasTrabalhados());
		System.out.println("Gatificação: "+adm.getGratificacao());
	}
}
