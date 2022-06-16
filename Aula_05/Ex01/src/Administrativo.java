import java.util.Calendar;

public class Administrativo extends Funcionario{
	private int dependentes;
	private Calendar dtAdmissao;
	
	public double getContribuicaoSindical() {
		return getSalario() * 0.01;
	}
	
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public Calendar getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Calendar dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	
	public int getDiasTrabalhados() {
		Calendar dtAtual = Calendar.getInstance();
		int MILLIS_IN_DAY = 86400000; //milisegundos de um dia;
		return (int) ((dtAtual.getTimeInMillis() - getDtAdmissao().getTimeInMillis()) / MILLIS_IN_DAY);
	}
	
	
	public double getGratificacao() {
	
		return (int) (getDiasTrabalhados() * 0.30);
	}
	
	
}
