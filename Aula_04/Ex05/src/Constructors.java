
public class Constructors {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ana", "1234");	//Inicializa os atributos -
		System.out.println(pessoa.getNome());		//na construção do objeto Pessoa.	
		
		Pessoa pessoaDois = new Pessoa();
		pessoaDois.setNome("Paulo");
		System.out.println(pessoaDois.getNome());
		
	}
}
