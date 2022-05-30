import java.util.Iterator;

@SuppressWarnings("all")
public class ArrayObjeto {
	public static void main(String[] args) {
		
		Aluno [] alunos = Visao.criarAlunos(3); //Criar um array de três e depois popular
		
		Visao.print(alunos);
		
//		//Criando um array objeto
//		Aluno [] alunos = new Aluno [3];
//		alunos[0] = new Aluno(); //Criado um espaço na memória
//		alunos[0].nome = "Anderson";
//		alunos[0].matricula = "UC12334568";
//		alunos[0].situacao = 'R';
//		
//		Aluno a = Visao.lerAluno();
//		alunos[1] = a;
//		
//		//Criando um objeto aluno
//		Aluno b = new Aluno();
//		b.nome = "Pedro da Silva";
//		b.matricula = "UC1234567";
//		b.situacao = 'R';
//		alunos[2] = b;
//		
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println(alunos[i].nome); 
//		}
		
	}
}

class Aluno {
	String nome;
	String matricula;
	char situacao;
}
