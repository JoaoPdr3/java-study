
public class Professor extends Funcionario {
	//Herdando atributos e métodos da classe pai Funcionario
	private String titulacao;
	
	public double getImpostoRenda() {
		return getSalario() * 0.15;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	//Sobrescrita
	public double getGratificacao() {
		if(getTitulacao().equalsIgnoreCase("ESPECIALISTA")) {
			return getSalario() * 0.1; //10% para especialista
		} else if(getTitulacao().equalsIgnoreCase("MESTRE")) {
			return getSalario() * 0.12; //12% para mestre
		} else if(getTitulacao().equalsIgnoreCase("DOUTOR")) {
			return getSalario() * 0.15; //15% para doutor
		} 
		return 0;//caso não seja identificado - 0
	}
}
