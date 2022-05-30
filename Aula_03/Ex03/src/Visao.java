@SuppressWarnings("all")
public class Visao {
	public static Aluno lerAluno() {
		Aluno aluno = new Aluno();
		aluno.nome = Leitor.lerString("Informe o nome do Aluno: ");
		aluno.matricula = Leitor.lerString("Informe a matrícula do(a) "+aluno.nome+":");
		aluno.situacao = Leitor. lerCaractere("Informe a situacao B-Bolsista ou R-Regular: ");
		
		return aluno;
	}

	public static Aluno[] criarAlunos(int quantidade) {
		Aluno [] alunos = new Aluno [quantidade];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = lerAluno();
		}
		return alunos;
	}

	public static void print(Aluno aluno) {
		System.out.println("Nome:" +aluno.nome);
		System.out.println("Matrícula do aluno(a):" +aluno.matricula);
		System.out.println("Situação do aluno(a):" +aluno.situacao);
		
	}

	public static void print(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
				print(alunos[i]);
		}
		
	}
}
