import java.util.Scanner;
public class DesCriptografar {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Pede o texto criptografado
		System.out.println("Entre com o texto cifrado: ");
		String textoCifrado = entrada.nextLine();
		textoCifrado = textoCifrado.toUpperCase();
		
		// Pede a chave para descriptografar o texto
		System.out.println("Entre com a chave para descriptografar: ");
		int chave = entrada.nextInt();
		
		// Cria vetor contendo os caracteres do alfabeto
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// Descriptografa o texto, usando a chave
		String textoOriginal = "";
		for (int i = 0; i < textoCifrado.length(); i++) {
			char caractereCifrado = textoCifrado.charAt(i);
			System.out.println(caractereCifrado);
			int posCaractereCifradoAlfabeto = alfabeto.indexOf(caractereCifrado);
			System.out.println(posCaractereCifradoAlfabeto);
			
			if (posCaractereCifradoAlfabeto == -1) {
				textoOriginal += caractereCifrado;
				
				continue;
			}
			
			int posCaractereOriginal = (posCaractereCifradoAlfabeto - chave);
			System.out.println(posCaractereOriginal);
			char caractereOriginal = alfabeto.charAt(posCaractereOriginal);
			System.out.println(caractereOriginal);
			
			textoOriginal += caractereOriginal;
		}
		
		System.out.println("Texto original: " + textoOriginal);
	}
}
