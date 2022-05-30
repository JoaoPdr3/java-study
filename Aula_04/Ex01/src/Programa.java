
public class Programa {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.nome = "João Pedro";
		aluno.notaUm = 3;
		aluno.notaDois = 5;
		
		System.out.println(aluno.getMedia());
		System.out.println(aluno.isAprovoado());
	}
}
