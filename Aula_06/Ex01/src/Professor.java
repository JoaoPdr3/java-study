
public class Professor {
	public Professor() {
		
	}
	
	public Professor(String nome, String titulacao, double salario, int matricula) {
		setNome(nome);
		setTitulacao(titulacao);
		setSalario(salario);
		setMatricula(matricula);
	}
	
	private String nome;
	private String titulacao;
	private double salario;
	private int matricula;
	
	//sobrescrita do toString();
	//toString() é a representação do objeto em forma de String.
	@Override
	public String toString() {
		return "\nNome: "+getNome()+"\tTitulação: "+getTitulacao()+"\tSalario: "+getSalario()+"\tMatricula: "+getMatricula();
	}
	
	//sobrescrita do método equals()
	//o equals() serve para comparar uma String com outra.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Professor) { // o objeto é um Professor?
			Professor temp = (Professor) obj;
			//casting de Objecto para Professor
			//getMatricula().equals(temp.getMatricula())
			if(getMatricula() == temp.getMatricula()){
				return true;
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
