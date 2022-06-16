
public class Main {
	public static void main(String[] args) {
		String mensagem = Read.lerString("Digite uma frase: ");
		
		Frase frase = new Frase(mensagem);
		int letrasRepetidas = frase.letrasRepetidas('A', 'a');
		int quantCaracteres = frase.quantCaracteres();
		String tamanhoFrase = frase.tamanhoFrase();
		String fraseCaixaAlta = frase.fraseCaixaAlta();
		int quantPalavras = frase.quantPalavras();
		
		View.print("\nQuantidade de letras 'A' que a frase possui: "+letrasRepetidas);
		View.print("Quantidade de caracteres que a frase possui: "+quantCaracteres);
		View.print("Tamanho da frase: "+tamanhoFrase);
		View.print("Frase em CAIXA ALTA: "+ fraseCaixaAlta);
		View.print("Quantidade de palavras que a frase possui: "+quantPalavras);
	}
}
