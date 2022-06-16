
public class Frase {
	
	public Frase() {
		
	}
	
	public Frase(String msg) {
		setFrase(msg);
	}
	
	private String msg;
	
	public int letrasRepetidas(char maiuscula, char minuscula) {
		int letrasRepetidas = 0;
		
		for (int i = 0; i < getFrase().length(); i++) {
			if(maiuscula == getFrase().charAt(i) || minuscula == getFrase().charAt(i)) {
				letrasRepetidas++;
			}
		}
		
		return letrasRepetidas;
	}
	
	public int quantCaracteres() {
		return getFrase().replaceAll(" ", "").length();
	}
	
	public String tamanhoFrase() {
		if(quantCaracteres() < 10) {
			return "PEQUENA";
		} else if(quantCaracteres() >= 10 && quantCaracteres() < 29) {
			return "MEDIA";
		}
		return "GRANDE";
	}
	
	public String fraseCaixaAlta() {
		return getFrase().toUpperCase();
	}
	
	public int quantPalavras() {
		return getFrase().split("\\s+").length;
	}
	
	public String getFrase() {
		return msg;
	}
	
	public void setFrase(String msg) {
		this.msg = msg;
	}
}
