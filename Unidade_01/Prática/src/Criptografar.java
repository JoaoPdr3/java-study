import java.util.Scanner;
public class Criptografar {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		// Inicializa a entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		// Pede texto para criptografar
		System.out.println("Entre com o texto para criptografar: ");
		String textoOriginal = entrada.nextLine();
		
		// Passa o texto informado para maiúsculas
		textoOriginal = textoOriginal.toUpperCase();
		
		// Cria vetor contendo os caracteres do alfabeto
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// Sorteia uma chave de 1 a 26
		int chave = (int) (Math.random() * 25 + 1);
		System.out.println(chave);
		
		// Criptografa o texto, usando a chave
		String textoCifrado = "";
		for (int i = 0; i < textoOriginal.length(); i++) {
			// Recupera a posicao do caractere do texto original no alfabeto
			char caractereOriginal = textoOriginal.charAt(i);
			System.out.println(caractereOriginal);
			int posCaractereOriginalAlfabeto = alfabeto.indexOf(caractereOriginal);
			System.out.println(posCaractereOriginalAlfabeto);
			
			// Se o caractere não está no alfabeto (como um espaço), ignona a codificação
			if (posCaractereOriginalAlfabeto == -1) {
				System.out.println(textoCifrado += caractereOriginal); 
				
				continue;
			}
			
			// Criptografa o caractere, usando a chave de criptografia
			
			int posCaractereCifrado = (posCaractereOriginalAlfabeto + chave) % 26;
			System.out.println(posCaractereCifrado);
			char caractereCifrado = alfabeto.charAt(posCaractereCifrado);
			System.out.println(caractereCifrado);
			
			System.out.println(textoCifrado += caractereCifrado); 
		}
		
		// Mosta texto criptografado
		
		System.out.println("Texto criptografado: "+textoCifrado);
		
	}
}
