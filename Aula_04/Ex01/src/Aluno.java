
public class Aluno {
	//Características
	String nome;
	double notaUm;
	double notaDois;
	//Ações
	public double getMedia() {
		return (notaUm + notaDois) / 2;
	}
	public boolean isAprovoado() {
		return getMedia() > 7.0; //return true - false
	}
}
