
public class Habitante {
	public Habitante() {
		
	}
	
	public Habitante(String nome, double salario, int anoNasc) {
		setNome(nome);
		setSalario(salario);
		setAnoNasc(anoNasc);
	}

	private String nome;
	private double salario;
	private int anoNasc;
	
	public char getClasseSocial() {
		if(getSalario() < 950 ) {
			return 'F';
		} else if(getSalario() >= 950 && getSalario() < 1400) {
			return 'E';
		} else if(getSalario() >= 1400 && getSalario() < 2300) {
			return 'D';
		} else if(getSalario() >= 2300 && getSalario() < 4600) {
			return 'C';
		} else if(getSalario() >= 4600 && getSalario() < 8100) {
			return 'B';
		}
		return 'A';
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	
}
